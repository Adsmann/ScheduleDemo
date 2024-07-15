package com.example.demo.repo;

import com.example.demo.models.Subject;
import com.example.demo.models.User;
import com.example.demo.models.UserInfo;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserInfoRepo extends JpaRepository<UserInfo, Long> {
    UserInfo findUserInfoById(Long id);
}
