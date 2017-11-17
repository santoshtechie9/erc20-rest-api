package com.techknowera.erc.app;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

import com.google.common.base.Predicates;

import springfox.documentation.builders.ApiInfoBuilder;
import springfox.documentation.builders.RequestHandlerSelectors;
import springfox.documentation.service.ApiInfo;
import springfox.documentation.spi.DocumentationType;
import springfox.documentation.spring.web.plugins.Docket;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@EnableSwagger2
@SpringBootApplication
@ComponentScan("com.techknowera")
public class ErcApplication {

	public static void main(String[] args) {
		//SpringApplication.run(Application.class, args);

		SpringApplication application = new SpringApplication(ErcApplication.class);
		application.setBannerMode(Banner.Mode.OFF);
		application.run(args);

	}

	@Bean
	public Docket lenderApi() {
		return new Docket(DocumentationType.SWAGGER_2).apiInfo(apiInfo()).select()
				// see https://github.com/springfox/springfox/issues/631
				.apis(Predicates.not(RequestHandlerSelectors.basePackage("org.springframework.boot"))).build();
	}

	private ApiInfo apiInfo() {
		return new ApiInfoBuilder().title("ERC-20 Token RESTful API")
				.description("ERC-20 standard token RESTful service").build();
	}
}
