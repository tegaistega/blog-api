package com.restapi.myblog.repository;

import com.restapi.myblog.model.user.User;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.data.jpa.JpaRepositoriesAutoConfiguration;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
@EnableAutoConfiguration(exclude = {
        JpaRepositoriesAutoConfiguration.class
})
public interface UserRepository extends JpaRepository<User, Long> {

}
