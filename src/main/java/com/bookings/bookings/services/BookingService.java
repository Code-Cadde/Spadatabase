package com.bookings.bookings.services;

import java.util.List;

import org.springframework.data.mongodb.core.MongoOperations;
import org.springframework.stereotype.Service;

import com.bookings.bookings.models.Booking;

@Service
public class BookingService {
    private final MongoOperations mongoOperations;

    public BookingService(MongoOperations mongoOperations) {
        this.mongoOperations = mongoOperations;
    }

    public Booking addBooking(Booking booking) {
        return mongoOperations.insert(booking);
    }

    public List<Booking> getBookings() {
        return mongoOperations.findAll(Booking.class);
    }
    
}
