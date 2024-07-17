package com.example.demo.service;

import com.example.demo.models.*;
import com.example.demo.repo.*;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.Objects;

@Service
@Slf4j
@RequiredArgsConstructor
public class ScheduleService {
    private final SubjectRepo subjectRepo;
    private final UserInfoRepo userInfoRepo;
    private final UniRepo uniRepo;
    private final DayScheduleRepo dayScheduleRepo;

    public void saveSubject(Subject subject) {
        if(subject.getName()!=null && subject.getManT() != null && subject.getAuditorium() != null && subject.getUni() != null && subject.getUserG() != null && subject.getTime() != null && subject.getDay() != null) {
            if( !subject.getUserG().isEmpty() & !subject.getName().isEmpty() & !subject.getManT().isEmpty() & !subject.getUni().isEmpty() & !subject.getTime().isEmpty() & !subject.getDay().isEmpty()){
                if(dayScheduleRepo.findDayScheduleByNameAndUserGAndUni(subject.getDay(), subject.getUserG(), subject.getUni()) != null){
                    Uni uni = uniRepo.findUniByName(subject.getUni());
                    DaySchedule day = dayScheduleRepo.findDayScheduleByNameAndUserGAndUni(subject.getDay(), subject.getUserG(), subject.getUni());
//                    System.out.println(day);
                    if(Objects.equals(subject.getTime(), uni.getTime_lesson1())){
//                        System.out.println(subject.getTime());
                        if(day.getLesson1() == null){
                            subjectRepo.save(subject);
//                            System.out.println(subject.getId());
                            day.setLesson1(subject.getId());
                            dayScheduleRepo.save(day);
                            }
                        }
                    if(Objects.equals(subject.getTime(), uni.getTime_lesson2())){
//                        System.out.println(subject.getTime());
                        if(day.getLesson2() == null){
//                            System.out.println(uni.getTime_lesson2());
                            subjectRepo.save(subject);
                            day.setLesson2(subject.getId());
                            dayScheduleRepo.save(day);

                            }

                    }
                    if(Objects.equals(subject.getTime(), uni.getTime_lesson3())){
                        if(day.getLesson3() == null){
                            subjectRepo.save(subject);
                            day.setLesson3(subject.getId());
                            dayScheduleRepo.save(day);
                        }
                    }
                    if(Objects.equals(subject.getTime(), uni.getTime_lesson4())){
                        if(day.getLesson4() == null){
                            subjectRepo.save(subject);
                            day.setLesson4(subject.getId());
                            dayScheduleRepo.save(day);

                        }
                    }
                    if(Objects.equals(subject.getTime(), uni.getTime_lesson5())){
                        if(day.getLesson5() == null){
                            subjectRepo.save(subject);
                            day.setLesson5(subject.getId());
                            dayScheduleRepo.save(day);

                        }
                    }
                    if(Objects.equals(subject.getTime(), uni.getTime_lesson6())){
                        if(day.getLesson6() == null){
                            subjectRepo.save(subject);
                            day.setLesson6(subject.getId());
                            dayScheduleRepo.save(day);

                        }
                    }
                    if(Objects.equals(subject.getTime(), uni.getTime_lesson7())){
                        if(day.getLesson7() == null){
                            subjectRepo.save(subject);
                            day.setLesson7(subject.getId());
                            dayScheduleRepo.save(day);

                        }
                    }
                    if(Objects.equals(subject.getTime(), uni.getTime_lesson8())){
                        if(day.getLesson8() == null){
                            subjectRepo.save(subject);
                            day.setLesson8(subject.getId());
                            dayScheduleRepo.save(day);

                        }
                    }
                }
                else {
                    DaySchedule day = new DaySchedule();
                    day.setName(subject.getDay());
                    day.setUni(subject.getUni());
                    day.setUserG(subject.getUserG());

                    Uni uni = uniRepo.findUniByName(subject.getUni());

                    if(Objects.equals(subject.getTime(), uni.getTime_lesson1())){
                        if(day.getLesson1() == null){
                            subjectRepo.save(subject);
                            day.setLesson1(subject.getId());
                            dayScheduleRepo.save(day);

                        }
                    }
                    if(Objects.equals(subject.getTime(), uni.getTime_lesson2())){

                        if(day.getLesson2() == null){
                            subjectRepo.save(subject);
                            day.setLesson2(subject.getId());
                            dayScheduleRepo.save(day);

                        }

                    }
                    if(Objects.equals(subject.getTime(), uni.getTime_lesson3())){
                        if(day.getLesson3() == null){
                            subjectRepo.save(subject);
                            day.setLesson3(subject.getId());
                            dayScheduleRepo.save(day);

                        }
                    }
                    if(Objects.equals(subject.getTime(), uni.getTime_lesson4())){
                        if(day.getLesson4() == null){
                            subjectRepo.save(subject);
                            day.setLesson4(subject.getId());
                            dayScheduleRepo.save(day);

                        }
                    }
                    if(Objects.equals(subject.getTime(), uni.getTime_lesson5())){
                        if(day.getLesson5() == null){
                            subjectRepo.save(subject);
                            day.setLesson5(subject.getId());
                            dayScheduleRepo.save(day);

                        }
                    }
                    if(Objects.equals(subject.getTime(), uni.getTime_lesson6())){
                        if(day.getLesson6() == null){
                            day.setLesson6(subject.getId());
                            dayScheduleRepo.save(day);
                            subjectRepo.save(subject);
                        }
                    }
                    if(Objects.equals(subject.getTime(), uni.getTime_lesson7())){
                        if(day.getLesson7() == null){
                            subjectRepo.save(subject);
                            day.setLesson7(subject.getId());
                            dayScheduleRepo.save(day);

                        }
                    }
                    if(Objects.equals(subject.getTime(), uni.getTime_lesson8())){
                        if(day.getLesson8() == null){
                            subjectRepo.save(subject);
                            day.setLesson8(subject.getId());
                            dayScheduleRepo.save(day);

                        }
                    }
                }


            }

        }
    }

}
