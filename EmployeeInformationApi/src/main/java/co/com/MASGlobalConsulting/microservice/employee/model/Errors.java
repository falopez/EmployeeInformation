package co.com.MASGlobalConsulting.microservice.employee.model;

import java.util.Objects;
import co.com.MASGlobalConsulting.microservice.employee.model.ErrorDetail;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

/**
 * Errors
 */
@Validated
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-20T19:10:52.217-05:00")

public class Errors   {
  @JsonProperty("errors")
  @Valid
  private List<ErrorDetail> errors = new ArrayList<ErrorDetail>();

  public Errors errors(List<ErrorDetail> errors) {
    this.errors = errors;
    return this;
  }

  public Errors addErrorsItem(ErrorDetail errorsItem) {
    this.errors.add(errorsItem);
    return this;
  }

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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Errors errors = (Errors) o;
    return Objects.equals(this.errors, errors.errors);
  }

  @Override
  public int hashCode() {
    return Objects.hash(errors);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Errors {\n");
    
    sb.append("    errors: ").append(toIndentedString(errors)).append("\n");
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

