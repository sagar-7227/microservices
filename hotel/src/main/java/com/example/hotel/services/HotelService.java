package com.example.hotel.services;

import java.util.*;

import com.example.hotel.entities.Hotel;

/**
 * HotelService
 */
public interface HotelService {

    // create
    Hotel create(Hotel hotel);

    // get all
    List<Hotel> getAll();

    // get single
    Hotel get(String id);

}