package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Uni")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Uni {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "time_lesson1")
    private String time_lesson1;

    @Column(name = "time_lesson2")
    private String time_lesson2;

    @Column(name = "time_lesson3")
    private String time_lesson3;

    @Column(name = "time_lesson4")
    private String time_lesson4;

    @Column(name = "time_lesson5")
    private String time_lesson5;

    @Column(name = "time_lesson6")
    private String time_lesson6;

    @Column(name = "time_lesson7")
    private String time_lesson7;

    @Column(name = "time_lesson8")
    private String time_lesson8;

}
