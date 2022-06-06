package com.aexp.reports.api;

import com.aexp.reports.beans.mapper.Mapper;
import com.mysql.cj.xdevapi.SessionFactory;
import org.modelmapper.ModelMapper;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

import java.sql.Connection;
import java.sql.DriverManager;

@SpringBootApplication
@ComponentScan("com.aexp.reports")
@EntityScan("com.aexp.reports")
@EnableJpaRepositories(basePackages = "com.aexp.reports")
public class ReportsApplication {

	@Bean
	public Mapper modelMapper(){
		return new Mapper();
	}

	public static void main(String[] args) {
		SpringApplication.run(ReportsApplication.class, args);
	}

}
