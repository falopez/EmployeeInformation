package co.com.MASGlobalConsulting.microservice.employee.model;

import java.util.Objects;
import co.com.MASGlobalConsulting.microservice.employee.model.Header;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import org.springframework.validation.annotation.Validated;
import javax.validation.Valid;
import javax.validation.constraints.*;

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

  public RequestData header(Header header) {
    this.header = header;
    return this;
  }

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

  public RequestData idEmployee(String idEmployee) {
    this.idEmployee = idEmployee;
    return this;
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


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RequestData requestData = (RequestData) o;
    return Objects.equals(this.header, requestData.header) &&
        Objects.equals(this.idEmployee, requestData.idEmployee);
  }

  @Override
  public int hashCode() {
    return Objects.hash(header, idEmployee);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RequestData {\n");
    
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    idEmployee: ").append(toIndentedString(idEmployee)).append("\n");
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

