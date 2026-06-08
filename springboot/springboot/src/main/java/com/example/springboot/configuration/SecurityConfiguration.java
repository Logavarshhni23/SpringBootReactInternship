package com.example.springboot.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.Customizer;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
public class SecurityConfiguration {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http)throws Exception{

        //user can enter without authorization due to permit all
        http.authorizeHttpRequests(requests-> requests.requestMatchers("/","/home").permitAll());
        //only user with authentication is allowed
        http.authorizeHttpRequests((requests->requests.anyRequest().authenticated()));
        http.oauth2Login(Customizer.withDefaults());
        return http.build();
    }
}
