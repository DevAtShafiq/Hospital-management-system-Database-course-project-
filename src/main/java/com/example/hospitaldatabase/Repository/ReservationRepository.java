package com.example.hospitaldatabase.Repository;

import com.example.hospitaldatabase.Entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ReservationRepository extends JpaRepository<Reservation,Long> {
}
