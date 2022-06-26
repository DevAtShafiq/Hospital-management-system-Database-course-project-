package com.example.hospitaldatabase.Repository;

import com.example.hospitaldatabase.Entity.Doctor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

import java.util.List;
import java.util.Optional;

public interface DoctorRepository extends JpaRepository<Doctor, Long> {

    @Query(value = "select *from doctor where salary =(select Max(salary) from doctor)", nativeQuery = true)
   Doctor getByHighestIncome();
    @Query(value = "select *from doctor where salary =(select Min(salary) from doctor)", nativeQuery = true)
    Doctor getByLowestIncome();


}