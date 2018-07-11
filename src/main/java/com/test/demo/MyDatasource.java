package com.test.demo;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Setter@Getter@ToString
public class MyDatasource {
    private String username;
    private String password;
    private String url;
    private String driverClassName;
}
