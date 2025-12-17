package com.example.demo.serviceimpl;

import com.example.demo.entity.Student;
import org.springframework.stereotype.Service;
import com.example.demo.repository.StudentRepository;
import com.example.demo.service.Stuservice;

@service
public class StuServiceImp implements Stuservice{
    private final StudentRepository StudentRepository;
    public StuServiceImp(StudentRepository StudentRepository){
        this.StudentRepository
    }
}