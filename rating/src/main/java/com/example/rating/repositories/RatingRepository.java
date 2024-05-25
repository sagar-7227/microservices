package com.example.rating.repositories;

import java.util.List;
import org.springframework.data.mongodb.repository.MongoRepository;
import com.example.rating.entities.Rating;

public interface RatingRepository extends MongoRepository<Rating, String>{
    

    // custom finder methods
    public List<Rating> findByUserId(String userId);
    public List<Rating> findByHotelId(String hotelId);
}
