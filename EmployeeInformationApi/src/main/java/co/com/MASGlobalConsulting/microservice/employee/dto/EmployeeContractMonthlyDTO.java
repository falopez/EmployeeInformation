package co.com.MASGlobalConsulting.microservice.employee.dto;

import java.math.BigDecimal;

public class EmployeeContractMonthlyDTO extends EmployeeDTO {

	@Override
	public void calculateAnnualSalary() {
		BigDecimal MonthtlySalary = new BigDecimal(getMonthlySalary());
		BigDecimal annualSalary = new BigDecimal(MonthtlySalary.intValue() * 12);
		setAnnualSalary(String.valueOf(annualSalary));
	}

}
