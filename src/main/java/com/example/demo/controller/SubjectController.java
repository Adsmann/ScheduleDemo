package com.example.demo.controller;

import com.example.demo.models.DaySchedule;
import com.example.demo.models.Subject;
import com.example.demo.models.User;
import com.example.demo.models.UserInfo;
import com.example.demo.repo.*;
import com.example.demo.service.ScheduleService;
import lombok.RequiredArgsConstructor;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Arrays;
import java.util.List;
import java.util.Objects;

@Controller
@RequiredArgsConstructor
public class SubjectController {
    private final ScheduleService scheduleService;
    private final SubjectRepo subjectRepo;
    private final DayScheduleRepo dayScheduleRepo;
    private final UserInfoRepo userInfoRepo;
    private final SQDRepo sqdRepo;
    private final UniRepo uniRepo;


    @GetMapping("/")
    public String mainList(@AuthenticationPrincipal User user, Model model) {
        UserInfo userInfo = userInfoRepo.findUserInfoById(user.getUserinfoid());
        model.addAttribute("user", user);
        List<Subject> subjectList1 = new java.util.ArrayList<>(List.of());
        List<Subject> subjectList2 = new java.util.ArrayList<>(List.of());
        List<Subject> subjectList3 = new java.util.ArrayList<>(List.of());
        List<Subject> subjectList4 = new java.util.ArrayList<>(List.of());
        List<Subject> subjectList5 = new java.util.ArrayList<>(List.of());
        List<Subject> subjectList6 = new java.util.ArrayList<>(List.of());

        for(DaySchedule daySchedule : dayScheduleRepo.findDayScheduleByUserGAndUni(userInfo.getUserG(), userInfo.getUni())) {
            if(Objects.equals(daySchedule.getName(), "Понедельник")){
                subjectList1.add(subjectRepo.findSubjectById(daySchedule.getLesson1()));
                subjectList1.add(subjectRepo.findSubjectById(daySchedule.getLesson2()));
                subjectList1.add(subjectRepo.findSubjectById(daySchedule.getLesson3()));
                subjectList1.add(subjectRepo.findSubjectById(daySchedule.getLesson4()));
                subjectList1.add(subjectRepo.findSubjectById(daySchedule.getLesson5()));
                subjectList1.add(subjectRepo.findSubjectById(daySchedule.getLesson6()));
                subjectList1.add(subjectRepo.findSubjectById(daySchedule.getLesson7()));
                subjectList1.add(subjectRepo.findSubjectById(daySchedule.getLesson8()));
            }
            if(Objects.equals(daySchedule.getName(), "Вторник")){
                subjectList2.add(subjectRepo.findSubjectById(daySchedule.getLesson1()));
                subjectList2.add(subjectRepo.findSubjectById(daySchedule.getLesson2()));
                subjectList2.add(subjectRepo.findSubjectById(daySchedule.getLesson3()));
                subjectList2.add(subjectRepo.findSubjectById(daySchedule.getLesson4()));
                subjectList2.add(subjectRepo.findSubjectById(daySchedule.getLesson5()));
                subjectList2.add(subjectRepo.findSubjectById(daySchedule.getLesson6()));
                subjectList2.add(subjectRepo.findSubjectById(daySchedule.getLesson7()));
                subjectList2.add(subjectRepo.findSubjectById(daySchedule.getLesson8()));
            }
            if(Objects.equals(daySchedule.getName(), "Среда")){
                subjectList3.add(subjectRepo.findSubjectById(daySchedule.getLesson1()));
                subjectList3.add(subjectRepo.findSubjectById(daySchedule.getLesson2()));
                subjectList3.add(subjectRepo.findSubjectById(daySchedule.getLesson3()));
                subjectList3.add(subjectRepo.findSubjectById(daySchedule.getLesson4()));
                subjectList3.add(subjectRepo.findSubjectById(daySchedule.getLesson5()));
                subjectList3.add(subjectRepo.findSubjectById(daySchedule.getLesson6()));
                subjectList3.add(subjectRepo.findSubjectById(daySchedule.getLesson7()));
                subjectList3.add(subjectRepo.findSubjectById(daySchedule.getLesson8()));
            }
            if(Objects.equals(daySchedule.getName(), "Четверг")){
                subjectList4.add(subjectRepo.findSubjectById(daySchedule.getLesson1()));
                subjectList4.add(subjectRepo.findSubjectById(daySchedule.getLesson2()));
                subjectList4.add(subjectRepo.findSubjectById(daySchedule.getLesson3()));
                subjectList4.add(subjectRepo.findSubjectById(daySchedule.getLesson4()));
                subjectList4.add(subjectRepo.findSubjectById(daySchedule.getLesson5()));
                subjectList4.add(subjectRepo.findSubjectById(daySchedule.getLesson6()));
                subjectList4.add(subjectRepo.findSubjectById(daySchedule.getLesson7()));
                subjectList4.add(subjectRepo.findSubjectById(daySchedule.getLesson8()));
            }
            if(Objects.equals(daySchedule.getName(), "Пятница")){
                subjectList5.add(subjectRepo.findSubjectById(daySchedule.getLesson1()));
                subjectList5.add(subjectRepo.findSubjectById(daySchedule.getLesson2()));
                subjectList5.add(subjectRepo.findSubjectById(daySchedule.getLesson3()));
                subjectList5.add(subjectRepo.findSubjectById(daySchedule.getLesson4()));
                subjectList5.add(subjectRepo.findSubjectById(daySchedule.getLesson5()));
                subjectList5.add(subjectRepo.findSubjectById(daySchedule.getLesson6()));
                subjectList5.add(subjectRepo.findSubjectById(daySchedule.getLesson7()));
                subjectList5.add(subjectRepo.findSubjectById(daySchedule.getLesson8()));
            }
            if(Objects.equals(daySchedule.getName(), "Суббота")){
                subjectList6.add(subjectRepo.findSubjectById(daySchedule.getLesson1()));
                subjectList6.add(subjectRepo.findSubjectById(daySchedule.getLesson2()));
                subjectList6.add(subjectRepo.findSubjectById(daySchedule.getLesson3()));
                subjectList6.add(subjectRepo.findSubjectById(daySchedule.getLesson4()));
                subjectList6.add(subjectRepo.findSubjectById(daySchedule.getLesson5()));
                subjectList6.add(subjectRepo.findSubjectById(daySchedule.getLesson6()));
                subjectList6.add(subjectRepo.findSubjectById(daySchedule.getLesson7()));
                subjectList6.add(subjectRepo.findSubjectById(daySchedule.getLesson8()));
            }
        }
        model.addAttribute("listM", subjectList1);
        model.addAttribute("listTu", subjectList2);
        model.addAttribute("listW", subjectList3);
        model.addAttribute("listTh", subjectList4);
        model.addAttribute("listF", subjectList5);
        model.addAttribute("listSa", subjectList6);
        return "schedule";
    }

