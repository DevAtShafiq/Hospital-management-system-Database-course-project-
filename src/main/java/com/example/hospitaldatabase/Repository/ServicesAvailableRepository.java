package com.example.hospitaldatabase.Repository;

import com.example.hospitaldatabase.Entity.Patient;
import com.example.hospitaldatabase.Entity.ServicesAvailable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface ServicesAvailableRepository extends JpaRepository<ServicesAvailable, String>{

    void deleteByName(String name);
    ServicesAvailable getByName(String name);
}