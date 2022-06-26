package com.example.hospitaldatabase.Services;


import com.example.hospitaldatabase.Entity.Doctor;
import com.example.hospitaldatabase.Repository.DoctorRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.NoSuchElementException;

@Service
public class DoctorService {

    @Autowired
    private DoctorRepository doctorRepository;

    public List<Doctor>getAllDoctor(){
        return  doctorRepository.findAll();
    }
    public Doctor saveDoctor( Doctor doctor) {

        return doctorRepository.save(doctor);
    }

    public void deleteById(Long id) {
        doctorRepository.deleteById(id);
    }

    public void updateById(String id, Doctor doctor) {
        doctorRepository.save(doctor);

    }

    public Doctor getById(Long id) {
       return doctorRepository.findById(id).get();

    }


    public Doctor getByHighestIncome() {
        return doctorRepository.getByHighestIncome();
    }
    public Doctor getByLowestIncome() {
        return doctorRepository.getByLowestIncome();
    }



}
