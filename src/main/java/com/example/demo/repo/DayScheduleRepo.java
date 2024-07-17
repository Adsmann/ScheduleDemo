package com.example.demo.repo;

import com.example.demo.models.DaySchedule;
import com.example.demo.models.SQD;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DayScheduleRepo extends JpaRepository<DaySchedule, Long> {

    DaySchedule findDayScheduleByNameAndUserGAndUni(String dayName, String userG, String uniName);
    List<DaySchedule> findDayScheduleByUserGAndUni(String userG, String uniName);

}
