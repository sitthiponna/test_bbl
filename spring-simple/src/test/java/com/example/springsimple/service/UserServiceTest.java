package com.example.springsimple.service;

import com.example.springsimple.model.AddressModel;
import com.example.springsimple.model.CompanyModel;
import com.example.springsimple.model.GeoModel;
import com.example.springsimple.model.UserInfoModel;
import jakarta.validation.Valid;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNull;

@ExtendWith(MockitoExtension.class)
class UserServiceTest {

    @InjectMocks
    UserService userService;

    @Test
    @DisplayName("Test addUsers")
    void barTest() {
        @Valid GeoModel geo = GeoModel.builder()
                .lat("-37.3159")
                .lng("81.1496")
                .build();
        @Valid AddressModel address = AddressModel.builder()
                .street("123 Main St")
                .suite("Apt. 123")
                .city("New York")
                .zipcode("12345")
                .geo(geo)
                .build();
        @Valid CompanyModel company = CompanyModel.builder()
                .name("ABC Company")
                .catchPhrase("Catch Phrase")
                .bs("BS")
                .build();
        List<UserInfoModel> userList = new ArrayList<>(Collections.singletonList(UserInfoModel.builder()
                .id(1)
                .name("John Doe")
                .username("johndoe")
                .email("")
                .phone("1234567890")
                .website("https://johndoe.com")
                .address(address)
                .company(company)
                .build()));
        userService.addUsers(userList);
        assertEquals(userService.addUsers(userList), userService.addUsers(userList));
    }

    @Test
    @DisplayName("Test getAllUsers")
    void getAllUsersTest() {
        @Valid GeoModel geo = GeoModel.builder()
                .lat("-37.3159")
                .lng("81.1496")
                .build();
        @Valid AddressModel address = AddressModel.builder()
                .street("123 Main St")
                .suite("Apt. 123")
                .city("New York")
                .zipcode("12345")
                .geo(geo)
                .build();
        @Valid CompanyModel company = CompanyModel.builder()
                .name("ABC Company")
                .catchPhrase("Catch Phrase")
                .bs("BS")
                .build();
        List<UserInfoModel> userList = new ArrayList<>(Collections.singletonList(UserInfoModel.builder()
                .id(1)
                .name("John Doe")
                .username("johndoe")
                .email("")
                .phone("1234567890")
                .website("https://johndoe.com")
                .address(address)
                .company(company)
                .build()));
        userService.addUsers(userList);
        assertEquals(userList, userService.getAllUsers());
    }

    @Test
    @DisplayName("Test getUserById found user")
    void getUserByIdFoundUserTest() {
        @Valid GeoModel geo = GeoModel.builder()
                .lat("-37.3159")
                .lng("81.1496")
                .build();
        @Valid AddressModel address = AddressModel.builder()
                .street("123 Main St")
                .suite("Apt. 123")
                .city("New York")
                .zipcode("12345")
                .geo(geo)
                .build();
        @Valid CompanyModel company = CompanyModel.builder()
                .name("ABC Company")
                .catchPhrase("Catch Phrase")
                .bs("BS")
                .build();
        List<UserInfoModel> userList = new ArrayList<>(Collections.singletonList(UserInfoModel.builder()
                .id(1)
                .name("John Doe")
                .username("johndoe")
                .email("")
                .phone("1234567890")
                .website("https://johndoe.com")
                .address(address)
                .company(company)
                .build()));
        userService.addUsers(userList);
        assertEquals(1, userService.getUserById("1").getId());
    }

    @Test
    @DisplayName("Test getUserById not found user")
    void getUserByIdNotFoundUserTest() {
        @Valid GeoModel geo = GeoModel.builder()
                .lat("-37.3159")
                .lng("81.1496")
                .build();
        @Valid AddressModel address = AddressModel.builder()
                .street("123 Main St")
                .suite("Apt. 123")
                .city("New York")
                .zipcode("12345")
                .geo(geo)
                .build();
        @Valid CompanyModel company = CompanyModel.builder()
                .name("ABC Company")
                .catchPhrase("Catch Phrase")
                .bs("BS")
                .build();
        List<UserInfoModel> userList = new ArrayList<>(Collections.singletonList(UserInfoModel.builder()
                .id(2)
                .name("John Doe")
                .username("johndoe")
                .email("")
                .phone("1234567890")
                .website("https://johndoe.com")
                .address(address)
                .company(company)
                .build()));
        userService.addUsers(userList);
        assertNull(userService.getUserById("1"));
    }

