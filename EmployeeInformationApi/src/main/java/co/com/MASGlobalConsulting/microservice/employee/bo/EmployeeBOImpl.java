package co.com.MASGlobalConsulting.microservice.employee.bo;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;

import org.json.simple.JSONObject;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

import co.com.MASGlobalConsulting.microservice.employee.api.ApiException;
import co.com.MASGlobalConsulting.microservice.employee.dao.EmployeeDAO;
import co.com.MASGlobalConsulting.microservice.employee.dto.EmployeeContractHourlyDTO;
import co.com.MASGlobalConsulting.microservice.employee.dto.EmployeeContractMonthlyDTO;
import co.com.MASGlobalConsulting.microservice.employee.dto.EmployeeDTO;

@Component
@Qualifier("employeeBOImpl")
public class EmployeeBOImpl implements EmployeeBO {
	
	@Autowired
	@Qualifier("employeeDAOImpl")
	private EmployeeDAO employeeDAO;	
	
	public static final String TYPE_CONTRACT_HOUR_SALARY_EMPLOYEE = "HourlySalaryEmployee";
	public static final String ID = "id";

	@Override
	public EmployeeDTO getEmployee(String idEmployee) throws ApiException {
		return calculateAnnualSalary(employeeDAO.getEmployees(), idEmployee);
	}

	@Override
	public List<EmployeeDTO> getEmployees() throws ApiException {
		return calculateAnnualSalary(employeeDAO.getEmployees());
	}
	
	@SuppressWarnings("rawtypes")
	public List<EmployeeDTO> calculateAnnualSalary(Object[] objectEmployee) {
		List<EmployeeDTO> listEmployeeDTO = new ArrayList<>();
		for (Object employeeObject : objectEmployee) {
			JSONObject jsonpObject = new JSONObject((LinkedHashMap) employeeObject);
			listEmployeeDTO.add(createEmployeeDTO(jsonpObject));
		}
		return listEmployeeDTO;
	}

	@SuppressWarnings({ "rawtypes"})
	public EmployeeDTO calculateAnnualSalary(Object[] objectEmployee, String idEmployee) {
		for (Object employeeObject : objectEmployee) {
			JSONObject jsonpObject = new JSONObject((LinkedHashMap) employeeObject);
			if ((String.valueOf(jsonpObject.get(ID))).equalsIgnoreCase(idEmployee)) {
				return createEmployeeDTO(jsonpObject);
			}
		}
		return null;
	}

	public EmployeeDTO createEmployeeDTO(JSONObject jsonpObject) {
		EmployeeDTO employeeDTO = null;
		Gson gson = new GsonBuilder().create();
		if (((String) jsonpObject.get("contractTypeName")).equalsIgnoreCase(TYPE_CONTRACT_HOUR_SALARY_EMPLOYEE)) {
			employeeDTO = gson.fromJson(jsonpObject.toJSONString(), EmployeeContractHourlyDTO.class);
			employeeDTO.calculateAnnualSalary();
		} else {
			employeeDTO = gson.fromJson(jsonpObject.toJSONString(), EmployeeContractMonthlyDTO.class);
			employeeDTO.calculateAnnualSalary();
		}
		return employeeDTO;
	}

}
