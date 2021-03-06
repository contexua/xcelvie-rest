package com.contexua.xcelvie;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import springfox.documentation.builders.PathSelectors;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

/**
 * <h1>Spring Boot Application</h1>
 * <p>
 * sets up a REST controller with persistence in an embeded tomcat runnion on 8080.
 * </p>
 *
 * @author  Hamid, Kevin Gerard
 * @version 1.0
 * @since   13-09-2020
 */
@SpringBootApplication
@EnableSwagger2
public class XcelvieApplication {

	public static void main(String[] args) {
		SpringApplication.run(XcelvieApplication.class, args);
	}

	@Bean
	public Docket productApi() {
		return new Docket(DocumentationType.SWAGGER_2)
				.select()
				.apis(RequestHandlerSelectors.basePackage("com.contexua.xcelvie.controllers"))
				.paths(PathSelectors.any())
				.build();
	}

}
