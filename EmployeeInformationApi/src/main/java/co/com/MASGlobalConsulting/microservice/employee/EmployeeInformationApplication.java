package co.com.MASGlobalConsulting.microservice.employee;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EmployeeInformationApplication {

    public static void main(String[] args) throws Exception {
        new SpringApplication(EmployeeInformationApplication.class).run(args);
    }

}
