package com.example.hospitaldatabase.Services;

import com.example.hospitaldatabase.Entity.Reservation;
import com.example.hospitaldatabase.Repository.ReservationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReservationService {

    @Autowired
 ReservationRepository reservationRepository;

        public Reservation addNew(Reservation reservation){
            return reservationRepository.save(reservation);
        }

        public List<Reservation>getAll(){
            return reservationRepository.findAll();
        }
}
