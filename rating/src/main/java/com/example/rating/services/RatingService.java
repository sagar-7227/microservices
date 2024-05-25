package com.example.rating.services;

import java.util.List;

import com.example.rating.entities.Rating;

public interface RatingService {

    // create
    Rating create(Rating rating);

    // get all
    List<Rating> getRatings();

    // get all by userid
    List<Rating> getRatingsByUserId(String userId);

    // get all by hotelid
    List<Rating> getRatingsByHotelId(String hotelId);

}
