package com.example.mongospringdb.Controller;

import com.example.mongospringdb.Model.Employee;
import com.example.mongospringdb.Repository.employeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
//The @RestController annotation tells Spring that this class will requested by URL
// and will return data to the requester.
public class employeeController {

    @Autowired
    //The @Autowired annotation creates an instance of the employeeRepository object
    // that will allow us to access and modify the employee database.
    private employeeRepository employeeRepository;

    @PostMapping("/save")
    public String saveEmp(@RequestBody Employee employee){
        employeeRepository.save(employee);
        return "Employee Data saved";
    }

}
