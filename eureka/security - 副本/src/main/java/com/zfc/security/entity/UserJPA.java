package com.zfc.security.entity;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.userdetails.UserDetails;

import java.io.Serializable;
import java.util.Collection;
import java.util.List;


public class UserJPA implements UserDetails ,   Serializable {

//    @Id
//    @GeneratedValue(strategy=GenerationType.IDENTITY)
   private Long id;
//
//    @Column(nullable=false , unique = true)
    private String username;
//
//    @Column
    private String password;
//
//    @ManyToMany(cascade = CascadeType.ALL,fetch = FetchType.EAGER)
//    @JoinTable(name="user_role" , joinColumns = @JoinColumn(name="user_id" , referencedColumnName = "id"))
    private List<RoleJPA> authorities;

    public UserJPA() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return authorities;
    }

    @Override
    public String getPassword() {
        return password;
    }

    @Override
    public String getUsername() {
        return username;
    }

    @Override
    public boolean isAccountNonExpired() {
        return true;
    }

    @Override
    public boolean isAccountNonLocked() {
        return true;
    }

    @Override
    public boolean isCredentialsNonExpired() {
        return true;
    }

    @Override
    public boolean isEnabled() {
        return true;
    }
}
