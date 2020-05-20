package com.hackerearth.jwt;

import com.hackerearth.domain.User;

import java.util.Map;

@FunctionalInterface
public interface SecurityTokenGenerator
{

    Map<String, String> generateToken(User user);
}
