package com.abdo.social.service;

import org.springframework.security.core.userdetails.UserDetailsService;

import com.abdo.social.entity.User;
import com.abdo.social.user.CrmUser;

public interface UserService extends UserDetailsService {

    User findByUserName(String userName);

    void save(CrmUser crmUser);
}
