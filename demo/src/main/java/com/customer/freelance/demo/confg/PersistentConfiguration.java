package com.customer.freelance.demo.confg;


import javax.sql.DataSource;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.boot.autoconfigure.flyway.FlywayDataSource;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class PersistentConfiguration {
//	@Bean
//	@Primary
//	@ConfigurationProperties(prefix="spring.datasource")
//	public DataSource dataSource() {
//		
//		return DataSourceBuilder.create().build();
//	}
	
	@Bean
	@FlywayDataSource
	@ConfigurationProperties(prefix="flyway.datasource")
	public DataSource flywayDataSource() {
		DataSourceBuilder dataSourceBuilder = DataSourceBuilder.create();
        dataSourceBuilder.driverClassName("org.h2.Driver");
        dataSourceBuilder.url("jdbc:h2:file:~/empdb");
        dataSourceBuilder.username("sa");
        dataSourceBuilder.password("");
		return dataSourceBuilder.build();
	}

}
