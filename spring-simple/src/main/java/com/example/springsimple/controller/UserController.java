package com.example.springsimple.controller;

import com.example.springsimple.model.UserInfoModel;
import com.example.springsimple.service.UserService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public ResponseEntity<?> getUser() {
        var userList = userService.getAllUsers();
        if (userList.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("User list not found");
        } else {
            return ResponseEntity.ok(userList);
        }
    }

    @GetMapping("/users/{userId}")
    public ResponseEntity<?> getUsersByUserUd(@PathVariable String userId) {
        var user = userService.getUserById(userId);
        if (null == user) {
            return ResponseEntity.status(HttpStatus.NO_CONTENT).body("User ID:" + userId + " not found");
        } else {
            return ResponseEntity.ok(user);
        }
    }

    @PostMapping("/user")
    public ResponseEntity<?> createUser(@Valid @RequestBody List<UserInfoModel> request) {
        return ResponseEntity.ok(userService.addUsers(request));
    }

    @PutMapping("/user/{userId}")
    public ResponseEntity<?> updateUser(@PathVariable String userId, @RequestBody UserInfoModel request) {
        var user = userService.updateUser(userId, request);
        if (null == user) {
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body("User ID:" + userId + " not found");
        } else {
            return ResponseEntity.ok(user);
        }
    }

    @DeleteMapping("/user/{userId}")
    public ResponseEntity<?> deleteUser(@PathVariable String userId) {
        userService.deleteUser(userId);
        return ResponseEntity.ok("User deleted successfully");
    }

}
