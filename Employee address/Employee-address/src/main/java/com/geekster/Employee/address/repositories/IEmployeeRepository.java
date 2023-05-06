package com.geekster.Employee.address.repositories;

import com.geekster.Employee.address.models.Address;
import com.geekster.Employee.address.models.Employee;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface IEmployeeRepository extends CrudRepository<Employee , Long> {
     @Modifying
     @Query(value = "update employee_table set first_name = :firstName , last_name = :lastName where id = :id" , nativeQuery = true)
    void updateEmployee(String firstName, String lastName, Long id);


}
