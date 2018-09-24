package co.com.MASGlobalConsulting.microservice.employee.model;

import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * GetEmployeeRequest
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-20T19:10:52.217-05:00")

public class GetEmployeeRequest   {
  @JsonProperty("data")
  @Valid
  private List<RequestData> data;

  /**
   * Get data
   * @return data
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<RequestData> getData() {
    return data;
  }

  public void setData(List<RequestData> data) {
    this.data = data;
  }

}

