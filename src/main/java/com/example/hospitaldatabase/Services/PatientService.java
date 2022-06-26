package com.example.hospitaldatabase.Services;
import com.example.hospitaldatabase.Entity.Patient;
import com.example.hospitaldatabase.Repository.PatientRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;


@Service
public class PatientService {

    @Autowired
    private PatientRepository patientRepository;

    public List<Patient> getAllPatient(){
        return  patientRepository.findAll();
    }
    public Patient savePatient(Patient patient) {

        return patientRepository.save(patient);
    }

    public void deleteByName(String name) {
        patientRepository.deleteByName(name);
    }

    public Patient getByName(String name) {
        return patientRepository.getByName(name);

    }
}
