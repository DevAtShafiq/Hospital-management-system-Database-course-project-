package com.example.hospitaldatabase.Services;


import com.example.hospitaldatabase.Entity.Room;
import com.example.hospitaldatabase.Repository.RoomRepository;

import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.stereotype.Service;


import java.util.List;


@Service
public class RoomService {

    @Autowired
    private RoomRepository roomRepository;



    public List<Room>getAllRoom() {
      return   roomRepository.findAll();
    }

    public Room saveRoom(Room room) {
        return roomRepository.save(room);
    }
}
