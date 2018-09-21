package co.com.MASGlobalConsulting.microservice.employee.dto;

import java.math.BigDecimal;

public class EmployeeContractHourlyDTO extends EmployeeDTO {

	@Override
	public void calculateAnnualSalary() {
		BigDecimal hourlySalary = new BigDecimal(getHourlySalary());
		BigDecimal annualSalary = new  BigDecimal(120 * hourlySalary.intValue() * 12);
		setAnnualSalary(String.valueOf(annualSalary));
	}

}
