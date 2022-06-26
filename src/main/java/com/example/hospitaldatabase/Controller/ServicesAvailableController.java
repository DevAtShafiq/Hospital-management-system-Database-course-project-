package com.example.hospitaldatabase.Controller;


import com.example.hospitaldatabase.Entity.ServicesAvailable;
import com.example.hospitaldatabase.Services.ServicesAvailableService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("/service")
public class ServicesAvailableController {

    @Autowired
    private ServicesAvailableService servicesAvailableService;

    @PostMapping("/new")
    public ServicesAvailable addNewService( @RequestBody ServicesAvailable service) {
        return servicesAvailableService.addService(service);
    }

    @DeleteMapping("/{name}")
    public void delete( @PathVariable("name") String name) {
        servicesAvailableService.deleteByName(name);
    }



    @GetMapping("/{name}")
    public ServicesAvailable findService( @PathVariable("name") String name) {
        return servicesAvailableService.getByName(name);
    }

    @GetMapping("/list")
    public List<ServicesAvailable> serviceList() {
        return servicesAvailableService.getAllServices();
    }
}
