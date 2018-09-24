package co.com.MASGlobalConsulting.microservice.employee.model;

import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * ErrorDetail
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-20T19:10:52.217-05:00")

public class ErrorDetail   {
  @JsonProperty("code")
  private String code = null;

  @JsonProperty("detail")
  private String detail = null;

  @JsonProperty("idRequest")
  private String idRequest = null;

  /**
   * Get code
   * @return code
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  /**
   * Get detail
   * @return detail
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull


  public String getDetail() {
    return detail;
  }

  public void setDetail(String detail) {
    this.detail = detail;
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

}

