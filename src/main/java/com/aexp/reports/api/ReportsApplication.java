package com.aexp.reports.api;

import com.aexp.reports.beans.mapper.Mapper;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.aexp")
public class ReportsApplication {

	@Bean
	public Mapper modelMapper(){
		return new Mapper();
	}
	public static void main(String[] args) {
		SpringApplication.run(ReportsApplication.class, args);
	}

}
