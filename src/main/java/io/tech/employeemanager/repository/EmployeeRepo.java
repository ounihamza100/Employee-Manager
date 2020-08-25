package io.tech.employeemanager.repository;

import io.tech.employeemanager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

/**
 * @author Hamza Ouni
 */
public interface EmployeeRepo extends JpaRepository<Employee, Long> {
    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
