package com.vijay.springbootconfig.security;

import org.springframework.context.annotation.Bean;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;

@EnableWebSecurity
public class SecurityConfiguration extends WebSecurityConfigurerAdapter {

	/*
	 * Option 1(main branch): Just start app without this class and just by adding spring security dependency to pom.xml
	 * 			In this, User will be "user" and password will generate in console
	 * 
	 * Option 2 (v01 branch) : Override default username and password using adding user/pass to application.properties
	 * 			application.properties
	 * 				spring.security.user.name=foo
	 * 				spring.security.user.password=foo
	 * 
	 * Current Approach
	 * Option 3: Using extending WebSecurityConfigurerAdapter
	 */
	@Override
	protected void configure(AuthenticationManagerBuilder auth) throws Exception {
		auth.inMemoryAuthentication()
			.withUser("blah")
			.password("blah")
			.roles("USER")
			.and()
			.withUser("foo")
			.password("foo")
			.roles("ADMIN");
	}
	
	@Bean
	PasswordEncoder getPasswordEncoder() {
		return NoOpPasswordEncoder.getInstance();
	}
	
	@Override
	protected void configure(HttpSecurity http) throws Exception {
		http.authorizeRequests()
			.antMatchers("/admin").hasRole("ADMIN")
			.antMatchers("/user").hasAnyRole("ADMIN","USER")
			.antMatchers("/").permitAll()
			.and().formLogin();	
	}	
}
