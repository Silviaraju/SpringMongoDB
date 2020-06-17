package com.example.mongospringdb.Repository;

import com.example.mongospringdb.Model.Employee;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface employeeRepository extends MongoRepository<Employee,String> {
}
