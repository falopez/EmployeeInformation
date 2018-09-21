package co.com.MASGlobalConsulting.microservice.employee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Scope;
import org.springframework.context.annotation.ScopedProxyMode;
import org.springframework.http.HttpHeaders;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

import co.com.MASGlobalConsulting.microservice.employee.api.ApiResponseMessage;
import co.com.MASGlobalConsulting.microservice.employee.service.EmployeeService;

/**
 * Clase que inicializa los Bean's
 * @author Fabi�n L�pez
 * @version 1.0
 *
 */
@Component
public class Configuration {
	
	private static final String HEADER_CONTROLLER = "Content-type=application/json,Cache-Control=no-store,Access-Control-Allow-Origin=*,content-security-policy=default-src 'self'; frame-ancestors 'none'; reflected-xss block,Pragma=no-cache";
	
	@Bean
	public RestTemplate restTemplate() {
		return new RestTemplate();
	}
	
	@Bean
	public ApiResponseMessage apiResponseMessage() {
		return new ApiResponseMessage();
	}
	
	@Bean
	public EmployeeService employeeService() {
		return new EmployeeService();
	}
	
	@Bean
	@Scope(scopeName = "request", proxyMode = ScopedProxyMode.TARGET_CLASS)
	public HttpHeaders httpHeadersController() {
		HttpHeaders mapHeaders = new HttpHeaders();
		for (int i = 0; i < HEADER_CONTROLLER.split(",").length; i++) {
			String[] data =  HEADER_CONTROLLER.split(",")[i].split("=");
			mapHeaders.set(data[0], data[1]);
		}
		return mapHeaders;
	}
	
}