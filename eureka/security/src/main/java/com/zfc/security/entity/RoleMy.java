package com.zfc.security.entity;

import org.springframework.security.core.GrantedAuthority;

public class RoleMy implements GrantedAuthority {
    private String roleName;

    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public String getAuthority() {
        return "ROLE_"+roleName;
    }

    @Override
    public String toString() {
        return roleName;
    }
}
