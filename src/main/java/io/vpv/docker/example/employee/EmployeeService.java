package io.vpv.docker.example.employee;

import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class EmployeeService {
    final EmployeeRepository repository;

    public EmployeeService(EmployeeRepository repository) {
        this.repository = repository;
    }


    public List<Employee> getAllEmployees() {
        return repository.findAllEmployees();
    }

    public Employee save(final Employee toSave) {
        return repository.save(toSave);
    }


    public void deleteById(final Long id) {
        repository.deleteById(id);
    }

    public Optional<Employee> findById(Long id) {
        return repository.findById(id);
    }
}
