package com.example.mongospringdb.Model;

import org.springframework.data.annotation.Id;

public class Employee {
    @Id // The @Id annotation tells spring that the _id field will be used as the primary identifier
    private String id;
    private String name;
    private String city;

    //Getters and setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }
}
