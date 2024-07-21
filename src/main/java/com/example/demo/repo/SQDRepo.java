package com.example.demo.repo;

import com.example.demo.models.SQD;
import com.example.demo.models.Uni;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface SQDRepo extends JpaRepository<SQD, Long> {
    List<SQD> findSQDSByUni(String Uni);
}
