package com.eici.lifegadgets.service;

import com.eici.lifegadgets.dao.SysUserAdminMapper;
import com.eici.lifegadgets.model.SysUserAdmin;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class SysUserAdminServicesImpl implements SysUserAdminServices {

    @Autowired
    private SysUserAdminMapper sysUserAdminMapper;

    /**
     * 账号秘密登录
     *
     * @param acc
     * @param pass
     * @return
     */
    public SysUserAdmin getUserByAccountPass(String acc, String pass) {
        return sysUserAdminMapper.getUserByAccountPass(acc, pass);
    }

    /**
     * 条件查询所有用户/账号列表
     *
     * @param startTime
     * @param endTime
     * @param isRozen
     * @param customerType
     * @param isDelete
     * @return
     */
    public List<SysUserAdmin> getUserList(String startTime, String endTime, String isRozen, String customerType, String isDelete) {
        return sysUserAdminMapper.getUserList(startTime, endTime, isRozen, customerType, isDelete);
    }

    /**
     * 添加用户
     *
     * @param user
     * @return
     */
    public Integer addUser(SysUserAdmin user){
        Integer uplines = sysUserAdminMapper.insertSelective(user);
        return uplines;
    }
}
