package com.dockerdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.annotation.Bean;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.transaction.annotation.EnableTransactionManagement;

@SpringBootApplication
@EnableConfigurationProperties
/*@EnableJpaRepositories(basePackages = "com.dockerdemo.repository.CustomerRepository")
@EnableTransactionManagement*/
/*@EntityScan(basePackages = {"com.dockerdemo.Entity.Customer","com.dockerdemo.Entity.CustomerAddress"})*/
public class DockerdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(DockerdemoApplication.class, args);
	}

}
