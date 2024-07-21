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
    public String createUni(@RequestParam String name, @RequestParam String l1, @RequestParam String l2, @RequestParam String l3, @RequestParam String l4, @RequestParam String l5, @RequestParam String l6, @RequestParam String l7, @RequestParam String l8, Model model){
        Uni uni  = new Uni();
        uni.setName(name);
        uni.setTime_lesson1(l1);
        uni.setTime_lesson2(l2);
        uni.setTime_lesson3(l3);
        uni.setTime_lesson4(l4);
        uni.setTime_lesson5(l5);
        uni.setTime_lesson6(l6);
        uni.setTime_lesson7(l7);
        uni.setTime_lesson8(l8);

        uniRepo.save(uni);
        return "redirect:/admin/uni";
    }

    @GetMapping("/add-university")
    public String uni(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("user", user);
        return "add-university-2";
    }

    @PostMapping("/admin/group/create")
    public String createGroup(@RequestParam String name, @RequestParam String uni, Model model){
        SQD sqd  = new SQD();
        sqd.setName(name);
        sqd.setUni(uni);
        sqdRepo.save(sqd);
        return "redirect:/add-group";
    }

    @GetMapping("/add-group")
    public String group(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("user", user);
        model.addAttribute("unis", uniRepo.findAll());
        return "add-group";
    }
}
