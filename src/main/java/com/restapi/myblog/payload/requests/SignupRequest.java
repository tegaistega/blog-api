package com.restapi.myblog.payload.requests;

import lombok.Data;

import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;

@Data
public class SignupRequest {

    @NotBlank
    private String firstname;

    @NotBlank
    private String lastname;

    @NotBlank
    private String username;

    @NotBlank
    @Email
    private String email;

    @NotBlank
    private String password;


}
