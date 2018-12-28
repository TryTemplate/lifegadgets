package com.eici.lifegadgets.controller;

import com.eici.lifegadgets.common.ResultBean;
import com.eici.lifegadgets.model.SysUserAdmin;
import com.eici.lifegadgets.redis.RedisHelperImpl;
import com.eici.lifegadgets.service.SysUserAdminServices;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import lombok.extern.slf4j.Slf4j;
import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpSession;
import java.util.List;

@Api(tags = "【其他】【趣闲】")
@RestController
@RequestMapping("crpt")
@Slf4j
/**
 * @author ljg
 */
public class OriginalityController {

    private Logger LOG = Logger.getLogger(OriginalityController.class);

    @Autowired
    private RedisHelperImpl redisHelper;

    @Autowired
    HttpSession session;

    @Autowired
    SysUserAdminServices sysUserAdminServices;

    @ApiOperation(value = "点一下看")
    @PostMapping("tryClickLook.htm")
    public ResultBean<String> tryClickLook() {

        redisHelper.valuePut("How are you like?", "you!");

        System.out.println("-----  " + "redisHelper.valuePut(\"How are you like?\", \"you!\");");

        return new ResultBean("How are you like?").setRetCode(0).setRetInfo("成功");
    }


    @ApiOperation(value = "How are you like?")
    @PostMapping("getAnswer.htm")
    public ResultBean<String> getAnswer() {

        System.out.println("-----  " + redisHelper.getValue("How are you like?"));

        String ret_data = (String) redisHelper.getValue("How are you like?");
        redisHelper.remove("How are you like?");

        return new ResultBean(redisHelper.getValue(ret_data)).setRetCode(0).setRetInfo("成功");

    }
}
