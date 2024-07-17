package com.example.demo.service;

import com.example.demo.models.User;
import com.example.demo.models.UserInfo;
import com.example.demo.models.enums.Role;
import com.example.demo.repo.UserInfoRepo;
import com.example.demo.repo.UserRepo;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

@Service
@Slf4j
@RequiredArgsConstructor
public class UserService {
    private final UserRepo userRepository;
    private final PasswordEncoder passwordEncoder;
    private final UserInfoRepo userInfoRepo;

    public void saveUser(User user) {
        if(userRepository.findByUsername(user.getUsername()) != null) return;
        user.getRoles().add(Role.ROLE_USER);
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        UserInfo userInfo = new UserInfo();
        userInfo.setUserG("Не выбрана");
        userInfo.setUni("Не выбран");
        userInfoRepo.save(userInfo);
        user.setUserInfo(userInfo);
        user.setUserinfoid(userInfo.getId());
        userRepository.save(user);
    }

}
