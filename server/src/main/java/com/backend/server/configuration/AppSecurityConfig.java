package com.backend.server.configuration; // Package declaration for the "configuration" package under "com.backend.server"

import org.springframework.beans.factory.annotation.Autowired; // Import Spring annotation for dependency injection
import org.springframework.context.annotation.Bean; // Import Spring annotation for defining a bean
import org.springframework.context.annotation.Configuration; // Import Spring annotation for configuration
import org.springframework.security.authentication.AuthenticationProvider; // Import Spring Security class for authentication provider
import org.springframework.security.authentication.dao.DaoAuthenticationProvider; // Import Spring Security class for DAO authentication provider
import org.springframework.security.config.annotation.web.builders.HttpSecurity; // Import Spring Security class for HTTP security configuration
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity; // Import Spring Security annotation to enable web security
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfiguration; // Import Spring Security web configuration class
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter; // Import Spring Security adapter class for web security configuration
import org.springframework.security.core.userdetails.User; // Import Spring Security class for UserDetails
import org.springframework.security.core.userdetails.UserDetails; // Import Spring Security class for UserDetails
import org.springframework.security.core.userdetails.UserDetailsService; // Import Spring Security class for UserDetailsService
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; // Import Spring Security class for BCrypt password encoder
import org.springframework.security.crypto.password.PasswordEncoder; // Import Spring Security interface for password encoder
import org.springframework.security.provisioning.InMemoryUserDetailsManager; // Import Spring Security class for in-memory user details manager
import org.springframework.security.web.SecurityFilterChain; // Import Spring Security web class for security filter chain
import org.springframework.security.web.util.matcher.AntPathRequestMatcher; // Import Spring Security class for AntPathRequestMatcher

import java.util.ArrayList; // Import Java utility class for ArrayList
import java.util.List; // Import Java utility class for List

@Configuration // Indicates that this class contains Spring configuration
@EnableWebSecurity // Enable Spring Security for web applications
// See [Issue6] (https://github.com/WSUCEG-7140/mystore-teamDelta/issues/6) 
public class AppSecurityConfig {
    @Autowired // Enables automatic injection of a UserDetailsService bean
    UserDetailsService userDetailsService;
    @Bean // Define a bean for AuthenticationProvider
    public AuthenticationProvider authProvider(){
        DaoAuthenticationProvider provider=new DaoAuthenticationProvider();
        provider.setUserDetailsService(userDetailsService); // Set the custom UserDetailsService
        provider.setPasswordEncoder(new BCryptPasswordEncoder()); // Use BCrypt password encoder
        return provider;
    }

    @Bean // Define a bean for SecurityFilterChain
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        return http.csrf().disable().authorizeHttpRequests().anyRequest().permitAll().and().build();
    }

}
