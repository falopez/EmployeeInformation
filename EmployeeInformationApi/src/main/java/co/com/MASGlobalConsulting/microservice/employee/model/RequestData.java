package co.com.MASGlobalConsulting.microservice.employee.model;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * RequestData
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-20T19:10:52.217-05:00")

public class RequestData   {
  @JsonProperty("header")
  private Header header = null;

  @JsonProperty("idEmployee")
  private String idEmployee = null;

  /**
   * Get header
   * @return header
  **/
  @ApiModelProperty(value = "")

  @Valid

  public Header getHeader() {
    return header;
  }

  public void setHeader(Header header) {
    this.header = header;
  }

  /**
   * Get idEmployee
   * @return idEmployee
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getIdEmployee() {
    return idEmployee;
  }

  public void setIdEmployee(String idEmployee) {
    this.idEmployee = idEmployee;
  }

}

