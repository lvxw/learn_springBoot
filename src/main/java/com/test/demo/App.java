package com.test.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class App {

    @Bean
    @ConfigurationProperties(prefix = "db")
    public MyDruidDatasource datasource2(){
        return  new MyDruidDatasource();
    }

    public static void main(String[] args) {
        SpringApplication.run(App.class,args);
    }
}
