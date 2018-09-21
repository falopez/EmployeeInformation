package co.com.MASGlobalConsulting.microservice.employee.model;

import java.util.Objects;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

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

  public ResponseData idRequest(String idRequest) {
    this.idRequest = idRequest;
    return this;
  }

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

  public ResponseData id(String id) {
    this.id = id;
    return this;
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

  public ResponseData name(String name) {
    this.name = name;
    return this;
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

  public ResponseData contractTypeName(String contractTypeName) {
    this.contractTypeName = contractTypeName;
    return this;
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

  public ResponseData roleId(String roleId) {
    this.roleId = roleId;
    return this;
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

  public ResponseData roleName(String roleName) {
    this.roleName = roleName;
    return this;
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

  public ResponseData roleDescription(String roleDescription) {
    this.roleDescription = roleDescription;
    return this;
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

  public ResponseData hourlySalary(String hourlySalary) {
    this.hourlySalary = hourlySalary;
    return this;
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

  public ResponseData monthlySalary(String monthlySalary) {
    this.monthlySalary = monthlySalary;
    return this;
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

  public ResponseData annualSalary(String annualSalary) {
    this.annualSalary = annualSalary;
    return this;
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ResponseData responseData = (ResponseData) o;
    return Objects.equals(this.idRequest, responseData.idRequest) &&
        Objects.equals(this.id, responseData.id) &&
        Objects.equals(this.name, responseData.name) &&
        Objects.equals(this.contractTypeName, responseData.contractTypeName) &&
        Objects.equals(this.roleId, responseData.roleId) &&
        Objects.equals(this.roleName, responseData.roleName) &&
        Objects.equals(this.roleDescription, responseData.roleDescription) &&
        Objects.equals(this.hourlySalary, responseData.hourlySalary) &&
        Objects.equals(this.monthlySalary, responseData.monthlySalary) &&
        Objects.equals(this.annualSalary, responseData.annualSalary);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idRequest, id, name, contractTypeName, roleId, roleName, roleDescription, hourlySalary, monthlySalary, annualSalary);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ResponseData {\n");
    
    sb.append("    idRequest: ").append(toIndentedString(idRequest)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    contractTypeName: ").append(toIndentedString(contractTypeName)).append("\n");
    sb.append("    roleId: ").append(toIndentedString(roleId)).append("\n");
    sb.append("    roleName: ").append(toIndentedString(roleName)).append("\n");
    sb.append("    roleDescription: ").append(toIndentedString(roleDescription)).append("\n");
    sb.append("    hourlySalary: ").append(toIndentedString(hourlySalary)).append("\n");
    sb.append("    monthlySalary: ").append(toIndentedString(monthlySalary)).append("\n");
    sb.append("    annualSalary: ").append(toIndentedString(annualSalary)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

