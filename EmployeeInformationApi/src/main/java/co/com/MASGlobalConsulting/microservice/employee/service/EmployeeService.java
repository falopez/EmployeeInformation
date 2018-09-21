package co.com.MASGlobalConsulting.microservice.employee.service;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestClientException;
import org.springframework.web.client.RestTemplate;

@Component
public class EmployeeService {

	private static final Logger log = LoggerFactory.getLogger(EmployeeService.class);

	@Autowired
	private RestTemplate restTemplate;

	private static final String URL_SERVICE = "http://masglobaltestapi.azurewebsites.net/api/employees";

	public Object[] getEmployees() {
		try {
			return restTemplate.getForObject(URL_SERVICE, Object[].class);
		} catch (RestClientException e) {
			log.error(e.getMessage(), e);
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return null;
	}

}
