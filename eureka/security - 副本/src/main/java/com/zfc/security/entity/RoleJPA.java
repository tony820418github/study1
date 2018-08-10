package com.zfc.security.entity;

import org.springframework.security.core.GrantedAuthority;




public class RoleJPA implements GrantedAuthority {
 //   @Id
 //   @GeneratedValue(strategy=GenerationType.IDENTITY)
    private Long id;

  //  @Column(nullable = false)
    private String name;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String getAuthority() {
        return name;
    }

    @Override
    public String toString() {
        return name;
    }
}
