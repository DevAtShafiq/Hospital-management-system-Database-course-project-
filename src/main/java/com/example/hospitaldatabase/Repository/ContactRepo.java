package com.example.hospitaldatabase.Repository;

import com.example.hospitaldatabase.Entity.Contact;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ContactRepo extends JpaRepository<Contact, Long> {
}
