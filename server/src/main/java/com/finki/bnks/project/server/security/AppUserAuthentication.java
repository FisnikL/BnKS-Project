package com.finki.bnks.project.server.security;

import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

import java.util.Collection;

public class AppUserAuthentication implements Authentication {

    private static final long serialVersionUID = 1L;

    private final AppUserDetail userDetail;

    public AppUserAuthentication(AppUserDetail userDetail) {
        this.userDetail = userDetail;
    }

    @Override
    public String getName() {
        return this.userDetail.getUsername();
    }

    @Override
    public Collection<? extends GrantedAuthority> getAuthorities() {
        return this.userDetail.getAuthorities();
    }

    @Override
    public Object getCredentials() {
        return null;
    }

    @Override
    public Object getDetails() {
        return null;
    }

    @Override
    public Object getPrincipal() {
        return this.userDetail;
    }

    @Override
    public boolean isAuthenticated() {
        return true;
    }

    @Override
    public void setAuthenticated(boolean b) throws IllegalArgumentException {
        throw new UnsupportedOperationException("this authentication object is always authenticated");
    }


}
