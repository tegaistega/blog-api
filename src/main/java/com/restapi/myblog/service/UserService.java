package com.restapi.myblog.service;

import com.restapi.myblog.model.user.User;
import com.restapi.myblog.payload.UserIdentityAvailability;
import com.restapi.myblog.payload.UserProfile;
import com.restapi.myblog.payload.UserSummary;
import com.restapi.myblog.payload.requests.InfoRequest;
import com.restapi.myblog.payload.response.ApiResponse;
import com.restapi.myblog.security.UserPrincipal;

public interface UserService {

    UserSummary getCurrentUser(UserPrincipal currentUser);

    UserIdentityAvailability checkUsernameAvailability(String username);

    UserIdentityAvailability checkEmailAvailability(String email);

    UserProfile getUserProfile(String username);

    User addUser(User user);

    User updateUser(User newUser, String username, UserPrincipal currentUser);

    ApiResponse deleteUser(String username, UserPrincipal currentUser);

    ApiResponse giveAdmin(String username);

    ApiResponse removeAdmin(String username);

    UserProfile setOrUpdateInfo(UserPrincipal currentUser, InfoRequest infoRequest);

}
