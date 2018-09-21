package co.com.MASGlobalConsulting.microservice.employee.bo;

import java.util.List;

import co.com.MASGlobalConsulting.microservice.employee.api.ApiException;
import co.com.MASGlobalConsulting.microservice.employee.dto.EmployeeDTO;


public interface EmployeeBO {
	
	public EmployeeDTO getEmployee(String idEmployee) throws ApiException;
	
	public List<EmployeeDTO> getEmployees() throws ApiException;

}
