package co.com.MASGlobalConsulting.microservice.employee.bo;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.Mockito.when;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import co.com.MASGlobalConsulting.microservice.employee.api.ApiException;
import co.com.MASGlobalConsulting.microservice.employee.dao.EmployeeDAO;
import co.com.MASGlobalConsulting.microservice.employee.dao.EmployeeDAOImpl;
import co.com.MASGlobalConsulting.microservice.employee.dto.EmployeeDTO;

@RunWith(MockitoJUnitRunner.class)
public class EmployeeBOTest {
	
	@InjectMocks
	private EmployeeBO employeeBO = new EmployeeBOImpl();
	
	@Mock
	private EmployeeDAO employeeDAO = new EmployeeDAOImpl();
	
	@Before
	public void init() throws ApiException {
		when(employeeDAO.getEmployees()).thenReturn(createEmployeeObjects());
	}
	
	@Test
	public void getEmployeeTest() throws ApiException {
		
		EmployeeDTO employeeDTO = employeeBO.getEmployee("1");
		assertThat(employeeDTO).isNotNull();
		assertThat(employeeDTO.getAnnualSalary()).isEqualTo("86400000");
		assertThat(employeeDTO.getId()).isEqualTo("1");
	}
	
	@Test
	public void getEmployeesTest() throws ApiException {
		List<EmployeeDTO> listEmployeeDTO = employeeBO.getEmployees();
		assertThat(listEmployeeDTO).isNotNull();
		assertThat(listEmployeeDTO.get(0).getAnnualSalary()).isEqualTo("86400000");
		assertThat(listEmployeeDTO.get(0).getId()).isEqualTo("1");
	}
	
	@SuppressWarnings({ "rawtypes", "unchecked" })
	public Object[] createEmployeeObjects() {
		HashMap map1 = new LinkedHashMap<>();
		map1.put("id", "1");
		map1.put("contractTypeName", "HourlySalaryEmployee");
		map1.put("hourlySalary", "60000");
		map1.put("monthlySalary", "80000");
		HashMap map2 = new LinkedHashMap<>();
		map2.put("id", "2");
		map2.put("contractTypeName", "MonthlySalaryEmployee");
		map2.put("hourlySalary", "60000");
		map2.put("monthlySalary", "80000");
		Object[] listObject = {map1, map2};
		return listObject;
	}
	
}
