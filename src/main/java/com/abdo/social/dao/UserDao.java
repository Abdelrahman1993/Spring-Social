package com.abdo.social.dao;

import com.abdo.social.entity.User;

public interface UserDao {

    User findByUserName(String userName);
    
    void save(User user);
    
}
