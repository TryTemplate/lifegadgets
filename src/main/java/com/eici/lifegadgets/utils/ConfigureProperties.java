package com.eici.lifegadgets.utils;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

/**
 * @author liujingguang
 */
@Component
@PropertySource(value = {"classpath:configure-pro.properties"})
public class ConfigureProperties {

    public static String swaggerHost;
    public static String swaggerTestHost;
    public static Integer interfaceType;
    public static Integer isTest;
    public static String loginUser;
    public static boolean isShowSwaggerUi;


    @Value("${swagger_host}")
    public void setSwaggerHost(String swaggerHost) {
        this.swaggerHost = swaggerHost;
    }

    @Value("${swagger_test_host}")
    public void setSwaggerTestHost(String swaggerTestHost) {
        this.swaggerTestHost = swaggerTestHost;
    }

    @Value("${interface_type}")
    public void setInterfaceType(Integer interfaceType) {
        this.interfaceType = interfaceType;
    }

    @Value("${is_test}")
    public void setIsTest(Integer isTest) {
        this.isTest = isTest;
    }

    @Value("${loginUser}")
    public void setLoginUser(String loginUser) {
        this.loginUser = loginUser;
    }

    @Value("${is_show_swagger_ui}")
    public void setIsShowSwaggerUi(boolean isShowSwaggerUi) {
        this.isShowSwaggerUi = isShowSwaggerUi;
    }
}
