package com.zfc.security.config;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

@EnableWebSecurity
@Configuration
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class SecurityConfig extends WebSecurityConfigurerAdapter {
   @Autowired
    UserDetailsService userService;

   @Autowired
    public void configureGlobal(AuthenticationManagerBuilder auth) throws Exception {
      // auth.inMemoryAuthentication().passwordEncoder(new BCryptPasswordEncoder()).withUser("zfc").password(new BCryptPasswordEncoder().encode("123456")).roles("USER");
       auth.userDetailsService(userService).passwordEncoder(new BCryptPasswordEncoder());
    }

    @Override
    protected void configure(HttpSecurity http) throws Exception {
        http.authorizeRequests()
                .antMatchers("/css/**", "/index").permitAll()
                .antMatchers("/user/**").hasRole("USER")
                .and()
                .formLogin().loginPage("/login").permitAll().failureUrl("/login-error")
                .and()
                .exceptionHandling().accessDeniedPage("/401");
       http.logout()
               .logoutUrl("/logout")
               .logoutSuccessUrl("/")
               .invalidateHttpSession(true);
    }

}
