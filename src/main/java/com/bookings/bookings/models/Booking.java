package com.bookings.bookings.models;

import java.sql.Date;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "Bookings")
public class Booking {
    @Id
    private String id; 
    private String Name; 
    private String email;
    private Date date;
    private String timePeriod;
    private String sessionType; 

    public Booking(String id, String Name, String email, Date date, String timePeriod, String sessionType) {
        this.id = id;
        this.Name = Name;
        this.email = email;
        this.date = date;
        this.timePeriod = timePeriod;
        this.sessionType = sessionType;
 
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTimePeriod() {
        return timePeriod;
    }

    public void setTimePeriod(String timePeriod) {
        this.timePeriod = timePeriod;
    }

    public String getSessionType() {
        return sessionType;
    }

    public void setSessionType(String sessionType) {
        this.sessionType = sessionType;
    }

    


    
}
