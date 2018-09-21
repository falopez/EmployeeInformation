package co.com.MASGlobalConsulting.microservice.employee.dao;

import co.com.MASGlobalConsulting.microservice.employee.api.ApiException;


public interface EmployeeDAO {
	
	public Object[] getEmployees() throws ApiException;

}
