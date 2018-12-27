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

    public SysUserAdmin getUserByAccountPass(String acc, String pass) {
        return sysUserAdminMapper.getUserByAccountPass(acc, pass);
    }

    public List<SysUserAdmin> getUserList(String startTime, String endTime, String isRozen, String customerType, String isDelete) {
        return sysUserAdminMapper.getUserList(startTime, endTime, isRozen, customerType, isDelete);
    }
}
