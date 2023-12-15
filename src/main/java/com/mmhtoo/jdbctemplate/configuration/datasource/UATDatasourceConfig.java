package com.mmhtoo.jdbctemplate.configuration.datasource;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;

import javax.sql.DataSource;

@Configuration
@Profile("uat")
public class UATDatasourceConfig {

  @Value("${services.db.username}")
  private String USERNAME;

  @Value("${services.db.password}")
  private String PASSWORD;

  @Bean
  public DataSource dataSource(){
    return DataSourceBuilder.create()
        .url("jdbc:mysql://localhost:3306/users_uat")
        .driverClassName("com.mysql.cj.jdbc.Driver")
        .username(USERNAME)
        .password(PASSWORD)
        .build();
  }

}
