package io.vpv.docker.example.employee;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public interface EmployeeRepository extends CrudRepository<Employee, Long> {
    default List<Employee> findAllEmployees() {
        List<Employee> list = new ArrayList<>();
        findAll().iterator().forEachRemaining(list::add);
        return list;
    }
}