    @Test
    @DisplayName("Test updateUser FoundUser")
    void updateUserFoundUserTest() {
        @Valid GeoModel geo = GeoModel.builder()
                .lat("-37.3159")
                .lng("81.1496")
                .build();
        @Valid AddressModel address = AddressModel.builder()
                .street("123 Main St")
                .suite("Apt. 123")
                .city("New York")
                .zipcode("12345")
                .geo(geo)
                .build();
        @Valid CompanyModel company = CompanyModel.builder()
                .name("ABC Company")
                .catchPhrase("Catch Phrase")
                .bs("BS")
                .build();
        List<UserInfoModel> userList = new ArrayList<>(Collections.singletonList(UserInfoModel.builder()
                .id(1)
                .name("John Doe")
                .username("johndoe")
                .email("")
                .phone("1234567890")
                .website("https://johndoe.com")
                .address(address)
                .company(company)
                .build()));
        userService.addUsers(userList);
        UserInfoModel user = UserInfoModel.builder()
                .id(1)
                .name("Jane Doe")
                .username("janedoe")
                .email("")
                .phone("0987654321")
                .website("https://janedoe.com")
                .address(address)
                .company(company)
                .build();
        assertEquals(user, userService.updateUser("1", user));
    }

    @Test
    @DisplayName("Test updateUser Not FoundUser")
    void updateUserNotFoundUserTest() {
        @Valid GeoModel geo = GeoModel.builder()
                .lat("-37.3159")
                .lng("81.1496")
                .build();
        @Valid AddressModel address = AddressModel.builder()
                .street("123 Main St")
                .suite("Apt. 123")
                .city("New York")
                .zipcode("12345")
                .geo(geo)
                .build();
        @Valid CompanyModel company = CompanyModel.builder()
                .name("ABC Company")
                .catchPhrase("Catch Phrase")
                .bs("BS")
                .build();
        List<UserInfoModel> userList = new ArrayList<>(Collections.singletonList(UserInfoModel.builder()
                .id(2)
                .name("John Doe")
                .username("johndoe")
                .email("")
                .phone("1234567890")
                .website("https://johndoe.com")
                .address(address)
                .company(company)
                .build()));
        userService.addUsers(userList);
        UserInfoModel user = UserInfoModel.builder()
                .id(1)
                .name("Jane Doe")
                .username("janedoe")
                .email("")
                .phone("0987654321")
                .website("https://janedoe.com")
                .address(address)
                .company(company)
                .build();
        assertNull(userService.updateUser("1", user));
    }

    @Test
    @DisplayName("Test deleteUser")
    void deleteUserTest() {
        @Valid GeoModel geo = GeoModel.builder()
                .lat("-37.3159")
                .lng("81.1496")
                .build();
        @Valid AddressModel address = AddressModel.builder()
                .street("123 Main St")
                .suite("Apt. 123")
                .city("New York")
                .zipcode("12345")
                .geo(geo)
                .build();
        @Valid CompanyModel company = CompanyModel.builder()
                .name("ABC Company")
                .catchPhrase("Catch Phrase")
                .bs("BS")
                .build();
        List<UserInfoModel> userList = new ArrayList<>(Collections.singletonList(UserInfoModel.builder()
                .id(1)
                .name("John Doe")
                .username("johndoe")
                .email("")
                .phone("1234567890")
                .website("https://johndoe.com")
                .address(address)
                .company(company)
                .build()));
        userService.addUsers(userList);
        userService.deleteUser("1");
        assertEquals(0, userService.getAllUsers().size());
    }
}