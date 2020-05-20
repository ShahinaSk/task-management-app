package com.hackerearth.service;

import com.hackerearth.domain.User;
import com.hackerearth.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheConfig;

import org.springframework.stereotype.Service;

import java.util.Optional;

@CacheConfig(cacheNames = {"user"})
@Service
public class UserServiceImpl implements UserService {

    UserRepository userRepository;

    @Autowired
    public UserServiceImpl(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public User findByEmailId(String emailId) {

        Optional optional = userRepository.findById(emailId);
        User user = null;

        if (optional.isPresent()) {
            user = (User) optional.get();
        }
        return user;
    }

    @Override
    public User saveUser(User user) {
        //savedUser stores user object
        return userRepository.save(user);
    }


}