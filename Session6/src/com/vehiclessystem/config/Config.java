package com.vehiclessystem.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:Application.properties")
@ComponentScan("com.vehiclessystem.config")
public class Config {
}
