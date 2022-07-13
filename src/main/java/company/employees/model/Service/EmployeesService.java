package company.employees.model.Service;

import company.employees.model.EmployeesDetails;
import company.employees.model.Repository.EmployeesRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class EmployeesService {
    @Autowired
    private EmployeesRepository repository;

    public EmployeesDetails saveEmployee(EmployeesDetails employee){
        return repository.save(employee);
    }
    public List<EmployeesDetails> findAllEmployeesDetails() {
        return repository.findAll();
    }
    public EmployeesDetails getEmployeesById( int id){
        return repository.findById(id).orElse(null);
    }

    public String deleteEmployeesDetails(int id){
        repository.deleteById(id);
        return "product removed" +id;
    }
    public EmployeesDetails updateEmployees(EmployeesDetails employee){
        return repository.save(employee);
    }
    public EmployeesDetails updateEmployeesByDesignation(String designation, EmployeesDetails employee) {
        return repository.save(employee);
    }
}
