package company.employees.model.Repository;

import company.employees.model.EmployeesDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeesRepository extends JpaRepository<EmployeesDetails,Integer> {
}
