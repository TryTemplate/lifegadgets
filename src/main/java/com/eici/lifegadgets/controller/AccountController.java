package com.eici.lifegadgets.controller;

import com.eici.lifegadgets.common.Constants;
import com.eici.lifegadgets.common.ResultBean;
import com.eici.lifegadgets.model.SysUserAdmin;
import com.eici.lifegadgets.redis.RedisHelperImpl;
import com.eici.lifegadgets.service.SysUserAdminServices;
import com.eici.lifegadgets.utils.ConfigureProperties;
import com.eici.lifegadgets.utils.GetClientIpUtils;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.List;

@Api(tags = "【公共】【用户/账号管理】")
@RestController
@RequestMapping("user")
@Slf4j
/**
 * @author ljg
 */
public class AccountController {

    private Logger LOG = org.apache.log4j.Logger.getLogger(AccountController.class);

    @Autowired
    private RedisHelperImpl redisHelper;

    @Autowired
    HttpSession session;

    @Autowired
    SysUserAdminServices sysUserAdminServices;

    @ApiOperation(value = "用户名密码登录")
    @PostMapping("loginByPassword.htm")
    public ResultBean<SysUserAdmin> loginByPassword(
            @ApiParam(name = "account", value = "账号", required = true) @RequestParam(value = "account", required = true) String account,
            @ApiParam(name = "password", value = "密码", required = true) @RequestParam(value = "password", required = true) String password,
            @ApiParam(name = "accType", value = "账号类型 1.用户 2.后台管理", required = false) @RequestParam(value = "accType", defaultValue = "1", required = false) String accType
    ) {

        SysUserAdmin user = sysUserAdminServices.getUserByAccountPass(account, password, accType);

        session.setAttribute(ConfigureProperties.loginUser, user);

        if (user == null) {
            return new ResultBean(user).setRetCode(Constants.RET_CODE.FAIL).setRetInfo("用户名或密码错误");
        } else if ("1".equals(user.getIsRozen())) {
            return new ResultBean(user.getRozenReason()).setRetCode(Constants.RET_CODE.FAIL).setRetInfo("用户被冻结");
        }

        return new ResultBean(user).setRetCode(Constants.RET_CODE.SUCCESS).setRetInfo("成功");
    }


    @ApiOperation(value = "获取所有用户/账号信息")
    @PostMapping("getUserList.htm")
    public ResultBean<PageInfo<SysUserAdmin>> loginByPassword(
            @ApiParam(name = "startTime", value = "注册时间区间-开始", required = false) @RequestParam(value = "startTime", required = false) String startTime,
            @ApiParam(name = "endTime", value = "注册时间区间-结束", required = false) @RequestParam(value = "endTime", required = false) String endTime,
            @ApiParam(name = "isRozen", value = "是否冻结 0.正常 1.冻结", required = false) @RequestParam(value = "isRozen", required = false) String isRozen,
            @ApiParam(name = "customerType", value = "账号类型 1.用户 1.后台管理员", required = false) @RequestParam(value = "customerType", required = false) String customerType,
            @ApiParam(name = "isDelete", value = "是否删除", required = false) @RequestParam(value = "isDelete", required = false, defaultValue = "0") String isDelete,

            @ApiParam(name = "pageSize", value = "页面大小", required = true) @RequestParam(value = "pageSize", required = true, defaultValue = "10") Integer pageSize,
            @ApiParam(name = "pageNum", value = "页码数", required = true) @RequestParam(value = "pageNum", required = true, defaultValue = "1") Integer pageNum,
            HttpSession session, HttpServletRequest request
            ) {

        LOG.info("------------------- request ip:\t"+ GetClientIpUtils.getIp(request));

        PageHelper.startPage(pageNum, pageSize);


        SysUserAdmin user = (SysUserAdmin) session.getAttribute(ConfigureProperties.loginUser);

        if (user==null){
            return new ResultBean(new PageInfo<>()).setRetCode(Constants.RET_CODE.FAIL).setRetInfo("请登录");
        }

        List<SysUserAdmin> users = sysUserAdminServices.getUserList(startTime, endTime, isRozen, customerType, isDelete);

        PageInfo<SysUserAdmin> pageUser = new PageInfo<>(users, 5);

        return new ResultBean<>(pageUser).setRetCode(Constants.RET_CODE.SUCCESS).setRetInfo("成功");

    }
}
