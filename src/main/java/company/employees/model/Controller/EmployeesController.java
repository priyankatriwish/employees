package company.employees.model.Controller;

import company.employees.model.EmployeesDetails;
import company.employees.model.Service.EmployeesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@Controller
public class EmployeesController {
    @Autowired
    private EmployeesService service;
    @PostMapping("/addEmployees")
    public EmployeesDetails addEmployee(@RequestBody EmployeesDetails employee) {
        return  service.saveEmployee(employee);
    }
    @GetMapping("/getEmployeesDetails")
    public List<EmployeesDetails> findAllEmployeesDetails() {
        return service.findAllEmployeesDetails() ;
    }
    @GetMapping("/getEmployees/{id}")
    public EmployeesDetails getEmployeesDetailsById(@PathVariable int id){
        return service.getEmployeesById(id);
    }
    @DeleteMapping("/deleteEmployees/{id}")
    public String deleteEmployees(@PathVariable int id){
        return service.deleteEmployeesDetails(id);
    }
    @PutMapping("/updateEmployees")
    public EmployeesDetails update(@RequestBody EmployeesDetails employee){
        return service.updateEmployees(employee);
    }
    @PutMapping("/updateEmployeesDesignation")
    public EmployeesDetails update(@PathVariable  String designation,@RequestBody EmployeesDetails employee){
        return service.updateEmployeesByDesignation(designation,employee);
    }
}
