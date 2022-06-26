package com.example.hospitaldatabase.Services;

import com.example.hospitaldatabase.Entity.Unit;
import com.example.hospitaldatabase.Repository.UnitRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UnitService {

    @Autowired
    private UnitRepository unitRepository;
    public List<Unit> getAllUnit(){
        return  unitRepository.findAll();
    }
    public Unit addUnit(Unit unit) {

        return unitRepository.save(unit);
    }

    public void deleteByName(String name) {
        unitRepository.deleteByName(name);
    }



    public Unit getByName(String name) {
        return unitRepository.getByUnitName(name);

    }
}