package com.restapi.myblog.payload;

import com.restapi.myblog.model.user.Address;
import com.restapi.myblog.model.user.Company;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.Instant;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class UserProfile {

    private Long id;
    private String username;
    private String firstname;
    private String lastname;
    private Instant joineAt;
    private String email;
    private Address address;
    private String phonenumber;
    private String website;
    private Company company;
    private Long postCount;
}
