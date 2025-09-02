package com.example.controller;

import org.springframework.security.core.Authentication;
import org.springframework.security.oauth2.jwt.Jwt;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/api/secure")
public class HelloController {

	@GetMapping("/hello")
	public String hello(Authentication authentication) {
	    Jwt jwt = (Jwt) authentication.getPrincipal();
	    String username = jwt.getClaim("unique_name");
	    System.out.println(jwt.getTokenValue());
	    return "Hello " + username + " from Spring MVC secured API";
	}
}
