package com.example.hospitaldatabase.Controller;


import com.example.hospitaldatabase.Entity.Patient;
import com.example.hospitaldatabase.Services.PatientService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Validated
@RestController
@RequestMapping("/patient")
public class PatientController {

    @Autowired
    private PatientService patientService;

    @PostMapping("/new")
    public Patient newPatient(@RequestBody Patient patient) {
        return patientService.savePatient(patient);
    }

    @DeleteMapping("/{name}")
    public void deletePatient( @PathVariable("name") String name) {
        patientService.deleteByName(name);
    }


    @GetMapping("/{name}")
    public Patient findPatient( @PathVariable("name") String name) {
        return patientService.getByName(name);
    }

    @GetMapping("/list")
    public List<Patient> getAllPatient() {
        return patientService.getAllPatient();
    }
}
