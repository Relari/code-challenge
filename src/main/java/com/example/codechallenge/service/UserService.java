package com.example.codechallenge.service;

import com.example.codechallenge.model.api.UserRequest;
import com.example.codechallenge.model.api.UserResponse;

import java.util.List;

public interface UserService {

    void save(UserRequest request);
    List<UserResponse> users();
    UserResponse find(String type, String value);

}
