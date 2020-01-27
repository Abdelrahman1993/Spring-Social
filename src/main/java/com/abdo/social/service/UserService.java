package com.abdo.social.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.abdo.social.entity.User;

public interface UserService extends UserDetailsService {

    User findByUserName(String userName);

    void save(CrmUser crmUser);
}
