package com.app;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Random;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
//import org.json.simple.JSONArray;
//import org.json.simple.JSONObject;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.servlet.ModelAndView;

import com.app.model.EmployeeDTO;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 * @author Fabiàn Lòpez
 *
 */

@Controller
@RequestMapping("/index")
public class IndexController {

	private static final String URL_SERVICE_EMPLOYEE_INFORMATION = "http://localhost:8081/base/employeeInformation";
	private static final Logger log = LoggerFactory.getLogger(IndexController.class);
	private static HttpHeaders header = new HttpHeaders();
	private static final String DATA = "data";
	
	@RequestMapping(value="", method=RequestMethod.GET)
    public ModelAndView index() {
        ModelAndView model = new ModelAndView("index");
        return model;
    }
	
	@SuppressWarnings({ "rawtypes", "static-access", "unchecked" })
	@RequestMapping(value = "/get", method = RequestMethod.POST)
	public ModelAndView doPost(@RequestParam("idEmployee") String id) {
		ModelAndView model = new ModelAndView("index");
		try {
			Random random = new Random();
			JSONObject jsonObject = new JSONObject();
			JSONObject jsonObjectHeader = new JSONObject();
			JSONObject jsonObjectData = new JSONObject();
			jsonObjectHeader.put("id", String.format("%04d", random.nextInt(10000)));
			jsonObjectHeader.put("type", "employeeInformation");
			jsonObjectData.put("header", jsonObjectHeader);
			jsonObjectData.put("idEmployee", id);
			JSONArray jsonArray = new JSONArray();
			jsonArray.add(jsonObjectData);
			jsonObject.put("data", jsonArray);
			RestTemplate restTemplate = new RestTemplate();
			HttpEntity<Object> entity = new HttpEntity<>(jsonObject, this.header);
			ResponseEntity<?> clientResponse = restTemplate.postForEntity(URL_SERVICE_EMPLOYEE_INFORMATION, entity,
					Object.class);
			ObjectMapper mapper = new ObjectMapper();
			JSONObject getEmployeeResponse = mapper.convertValue(clientResponse.getBody(), JSONObject.class);
			if (clientResponse.getStatusCode().equals(HttpStatus.OK)) {
				List<LinkedHashMap> listData = (ArrayList) getEmployeeResponse.get(DATA);
				List<EmployeeDTO> listEmployeeDTO = new ArrayList<>();
				for (LinkedHashMap hashMap : listData) {
					EmployeeDTO employeeDTO = mapper.convertValue(hashMap, EmployeeDTO.class);
					listEmployeeDTO.add(employeeDTO);
				}
				model.addObject("employees", listEmployeeDTO);
			} else {
				List<LinkedHashMap> listError = (ArrayList) getEmployeeResponse.get("errors");
				model.addObject("danger", listError.get(0).get("detail"));
			}
		} catch (Exception e) {
			log.error(e.getMessage(), e);
		}
		return model;
	}
	
   
}
