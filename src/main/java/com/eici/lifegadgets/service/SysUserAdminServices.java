package com.eici.lifegadgets.service;

import com.eici.lifegadgets.model.SysUserAdmin;

import java.util.List;

public interface SysUserAdminServices {

    SysUserAdmin getUserByAccountPass(String acc, String pass);

    public List<SysUserAdmin> getUserList(String startTime, String endTime, String isRozen, String customerType, String isDelete);

}
