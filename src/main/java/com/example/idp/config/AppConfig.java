package com.example.idp.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.support.PropertySourcesPlaceholderConfigurer;

@Configuration
@PropertySource("classpath:application.properties")
public class AppConfig {
    @Bean
    public static PropertySourcesPlaceholderConfigurer propertyConfig() {
        return new PropertySourcesPlaceholderConfigurer();
    }
    
    @Value("${spring.security.oauth2.resourceserver.jwt.jwk-set-uri}")
	private String JWTSetUri;

	public String getJWTSetUri() {
		return JWTSetUri;
	}

	public void setJWTSetUri(String jWTSetUri) {
		JWTSetUri = jWTSetUri;
	} 
    
}
