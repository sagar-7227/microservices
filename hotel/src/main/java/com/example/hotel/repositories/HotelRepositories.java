package com.example.hotel.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.hotel.entities.Hotel;

public interface HotelRepositories extends JpaRepository<Hotel, String> {
    
}
