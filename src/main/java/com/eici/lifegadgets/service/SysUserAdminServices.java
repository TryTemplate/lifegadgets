package com.eici.lifegadgets.service;

import com.eici.lifegadgets.model.SysUserAdmin;

import java.util.List;

public interface SysUserAdminServices {

    SysUserAdmin getUserByAccountPass(String acc, String pass, String accType);

    List<SysUserAdmin> getUserList(String startTime, String endTime, String isRozen, String customerType, String isDelete);

    Integer addUser(SysUserAdmin user);

}
