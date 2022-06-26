package com.example.hospitaldatabase.Controller;


import com.example.hospitaldatabase.Entity.Room;
import com.example.hospitaldatabase.Services.RoomService;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Validated
@RestController
@RequestMapping("/room")
public class RoomController {

    @Autowired
    private RoomService roomService;


    @GetMapping("/list")
    public List<Room> roomList(){
    return roomService.getAllRoom();
    }
    @PostMapping("/new")
    public Room newRoom(@RequestBody Room room){
        return roomService.saveRoom(room);
    }
}
