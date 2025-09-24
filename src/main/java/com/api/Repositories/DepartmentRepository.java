package com.api.Repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.api.Models.Department;

@Repository
public interface DepartmentRepository extends JpaRepository<Department, Long> {
}
