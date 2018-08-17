package com.sh.zfc.mybatisfirst.entity;

import java.util.List;

public class Role {
    private int roleId;
    private String roleName;
    private List<User> userLists;

    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    public List<User> getUserLists() {
        return userLists;
    }

    public void setUserLists(List<User> userLists) {
        this.userLists = userLists;
    }
}
