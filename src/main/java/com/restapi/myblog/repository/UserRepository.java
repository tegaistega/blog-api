package com.restapi.myblog.repository;

import com.restapi.myblog.model.user.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Long> {


}
