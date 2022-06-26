package com.example.hospitaldatabase.Services;

import com.example.hospitaldatabase.Entity.Contact;
import com.example.hospitaldatabase.Entity.Doctor;
import com.example.hospitaldatabase.Repository.ContactRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ContactService {

    @Autowired
    ContactRepo contactRepo;
    public Contact saveContact(Contact contact) {

        return contactRepo.save(contact);
    }
}
