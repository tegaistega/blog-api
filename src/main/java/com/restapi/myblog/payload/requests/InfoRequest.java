package com.restapi.myblog.payload.requests;

import lombok.Data;

import javax.validation.constraints.NotBlank;

@Data
public class InfoRequest {

    @NotBlank
    private String street;

    @NotBlank
    private String city;

    @NotBlank
    private String zipcode;

    private String companyName;

    private String companyCatchPhrase;

    private String companyWebsite;

    private String phoneNumber;

    private String latittude;

    private String longitude;
}
