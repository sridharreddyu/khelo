package com.i2i.khelo.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;

@Configuration
@ComponentScan("com.i2i.khelo.restservice")
@EnableWebMvc
public class AppConfig {
}
