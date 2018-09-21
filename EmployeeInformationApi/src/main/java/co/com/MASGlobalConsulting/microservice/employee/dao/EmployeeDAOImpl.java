package co.com.MASGlobalConsulting.microservice.employee.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import co.com.MASGlobalConsulting.microservice.employee.api.ApiException;
import co.com.MASGlobalConsulting.microservice.employee.service.EmployeeService;

@Component
@Qualifier("employeeDAOImpl")
public class EmployeeDAOImpl implements EmployeeDAO {
	
	@Autowired
	private EmployeeService employeeService;
	
	private Object[] listEmployeeObject = null;

	@Override
	public Object[] getEmployees() throws ApiException {
		if(listEmployeeObject == null)
			listEmployeeObject = employeeService.getEmployees();
		return listEmployeeObject;
	}

}
