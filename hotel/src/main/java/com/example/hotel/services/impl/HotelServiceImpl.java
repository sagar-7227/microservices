package com.example.hotel.services.impl;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import com.example.hotel.entities.Hotel;
import com.example.hotel.exceptions.ResourceNotFoundException;
import com.example.hotel.repositories.HotelRepositories;
import com.example.hotel.services.HotelService;

public class HotelServiceImpl implements HotelService {

    @Autowired
    private HotelRepositories hotelRepository;

    @Override
    public Hotel create(Hotel hotel) {
        String hotelId = UUID.randomUUID().toString();
        hotel.setId(hotelId);
        return hotelRepository.save(hotel);
    }

    @Override
    public List<Hotel> getAll() {
        // TODO Auto-generated method stub
        return hotelRepository.findAll();
    }

    @Override
    public Hotel get(String id) {
        // TODO Auto-generated method stub
        return hotelRepository.findById(id).orElseThrow(() -> new ResourceNotFoundException("Hotel with given id not found"));
    }

}