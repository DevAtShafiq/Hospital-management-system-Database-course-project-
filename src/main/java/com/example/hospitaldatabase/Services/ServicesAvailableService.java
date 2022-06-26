package com.example.hospitaldatabase.Services;



import com.example.hospitaldatabase.Entity.ServicesAvailable;
import com.example.hospitaldatabase.Repository.ServicesAvailableRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class ServicesAvailableService {

    @Autowired
    private ServicesAvailableRepository servicesAvailableRepository;
    public List<ServicesAvailable> getAllServices(){
        return  servicesAvailableRepository.findAll();
    }
    public ServicesAvailable addService(ServicesAvailable service) {

        return servicesAvailableRepository.save(service);
    }

    public void deleteByName(String name) {
        servicesAvailableRepository.deleteByName(name);
    }

    public ServicesAvailable getByName(String name) {
        return servicesAvailableRepository.getByName(name);

    }
}
