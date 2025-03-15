package com.example.springsimple.model;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class CompanyModel {

    private String name;
    private String catchPhrase;
    private String bs;
}
