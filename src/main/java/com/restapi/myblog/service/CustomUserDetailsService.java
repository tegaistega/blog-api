package com.restapi.myblog.service;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public interface CustomUserDetailsService {

    UserDetails loadUserByUsername(String usenrameOrEmail) throws UsernameNotFoundException;

    UserDetails loadUserById(Long userid);
}
