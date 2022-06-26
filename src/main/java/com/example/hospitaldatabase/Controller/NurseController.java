package com.example.hospitaldatabase.Controller;


import com.example.hospitaldatabase.Entity.Doctor;
import com.example.hospitaldatabase.Entity.Nurse;
import com.example.hospitaldatabase.Services.NurseService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@Validated
@Controller
@RequestMapping("/nurse")
public class NurseController {

    @Autowired
    private NurseService nurseService;

    @GetMapping("/new")
    public String newNurse(Model model){
        Nurse nurse = new Nurse();
        model.addAttribute("nurse",nurse);
        return "reg_nurse";
    }



    @PostMapping("/register")
    public String saveNurse(@ModelAttribute Nurse nurse) {
         nurseService.saveNurse(nurse);
         return "redirect:/nurse/list";
    }

    @GetMapping("/delete/{id}")
    public String delete( @PathVariable("id") Long id) {
        nurseService.deleteById(id);
        return "redirect:/nurse/list";
    }




    @PostMapping("/findByName")
    public String getByName( @RequestParam String name, Model model) {
        Nurse nurseByName = nurseService.getByName(name);
       model.addAttribute("nurseByName",nurseByName);
       return  "nursesByName";
    }

    @GetMapping("/list")
    public String getAllNurses(Model model) {
        List <Nurse> nurseList = nurseService.getAllNurse();
        model.addAttribute("nurseList",nurseList);
        return "nurses";
    }



    //by income

    @GetMapping("/byHighestSalary")
    public String nurseByHighestIncome(Model model) {
        Nurse nurse = nurseService.getNurseByHighestSalary();
        model.addAttribute("nurseByHighestIncome", nurse);
        return "nurseByHighestIncome";
    }

    @GetMapping("/byLowestSalary")
    public String nurseByLowestIncome(Model model) {
        Nurse nurse = nurseService.getNurseByLowestSalary();
        model.addAttribute("nurseByLowestIncome", nurse);
        return "nurseByLowestIncome";
    }

}
