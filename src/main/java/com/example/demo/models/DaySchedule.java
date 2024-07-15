package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="DaySchedule")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class DaySchedule {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "uni")
    private String uni;

    @Column(name = "userG")
    private String userG;


    @Column(name = "lesson1")
    private Long lesson1;

    @Column(name = "lesson2")
    private Long lesson2;

    @Column(name = "lesson3")
    private Long lesson3;

    @Column(name = "lesson4")
    private Long lesson4;

    @Column(name = "lesson5")
    private Long lesson5;

    @Column(name = "lesson6")
    private Long lesson6;

    @Column(name = "lesson7")
    private Long lesson7;

    @Column(name = "lesson8")
    private Long lesson8;

}
