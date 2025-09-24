package com.api.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.Models.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}
