package com.hackerearth.service;

import com.hackerearth.domain.User;

public interface UserService {

    User findByEmailId(String emailId);

    User saveUser(User user);

}
