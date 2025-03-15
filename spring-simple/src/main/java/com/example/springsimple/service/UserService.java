package com.example.springsimple.service;

import com.example.springsimple.model.UserInfoModel;
import lombok.extern.log4j.Log4j;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class UserService {

    private final List<UserInfoModel> users = new ArrayList<>();

    public List<UserInfoModel> addUsers(List<UserInfoModel> request) {
        users.addAll(request);
        return users;
    }

    public List<UserInfoModel> getAllUsers() {
        return users;
    }

    public UserInfoModel getUserById(String userId) {
        for (UserInfoModel user : users) {
            if (String.valueOf(user.getId()).equals(userId)) {
                return user;
            }
        }
        return null;
    }

    public UserInfoModel updateUser(String userId, UserInfoModel request) {
        for (UserInfoModel user : users) {
            if (String.valueOf(user.getId()).equals(userId)) {
                user.setName(request.getName());
                user.setUsername(request.getUsername());
                user.setEmail(request.getEmail());
                user.setPhone(request.getPhone());
                user.setWebsite(request.getWebsite());
                user.setAddress(request.getAddress());
                user.setCompany(request.getCompany());

                return user;
            }
        }
        return null;

    }

    public void deleteUser(String userId) {
        users.removeIf(user -> String.valueOf(user.getId()).equals(userId));
    }
}
