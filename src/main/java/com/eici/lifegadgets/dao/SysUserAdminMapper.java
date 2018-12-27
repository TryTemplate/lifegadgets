package com.eici.lifegadgets.dao;

import com.eici.lifegadgets.model.SysUserAdmin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Component
public interface SysUserAdminMapper extends Mapper<SysUserAdmin> {

    SysUserAdmin getUserByAccountPass(@Param("account") String acc, @Param("password") String pass);

    List<SysUserAdmin> getUserList(@Param("startTime") String startTime, @Param("endTime") String endTime, @Param("isRozen") String isRozen, @Param("customerType") String customerType, @Param("isDelete") String isDelete);

}