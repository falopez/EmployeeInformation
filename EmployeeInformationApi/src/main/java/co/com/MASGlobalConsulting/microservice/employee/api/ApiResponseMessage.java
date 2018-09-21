package co.com.MASGlobalConsulting.microservice.employee.api;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;

import co.com.MASGlobalConsulting.microservice.employee.dto.EmployeeDTO;
import co.com.MASGlobalConsulting.microservice.employee.model.ErrorDetail;
import co.com.MASGlobalConsulting.microservice.employee.model.Errors;
import co.com.MASGlobalConsulting.microservice.employee.model.GetEmployeeResponse;
import co.com.MASGlobalConsulting.microservice.employee.model.ResponseData;
import co.com.MASGlobalConsulting.microservice.employee.utilities.TransactionCodes;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-20T19:10:52.217-05:00")

@Component
public class ApiResponseMessage {

	@Autowired
	private HttpHeaders httpHeaders;

	/**
	 * Método para crear una respuesta exitosa
	 * 
	 * @param id
	 * @param type
	 * @return Respuesta Exitosa
	 */
	public ResponseEntity<?> createResponseEmployeeFoundOK(String idRequest, EmployeeDTO employeeDTO) {
		if (null != employeeDTO && null != employeeDTO.getId()) {
			GetEmployeeResponse getEmployeeResponse = new GetEmployeeResponse();
			List<ResponseData> listResponseData = new ArrayList<>();
			setEmployee(listResponseData, employeeDTO, idRequest);
			getEmployeeResponse.setData(listResponseData);
			return new ResponseEntity<>(getEmployeeResponse, httpHeaders, HttpStatus.OK);
		} else {
			return createResponseEntityErrors(TransactionCodes.USER_NOT_FOUND.getMessage(),
					TransactionCodes.USER_NOT_FOUND.getCode(), idRequest);
		}
	}

	public ResponseEntity<GetEmployeeResponse> createResponseAllEmployeeOK(String idRequest,
			List<EmployeeDTO> listEmployeeDTO) {
		
		GetEmployeeResponse getEmployeeResponse = new GetEmployeeResponse();
		List<ResponseData> listResponseData = new ArrayList<>();
		listEmployeeDTO.forEach(item -> setEmployee(listResponseData, item, idRequest));
		getEmployeeResponse.setData(listResponseData);
		return new ResponseEntity<>(getEmployeeResponse, httpHeaders, HttpStatus.OK);
	}

	public void setEmployee(List<ResponseData> listResponseData, EmployeeDTO employeeDTO, String idRequest) {
		ResponseData responseData = new ResponseData();
		responseData.setIdRequest(idRequest);
		responseData.setAnnualSalary(employeeDTO.getAnnualSalary());
		responseData.setContractTypeName(employeeDTO.getContractTypeName());
		responseData.setHourlySalary(employeeDTO.getHourlySalary());
		responseData.setId(employeeDTO.getId());
		responseData.setMonthlySalary(employeeDTO.getMonthlySalary());
		responseData.setName(employeeDTO.getName());
		responseData.setRoleDescription(employeeDTO.getRoleDescription());
		responseData.setRoleId(employeeDTO.getRoleId());
		responseData.setRoleName(employeeDTO.getRoleName());
		listResponseData.add(responseData);
	}

	/**
	 * Método encargado de brindar un error de negocio o interval server
	 * 
	 * @param message
	 * @param code
	 * @param id
	 * @param meta
	 * @return Error
	 */
	public ResponseEntity<Errors> createResponseEntityErrors(String message, String code, String id) {
		ErrorDetail errorDetail = new ErrorDetail();
		Errors error = new Errors();
		List<ErrorDetail> errors = new ArrayList<ErrorDetail>();
		errorDetail.setIdRequest(id);
		errorDetail.setCode(code);
		errorDetail.setDetail(message);
		errors.add(errorDetail);
		error.setErrors(errors);
		if (code.equalsIgnoreCase(TransactionCodes.INTERNAL_SERVER_ERROR.getCode()))
			return new ResponseEntity<>(error, httpHeaders, HttpStatus.INTERNAL_SERVER_ERROR);
		else
			return new ResponseEntity<>(error, httpHeaders, HttpStatus.FAILED_DEPENDENCY);
	}

}