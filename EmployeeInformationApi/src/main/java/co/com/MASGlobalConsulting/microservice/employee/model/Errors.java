package co.com.MASGlobalConsulting.microservice.employee.model;

import java.util.ArrayList;
import java.util.List;

import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.springframework.validation.annotation.Validated;

import com.fasterxml.jackson.annotation.JsonProperty;

import io.swagger.annotations.ApiModelProperty;

/**
 * Errors
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-20T19:10:52.217-05:00")

public class Errors   {
  @JsonProperty("errors")
  @Valid
  private List<ErrorDetail> errors = new ArrayList<ErrorDetail>();

  /**
   * Get errors
   * @return errors
  **/
  @ApiModelProperty(required = true, value = "")
  @NotNull

  @Valid

  public List<ErrorDetail> getErrors() {
    return errors;
  }

  public void setErrors(List<ErrorDetail> errors) {
    this.errors = errors;
  }

}

