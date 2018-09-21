package co.com.MASGlobalConsulting.microservice.employee.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.service.Contact;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@javax.annotation.Generated(value = "io.swagger.codegen.languages.SpringCodegen", date = "2018-09-20T19:10:52.217-05:00")

@EnableSwagger2
@Configuration
public class SwaggerDocumentationConfig {

    ApiInfo apiInfo() {
        return new ApiInfoBuilder()
            .title("Payroll employees")
            .description("API to obtain employee information, including a calculated annual salary")
            .license("")
            .licenseUrl("http://unlicense.org")
            .termsOfServiceUrl("")
            .version("1.0.0")
            .contact(new Contact("","", "andresbox5@gmail.com"))
            .build();
    }

    @Bean
    public Docket customImplementation(){
        return new Docket(DocumentationType.SWAGGER_2)
                .select()
                    .apis(RequestHandlerSelectors.basePackage("co.com.MASGlobalConsulting.microservice.employee.api"))
                    .apis(RequestHandlerSelectors.basePackage("co.com.MASGlobalConsulting.microservice.employee.bo"))
                    .apis(RequestHandlerSelectors.basePackage("co.com.MASGlobalConsulting.microservice.employee.config"))
                    .apis(RequestHandlerSelectors.basePackage("co.com.MASGlobalConsulting.microservice.employee.controller"))
                    .apis(RequestHandlerSelectors.basePackage("co.com.MASGlobalConsulting.microservice.employee.dto"))
                    .apis(RequestHandlerSelectors.basePackage("co.com.MASGlobalConsulting.microservice.employee.model"))
                    .apis(RequestHandlerSelectors.basePackage("co.com.MASGlobalConsulting.microservice.employee.service"))
                    .apis(RequestHandlerSelectors.basePackage("co.com.MASGlobalConsulting.microservice.employee.utilities"))
                    .paths(PathSelectors.any())
                    .build()
                .apiInfo(apiInfo());
    }

}