    @GetMapping("/edit-subject")
    public String list(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("user", user);
        model.addAttribute("list", subjectRepo.findAll());
        return "table-view";
    }

    @GetMapping("/add-subject")
    public String createMain(@AuthenticationPrincipal User user, Model model) {
        model.addAttribute("user", user);
        model.addAttribute("unis", uniRepo.findAll());
        model.addAttribute("userGS", sqdRepo.findAll());

        return "admin";
    }

    @PostMapping("/admin/subject/create")
    public String createSubject(Subject subject) {
        scheduleService.saveSubject(subject);
        return "redirect:/add-subject";
    }

    @GetMapping("/admin/subject/{id}")
    public String setSubject(@PathVariable Long id, @AuthenticationPrincipal User user, Model model) {
        Subject subject = subjectRepo.findById(id).orElse(null);
        model.addAttribute("user", user);
        model.addAttribute("subject", subject);
        model.addAttribute("unis", uniRepo.findAll());
        model.addAttribute("userGS", sqdRepo.findAll());
        return "custom-form-2";
    }

    @PostMapping("/admin/subject/{id}/set/1")
    public String setSubjectManT(@RequestParam String manT, @PathVariable Long id) {
        if(manT != null && !manT.isEmpty()) {
            Subject subject = subjectRepo.findById(id).orElse(null);
            assert subject != null;
            subject.setManT(manT);
            subjectRepo.save(subject);
        }
        return "redirect:/admin/subject/{id}";
    }
    @PostMapping("/admin/subject/{id}/set/2")
    public String setSubjectName(@RequestParam String name, @PathVariable Long id) {
        if(name != null && !name.isEmpty()) {
            Subject subject = subjectRepo.findById(id).orElse(null);
            assert subject != null;
            subject.setName(name);
            subjectRepo.save(subject);
        }
        return "redirect:/admin/subject/{id}";
    }
    @PostMapping("/admin/subject/{id}/set/3")
    public String setSubjectTime(@RequestParam String time, @PathVariable Long id) {
        if(time != null && !time.isEmpty()) {
            Subject subject = subjectRepo.findById(id).orElse(null);
            assert subject != null;
            subject.setTime(time);
            subjectRepo.save(subject);
        }
        return "redirect:/admin/subject/{id}";
    }
    @PostMapping("/admin/subject/{id}/set/4")
    public String setSubjectDay(@RequestParam String day, @PathVariable Long id) {
        if(day != null && !day.isEmpty()) {
            Subject subject = subjectRepo.findById(id).orElse(null);
            assert subject != null;
            subject.setDay(day);
            subjectRepo.save(subject);
        }
        return "redirect:/admin/subject/{id}";
    }
    @PostMapping("/admin/subject/{id}/set/5")
    public String setSubjectUni(@RequestParam String uni, @PathVariable Long id) {
        if(uni != null && !uni.isEmpty()) {
            Subject subject = subjectRepo.findById(id).orElse(null);
            assert subject != null;
            subject.setUni(uni);
            subjectRepo.save(subject);
        }
        return "redirect:/admin/subject/{id}";
    }
    @PostMapping("/admin/subject/{id}/set/6")
    public String setSubjectUserG(@RequestParam String userG, @PathVariable Long id) {
        if(userG != null && !userG.isEmpty()) {
            Subject subject = subjectRepo.findById(id).orElse(null);
            assert subject != null;
            subject.setUserG(userG);
            subjectRepo.save(subject);
        }
        return "redirect:/admin/subject/{id}";
    }
    @PostMapping("/admin/subject/{id}/set/7")
    public String setSubjectName(@RequestParam Long auditorium, @PathVariable Long id) {
        if(auditorium != null) {
            Subject subject = subjectRepo.findById(id).orElse(null);
            assert subject != null;
            subject.setAuditorium(auditorium);
            subjectRepo.save(subject);
        }
        return "redirect:/admin/subject/{id}";
    }

}
