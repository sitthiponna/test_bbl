package com.example.springsimple.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotEmpty;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;


@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class UserInfoModel {

    @NotNull(message = "id cannot be null")
    private Integer id;
    @NotBlank(message = "name cannot be blank")
    private String name;
    @NotBlank(message = "username cannot be blank")
    private String username;
    @NotBlank(message = "email cannot be blank")
    private String email;
    @NotBlank(message = "phone cannot be blank")
    private String phone;
    @NotBlank(message = "website cannot be blank")
    private String website;

    private @Valid AddressModel address;
    private @Valid CompanyModel company;

}
