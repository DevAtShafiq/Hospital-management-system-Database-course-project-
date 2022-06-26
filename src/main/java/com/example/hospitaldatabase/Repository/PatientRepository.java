package com.example.hospitaldatabase.Repository;

import com.example.hospitaldatabase.Entity.Patient;
import org.springframework.data.jpa.repository.JpaRepository;


public interface PatientRepository extends JpaRepository<Patient, Long> {

    void deleteByName(String name);
    Patient getByName(String name);
}