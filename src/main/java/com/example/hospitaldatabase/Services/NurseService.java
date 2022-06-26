package com.example.hospitaldatabase.Services;



import com.example.hospitaldatabase.Entity.Nurse;
import com.example.hospitaldatabase.Repository.NurseRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class NurseService {

    @Autowired
    private NurseRepository nurseRepository;

    public List<Nurse> getAllNurse(){
        return  nurseRepository.findAll();
    }
    public Nurse saveNurse(Nurse nurse) {

        return nurseRepository.save(nurse);
    }

    public void deleteById(Long id) {
        nurseRepository.deleteById(id);
    }

    public Nurse getByName(String name) {
        return nurseRepository.getByName(name);

    }




    public Nurse getNurseByLowestSalary() {
        return nurseRepository.getNurseByLowestSalary();
    }

    public Nurse getNurseByHighestSalary() {
        return nurseRepository.getNurseByHighestSalary();
    }
}
