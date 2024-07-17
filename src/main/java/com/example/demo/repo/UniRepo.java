package com.example.demo.repo;

import com.example.demo.models.Subject;
import com.example.demo.models.Uni;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UniRepo extends JpaRepository<Uni, Long> {
    Uni findUniByName (String name);

    Uni findUniById(Long id);
}
