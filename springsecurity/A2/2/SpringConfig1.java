package com.spring.A2;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.crypto.password.PasswordEncoder;

public class SpringConfig1 {
	public class SecurityConfig extends WebSecurityConfigurerAdapter {
		
		private final PasswordEncoder passwordEncoder;
		
		
		@Autowired
		public SecurityConfig (PasswordEncoder passwordEncoder) {
			this.passwordEncoder = passwordEncoder;
		}
		
	    @Override
	    protected void configure(AuthenticationManagerBuilder auth) throws Exception {
	        auth.inMemoryAuthentication()
	                .withUser("karthik")
	                .password(passwordEncoder.encode("karthik"))
	                .roles("USER")
	                .and()
	                .withUser("mo")
	                .password(passwordEncoder.encode("mo"))
	                .roles("ADMIN");
	    }


	    @Override
	    protected void configure(HttpSecurity http) throws Exception {
	        http.authorizeRequests()
	                .antMatchers("/admin").hasRole("ADMIN")
	                .antMatchers("/user").hasAnyRole("ADMIN", "USER")
	                .antMatchers("/").permitAll()
	                .and().formLogin();
	    }

}}
