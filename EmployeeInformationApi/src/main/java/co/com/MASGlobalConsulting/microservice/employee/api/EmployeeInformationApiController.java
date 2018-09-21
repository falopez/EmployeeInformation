package co.com.MASGlobalConsulting.microservice.employee.api;

import javax.validation.Valid;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;

import co.com.MASGlobalConsulting.microservice.employee.bo.EmployeeBO;
import co.com.MASGlobalConsulting.microservice.employee.model.GetEmployeeRequest;
import io.swagger.annotations.ApiParam;
@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-20T19:10:52.217-05:00")

@Controller
public class EmployeeInformationApiController implements EmployeeInformationApi {

    private static final Logger log = LoggerFactory.getLogger(EmployeeInformationApiController.class);
    
    @Autowired
    @Qualifier("employeeBOImpl")
    private EmployeeBO employeeBO;
    @Autowired
    private ApiResponseMessage apiResponseMessage;

    @SuppressWarnings("unchecked")
	public ResponseEntity<?> employeeInformationPost(@ApiParam(value = "body" ,required=true )  @Valid @RequestBody GetEmployeeRequest body) {
        String idEmployee = null;
        String idRequest = null;
    	try {
    		idEmployee = body.getData().get(0).getIdEmployee();
    		idRequest = body.getData().get(0).getHeader().getId();
    		if(null != idEmployee && !idEmployee.isEmpty() && idEmployee.length() > 0 ) {
    			return apiResponseMessage.createResponseEmployeeFoundOK(idRequest, employeeBO.getEmployee(idEmployee));
    		} else {
    			return apiResponseMessage.createResponseAllEmployeeOK(idRequest, employeeBO.getEmployees());
    		}
        }catch (NullPointerException e) {
        	log.error(e.getMessage(), e);
        	return apiResponseMessage.createResponseEntityErrors(e.getMessage(), String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value())
        			, idRequest);
		} catch (Exception e) {
        	log.error(e.getMessage(), e);
        	return apiResponseMessage.createResponseEntityErrors(e.getMessage(), String.valueOf(HttpStatus.INTERNAL_SERVER_ERROR.value())
        			, idRequest);
		}
        
    }

}
