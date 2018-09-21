package co.com.MASGlobalConsulting.microservice.employee.bo;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import co.com.MASGlobalConsulting.microservice.employee.api.ApiException;
import co.com.MASGlobalConsulting.microservice.employee.dao.EmployeeDAO;
import co.com.MASGlobalConsulting.microservice.employee.dto.EmployeeDTO;
import co.com.MASGlobalConsulting.microservice.employee.utilities.Utilities;

@Component
@Qualifier("employeeBOImpl")
public class EmployeeBOImpl implements EmployeeBO {
	
	@Autowired
	@Qualifier("employeeDAOImpl")
	private EmployeeDAO employeeDAO;	

	@Override
	public EmployeeDTO getEmployee(String idEmployee) throws ApiException {
		return Utilities.calculateAnnualSalary(employeeDAO.getEmployees(), idEmployee);
	}

	@Override
	public List<EmployeeDTO> getEmployees() throws ApiException {
		return Utilities.calculateAnnualSalary(employeeDAO.getEmployees());
	}

}
