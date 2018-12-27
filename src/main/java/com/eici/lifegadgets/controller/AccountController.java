package com.eici.lifegadgets.controller;

import com.eici.lifegadgets.common.ResultBean;
import com.eici.lifegadgets.dto.Author;
import com.eici.lifegadgets.model.SysUserAdmin;
import com.eici.lifegadgets.redis.RedisHelperImpl;
import com.eici.lifegadgets.service.SysUserAdminServices;
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
            @ApiParam(name = "account", value = "账号", required = false) @RequestParam(value = "account", required = false) String account,
            @ApiParam(name = "password", value = "密码", required = false) @RequestParam(value = "password", required = false) String password,
            @ApiParam(name = "accType", value = "账号类型", required = false) @RequestParam(value = "accType", required = false) String accType
    ) {

        redisHelper.valuePut("How are you like?", "you!");

        Author author = (Author) session.getAttribute("user");

        System.out.println("-----  " + "How are you like?");
        System.out.println("-----  " + redisHelper.getValue("How are you like?"));

        SysUserAdmin user = sysUserAdminServices.getUserByAccountPass(account, password);

        if (user == null) {
            return new ResultBean(user).setRetCode(1).setRetInfo("用户名或密码错误");
        } else if ("1".equals(user.getIsRozen())) {
            return new ResultBean(user.getRozenReason()).setRetCode(1).setRetInfo("用户被冻结");
        }

        return new ResultBean(user).setRetCode(0).setRetInfo("成功");
    }


    @ApiOperation(value = "获取所有用户/账号信息")
    @PostMapping("getUserList.htm")
    public ResultBean<List<SysUserAdmin>> loginByPassword(
            @ApiParam(name = "startTime", value = "开始注册时间", required = false) @RequestParam(value = "startTime", required = false) String startTime,
            @ApiParam(name = "endTime", value = "结束注册时间", required = false) @RequestParam(value = "endTime", required = false) String endTime,
            @ApiParam(name = "isRozen", value = "是否冻结 0.正常 1.冻结", required = false) @RequestParam(value = "isRozen", required = false) String isRozen,
            @ApiParam(name = "customerType", value = "账号类型 1.用户 1.后台管理员", required = false) @RequestParam(value = "customerType", required = false) String customerType,
            @ApiParam(name = "isDelete", value = "是否删除", required = false) @RequestParam(value = "isDelete", required = false, defaultValue = "0") String isDelete
    ) {

        List<SysUserAdmin> users = sysUserAdminServices.getUserList(startTime, endTime, isRozen, customerType, isDelete);

        return new ResultBean(users).setRetCode(0).setRetInfo("成功");

    }
}
