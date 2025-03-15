package com.example.springsimple.model;

import jakarta.validation.constraints.NotBlank;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GeoModel {

    @NotBlank(message = "lat cannot be blank")
    private String lat;
    @NotBlank(message = "lng cannot be blank")
    private String lng;

}
