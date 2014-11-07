package com.realdolmen.config;


import org.apache.commons.dbcp.BasicDataSource;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

import javax.sql.DataSource;

/**
 * Created by BPTAT47 on 6/11/2014.
 */
@Configuration
@EnableWebSecurity
public class SecurityConfig extends WebSecurityConfigurerAdapter {

    @Autowired
    public void configureGlobal(AuthenticationManagerBuilder authenticationManagerBuilder) throws Exception {
        authenticationManagerBuilder.
                jdbcAuthentication().
                dataSource(dataSource())
                .usersByUsernameQuery("select email as username,password,enabled from employee where email=?")
                .authoritiesByUsernameQuery("select empl.email as username,CONCAT('ROLE_',empl_roles.roles) as authority,empl.id from employee as empl,employee_roles as empl_roles where empl.id = empl_roles.Employee_id and empl.email = ?");

    }

    @Bean
    public DataSource dataSource(){
        BasicDataSource basicDataSource = new BasicDataSource();
        basicDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        basicDataSource.setUrl("jdbc:mysql://localhost:3306/rdfleet");
        basicDataSource.setUsername("root");
        basicDataSource.setPassword("root");
        return basicDataSource;

    }

    protected void configure(HttpSecurity httpSecurity) throws Exception {
        httpSecurity.authorizeRequests()
                .antMatchers("/resources/**").permitAll()
                .antMatchers("/j_spring_security_check").permitAll()
                .antMatchers("/*").permitAll()
                .antMatchers("/car/*").hasRole("EMPLOYEE")
                .antMatchers("/ordercar/*").hasRole("EMPLOYEE")
                .antMatchers("/car").permitAll()
                .antMatchers("/admin/*").hasRole("FLEET_MANAGER")
                .antMatchers("/**").hasRole("FORBIDDEN")
                .and()
                .formLogin().loginPage("/login").permitAll().loginProcessingUrl("/processLogin")
                .defaultSuccessUrl("/car")
                .failureUrl("/login?error")
                .usernameParameter("email")
                .passwordParameter("password")
                .and()
                .logout().logoutSuccessUrl("/").invalidateHttpSession(true).permitAll()
                .and().exceptionHandling().accessDeniedPage("/views/error/layout-error.jsp");
    }
}
