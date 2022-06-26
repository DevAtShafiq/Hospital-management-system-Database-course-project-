package com.example.hospitaldatabase.Controller;

import com.example.hospitaldatabase.Entity.Contact;
import com.example.hospitaldatabase.Entity.Doctor;
import com.example.hospitaldatabase.Entity.Nurse;
import com.example.hospitaldatabase.Entity.Reservation;
import com.example.hospitaldatabase.Services.ContactService;
import com.example.hospitaldatabase.Services.DoctorService;
import com.example.hospitaldatabase.Services.NurseService;
import com.example.hospitaldatabase.Services.ReservationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@Controller
@RequestMapping("/doctor")
public class DoctorController {

    @Autowired
    private DoctorService doctorService;
    @Autowired
    ContactService contactService;


    @GetMapping("/new")
    public String registerNewStudent(Model model) {
        Doctor doctor = new Doctor();
        model.addAttribute("doctor", doctor);
        return "reg_doctor";

    }

    @PostMapping("/register")
    public String save(@ModelAttribute Doctor doctor) {
        doctorService.saveDoctor(doctor);
        return "redirect:/doctor/list";
    }

    @GetMapping("/delete/{id}")
    public String deleteById(@PathVariable("id") Long id) {
        doctorService.deleteById(id);
        return "redirect:/doctor/list";
    }

    @GetMapping("/update_doctor/{id}")
    public String update_doctor(@PathVariable("id") Long id, Model model) {
        Doctor needToEdit = doctorService.getById(id);
        model.addAttribute("needToEdit", needToEdit);
        return "update_doctor";
    }

//    @GetMapping("/update/{id}")
//    public String update(@PathVariable("id") String id, @RequestBody Doctor doctor) {
//        doctorService.updateById(id, doctor);
//
//        return "redirect:/doctor/list";
//    }

    @GetMapping("/{id}")
    public Doctor getById(@PathVariable("id") Long id) {
        return doctorService.getById(id);
    }

    @GetMapping("/list")
    public String doctorList(Model model) {
        List<Doctor> doctorList = doctorService.getAllDoctor();
        model.addAttribute("doctorList", doctorList);
        return "doctor";
    }

//by highest salary

    @GetMapping("/byHighestSalary")
    public String doctorListByHighestIncome(Model model) {
        Doctor doctor = doctorService.getByHighestIncome();
        model.addAttribute("doctorByHighestIncome", doctor);
        return "doctorByHighestIncome";
    }

    @GetMapping("/byLowestSalary")
    public String getByLowestIncome(Model model) {
        Doctor doctor = doctorService.getByLowestIncome();
        model.addAttribute("doctorByLowestSalary", doctor);
        return "doctorByLowestIncome";
    }


    // about pages
    @GetMapping("/about")
    public String aboutPage() {
        return "about";
    }


//home page

    @GetMapping("/home")
    public String homepage(Model model) {

        Contact contact = new Contact();
        model.addAttribute("contact", contact);
        return "homepage";
    }


    // reservation page

    @Autowired
    ReservationService reservationService;


    @GetMapping("/reservation")
    public String reserveNew(Model model) {

        Reservation reservation = new Reservation();
        model.addAttribute("reservation", reservation);
        return "newReservation";
    }

    @PostMapping("/reservation/reserve")
    public String newReservation(@ModelAttribute Reservation reservation) {

        reservationService.addNew(reservation);
        return "redirect:/doctor/reservation/list";
    }


    @GetMapping("/reservation/list")
    public String reservationList(Model model) {
        List<Reservation> reservationList = reservationService.getAll();
        model.addAttribute("reservationList", reservationList);
        return "reservation";
    }


//successful page

    @PostMapping("/saveContact")
    public String save(@ModelAttribute Contact contact) {
        contactService.saveContact(contact);
        return "successful";
    }

//nurse
//    @Autowired
//    private NurseService nurseService;
//
//    @GetMapping("/new")
//    public String newNurse(Model model){
//        Nurse nurse = new Nurse();
//        model.addAttribute("nurse",nurse);
//        return "reg_nurse";
//    }


//    @PostMapping("/register")
//    public String saveNurse(@ModelAttribute Nurse nurse) {
//        nurseService.saveNurse(nurse);
//        return "redirect:/nurse/list";
//    }


}
