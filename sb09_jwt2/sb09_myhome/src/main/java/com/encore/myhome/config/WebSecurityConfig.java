package com.encore.myhome.config;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.DependsOn;
import org.springframework.context.annotation.Primary;
import org.springframework.jdbc.datasource.DriverManagerDataSource;
import org.springframework.security.authentication.AuthenticationManager;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.authentication.configuration.AuthenticationConfiguration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;
//import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;

@Configuration
@EnableWebSecurity
//@DependsOn("dataSource") 
public class WebSecurityConfig {

	@Autowired
//    private DataSource customDataSource; 
	private DataSource dataSource;

//	@Autowired
	public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
		auth.jdbcAuthentication().dataSource(dataSource).passwordEncoder(passwordEncoder())
				.usersByUsernameQuery("select username, password, enabled " 
										+ "from user " 
										+ "where username = ?")
				.authoritiesByUsernameQuery(
									"select u.username, r.name " + "from user_role ur inner join user u on ur.user_id = u.id "
											+ "inner join role r on ur.role_id = r.id " 
											+ "where u.username = ?");
	}

	@Bean
	public PasswordEncoder passwordEncoder() {
		return new BCryptPasswordEncoder();
	}

//	@Bean(name = "dataSource")
//	public DataSource dataSource() {
//		DriverManagerDataSource dataSource = new DriverManagerDataSource();
//		dataSource.setDriverClassName("yourDatabaseDriverClassName");
//		dataSource.setUrl("yourDatabaseUrl");
//		dataSource.setUsername("yourDatabaseUsername");
//		dataSource.setPassword("yourDatabasePassword");
//		return dataSource;
//	}

//    @Bean
//    public void  httpSecurity() throws Exception {
//        http.authorizeRequests()
//                .requestMatchers("/", "/account/register", "/css/**").permitAll()
//                .anyRequest().authenticated()
//                .and()
//            .formLogin()
//                .loginPage("/account/login")
//                .permitAll()
//                .and()
//            .logout()
//                .permitAll()
//                .and()
//            .csrf().disable();
//        
//        return http;
//    }

//	@Bean
//	public HttpSecurity httpSecurity(HttpSecurity http) throws Exception {
//		return http.authorizeRequests().requestMatchers("/", "/account/register", "/css/**").permitAll().anyRequest()
//				.authenticated().and().formLogin().loginPage("/account/login").permitAll().and().logout().permitAll()
//				.and().csrf().disable();
//	}
	@Bean
	public SecurityFilterChain configure(HttpSecurity http) throws Exception {

		http.authorizeRequests().requestMatchers("/", "/account/register", "/css/**").permitAll().anyRequest()
		.authenticated().and().formLogin().loginPage("/account/login").permitAll().and().logout().permitAll()
		.and().csrf().disable();
		
		return http.build();
	}

	@Bean
	public AuthenticationManager authenticationManager(AuthenticationConfiguration authConfig) throws Exception {
		return authConfig.getAuthenticationManager();
	}
}
