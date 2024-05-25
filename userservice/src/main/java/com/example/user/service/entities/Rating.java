package com.example.user.service.entities;

import java.util.ArrayList;
import java.util.List;
import javax.persistence.Transient;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Rating {
    private String userId;
    private String ratingId;
    private String hotelId;
    private int rating;
    private String feedback;

    @Transient
    private List<Rating> ratings = new ArrayList<>();

}
