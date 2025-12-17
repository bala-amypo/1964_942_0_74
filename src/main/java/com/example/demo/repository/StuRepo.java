//repository->StudentRepository.java

package com.example.PracticeProject.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.PracticeProject.entity.StuEnt;

public interface StuRepo extends JpaRepository<Stuentity, Long> {
    
    
}