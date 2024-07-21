package com.example.demo.controller;

import com.example.demo.models.User;
import com.example.demo.models.UserInfo;
import com.example.demo.repo.SQDRepo;
import com.example.demo.repo.UniRepo;
import com.example.demo.repo.UserInfoRepo;
import com.example.demo.repo.UserRepo;
import com.example.demo.service.UserService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequiredArgsConstructor
public class UserController {
    private final UserService userService;
    private final UserRepo userRepo;
    private final UserInfoRepo userInfoRepo;
    private final UniRepo uniRepo;
    private final SQDRepo sqdRepo;

    @GetMapping("/login")
    public String login() {
        return "log";
    }

    @GetMapping("/registration")
    public String registration() {
        return "reg";
    }

    @PostMapping("/registration")
    public String createUser(User user) {
        userService.saveUser(user);
        return "redirect:/login";
    }

    @GetMapping("/office")
    public String office(@AuthenticationPrincipal User user, Model model){
        model.addAttribute("user", user);
        UserInfo userInfo = userInfoRepo.findUserInfoById(user.getUserinfoid());
        model.addAttribute("info", userInfo);
        model.addAttribute("unis", uniRepo.findAll());
        model.addAttribute("userGs", sqdRepo.findSQDSByUni(userInfo.getUni()));
        return "profile";
    }

    @PostMapping("/office/uni/{id}")
    public String officeUni(@AuthenticationPrincipal User user, @PathVariable Long id, @RequestParam String uni){
        UserInfo userInfo = userInfoRepo.findUserInfoById(user.getUserinfoid());
        System.out.println(userInfo);
        userInfo.setUni(uni);
        userInfoRepo.save(userInfo);

        return "redirect:/office";
    }

    @PostMapping("/office/group/{id}")
    public String officeGroup(@AuthenticationPrincipal User user, @PathVariable Long id, @RequestParam String userG){
//        User user = userRepo.findById(id).orElse(null);
        if(userG != null && !userG.isEmpty()){
//            assert user != null;
            UserInfo userInfo = userInfoRepo.findUserInfoById(user.getUserinfoid());
            userInfo.setUserG(userG);
            userInfoRepo.save(userInfo);
        }
        return "redirect:/office";
    }
}
