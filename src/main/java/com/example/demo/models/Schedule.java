package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="schedule")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Schedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "uni")
    private String uni;

    @Column(name = "userG")
    private String userG;

    @Column(name = "day1")
    private String day1;

    @Column(name = "day2")
    private String day2;

    @Column(name = "day3")
    private String day3;

    @Column(name = "day4")
    private String day4;

    @Column(name = "day5")
    private String day5;

    @Column(name = "day6")
    private String day6;

    @Column(name = "day7")
    private String day7;
}
