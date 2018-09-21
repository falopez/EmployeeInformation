package co.com.MASGlobalConsulting.microservice.employee.dto;

public abstract class EmployeeDTO {

	  private String id = null;

	  private String name = null;

	  private String contractTypeName = null;

	  private String roleId = null;

	  private String roleName = null;

	  private String roleDescription = null;

	  private String hourlySalary = null;

	  private String monthlySalary = null;

	  private String annualSalary = null;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getContractTypeName() {
		return contractTypeName;
	}

	public void setContractTypeName(String contractTypeName) {
		this.contractTypeName = contractTypeName;
	}

	public String getRoleId() {
		return roleId;
	}

	public void setRoleId(String roleId) {
		this.roleId = roleId;
	}

	public String getRoleName() {
		return roleName;
	}

	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}

	public String getRoleDescription() {
		return roleDescription;
	}

	public void setRoleDescription(String roleDescription) {
		this.roleDescription = roleDescription;
	}

	public String getHourlySalary() {
		return hourlySalary;
	}

	public void setHourlySalary(String hourlySalary) {
		this.hourlySalary = hourlySalary;
	}

	public String getMonthlySalary() {
		return monthlySalary;
	}

	public void setMonthlySalary(String monthlySalary) {
		this.monthlySalary = monthlySalary;
	}

	public String getAnnualSalary() {
		return annualSalary;
	}

	public void setAnnualSalary(String annualSalary) {
		this.annualSalary = annualSalary;
	}

	public abstract void calculateAnnualSalary();

}
