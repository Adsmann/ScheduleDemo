package com.example.demo.repo;

import com.example.demo.models.Subject;
import com.example.demo.models.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SubjectRepo extends JpaRepository<Subject, Long> {
    Subject findSubjectById(Long id);
}
