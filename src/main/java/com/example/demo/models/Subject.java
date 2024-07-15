package com.example.demo.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Table(name="Subject")
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Subject {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "time")
    private String time;

    @Column(name = "day")
    private String day;

    @Column(name = "auditorium")
    private Long auditorium;

    @Column(name = "userG")
    private String userG;

    @Column(name = "uni")
    private String uni;

    @Column(name = "ManT")
    private String manT;
}
