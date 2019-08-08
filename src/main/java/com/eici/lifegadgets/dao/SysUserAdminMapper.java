package com.eici.lifegadgets.dao;

import com.eici.lifegadgets.model.SysUserAdmin;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;
import tk.mybatis.mapper.common.Mapper;

import java.util.List;

@Component
public interface SysUserAdminMapper extends Mapper<SysUserAdmin> {

    /**
     * 账号密码查询一条记录
     *
     * @param acc
     * @param pass
     * @return
     */
    SysUserAdmin getUserByAccountPass(@Param("account") String acc, @Param("password") String pass, @Param("customerType") String accType);

    /**
     * 多条件查询集合
     *
     * @param startTime
     * @param endTime
     * @param isRozen
     * @param customerType
     * @param isDelete
     * @return
     */
    List<SysUserAdmin> getUserList(@Param("startTime") String startTime, @Param("endTime") String endTime, @Param("isRozen") String isRozen, @Param("customerType") String customerType, @Param("isDelete") String isDelete);

}