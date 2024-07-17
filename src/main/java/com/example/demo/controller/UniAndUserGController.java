package com.example.demo.controller;

import com.example.demo.models.SQD;
import com.example.demo.models.Uni;
import com.example.demo.models.User;
import com.example.demo.models.UserInfo;
import com.example.demo.repo.SQDRepo;
import com.example.demo.repo.UniRepo;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequiredArgsConstructor
public class UniAndUserGController {
    private final UniRepo uniRepo;
    private final SQDRepo sqdRepo;

    @PostMapping("/admin/uni/create")
    public String createUni(@RequestParam String name, Model model){
        Uni uni  = new Uni();
        uni.setName(name);
        uniRepo.save(uni);
        return "redirect:/admin/uni";
    }

    @GetMapping("/admin/uni")
    public String uni(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("user", user);
        return "uni";
    }

    @PostMapping("/admin/group/create")
    public String createGroup(@RequestParam String name, @RequestParam String uni, Model model){
        SQD sqd  = new SQD();
        sqd.setName(name);
        sqd.setUni(uni);
        sqdRepo.save(sqd);
        return "redirect:/admin/group";
    }

    @GetMapping("/admin/group")
    public String group(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("user", user);
        return "sqd";
    }
}
