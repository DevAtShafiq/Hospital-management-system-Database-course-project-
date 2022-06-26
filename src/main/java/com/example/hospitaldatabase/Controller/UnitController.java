package com.example.hospitaldatabase.Controller;


import com.example.hospitaldatabase.Entity.Unit;
import com.example.hospitaldatabase.Services.UnitService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("/unit")
public class UnitController {

    @Autowired
    private UnitService unitService;

    @PostMapping("/new")
    public Unit save( @RequestBody Unit unit) {
        return unitService.addUnit(unit);
    }

    @DeleteMapping("/{name}")
    public void delete( @PathVariable("name") String name) {
        unitService.deleteByName(name);
    }

    @GetMapping("/list")
    public List<Unit> getAllUnit() {
        return unitService.getAllUnit();
    }

    @GetMapping("/{name}")
    public Unit getByName(@PathVariable("name") String name ) {
        return unitService.getByName(name);
    }
}
