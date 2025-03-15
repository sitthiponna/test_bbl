package com.example.springsimple.model;

import jakarta.validation.Valid;
import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class AddressModel {

    @NotBlank(message = "street cannot be blank")
    private String street;
    @NotBlank(message = "suite cannot be blank")
    private String suite;
    @NotBlank(message = "city cannot be blank")
    private String city;
    @NotBlank(message = "zipcode cannot be blank")
    private String zipcode;

    private @Valid GeoModel geo;
}
