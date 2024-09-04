package com.example.demo.repo;
import org.springframework.data.jpa.repository.JpaRepository; 

import com.example.demo.model.Patient;

public interface MyRepo extends JpaRepository<Patient, Integer>{

}
