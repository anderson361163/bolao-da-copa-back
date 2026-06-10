package br.com.anderson.bolao_copa;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class BolaoCopaApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(BolaoCopaApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(BolaoCopaApplication.class);
	}

}
