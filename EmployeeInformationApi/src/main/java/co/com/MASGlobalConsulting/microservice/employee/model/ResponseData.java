package co.com.MASGlobalConsulting.microservice.employee.model;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ResponseData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-20T19:10:52.217-05:00")

public class ResponseData   {
  @JsonProperty("idRequest")
  private String idRequest = null;

  @JsonProperty("id")
  private String id = null;

  @JsonProperty("name")
  private String name = null;

  @JsonProperty("contractTypeName")
  private String contractTypeName = null;

  @JsonProperty("roleId")
  private String roleId = null;

  @JsonProperty("roleName")
  private String roleName = null;

  @JsonProperty("roleDescription")
  private String roleDescription = null;

  @JsonProperty("hourlySalary")
  private String hourlySalary = null;

  @JsonProperty("monthlySalary")
  private String monthlySalary = null;

  @JsonProperty("annualSalary")
  private String annualSalary = null;

  /**
   * Get idRequest
   * @return idRequest
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getIdRequest() {
    return idRequest;
  }

  public void setIdRequest(String idRequest) {
    this.idRequest = idRequest;
  }

  /**
   * Get id
   * @return id
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  /**
   * Get name
   * @return name
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  /**
   * Get contractTypeName
   * @return contractTypeName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getContractTypeName() {
    return contractTypeName;
  }

  public void setContractTypeName(String contractTypeName) {
    this.contractTypeName = contractTypeName;
  }

  /**
   * Get roleId
   * @return roleId
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getRoleId() {
    return roleId;
  }

  public void setRoleId(String roleId) {
    this.roleId = roleId;
  }

  /**
   * Get roleName
   * @return roleName
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getRoleName() {
    return roleName;
  }

  public void setRoleName(String roleName) {
    this.roleName = roleName;
  }

  /**
   * Get roleDescription
   * @return roleDescription
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getRoleDescription() {
    return roleDescription;
  }

  public void setRoleDescription(String roleDescription) {
    this.roleDescription = roleDescription;
  }

  /**
   * Get hourlySalary
   * @return hourlySalary
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getHourlySalary() {
    return hourlySalary;
  }

  public void setHourlySalary(String hourlySalary) {
    this.hourlySalary = hourlySalary;
  }

  /**
   * Get monthlySalary
   * @return monthlySalary
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getMonthlySalary() {
    return monthlySalary;
  }

  public void setMonthlySalary(String monthlySalary) {
    this.monthlySalary = monthlySalary;
  }

  /**
   * Get annualSalary
   * @return annualSalary
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getAnnualSalary() {
    return annualSalary;
  }

  public void setAnnualSalary(String annualSalary) {
    this.annualSalary = annualSalary;
  }

}

