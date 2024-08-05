package com.dangeun.config;

import org.springframework.boot.autoconfigure.security.servlet.PathRequest;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityCustomizer;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.web.SecurityFilterChain;

@Configuration
@EnableWebSecurity
public class SecurityConfig {
    @Bean
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception{

        http.formLogin(config -> {
            config.loginPage("/user/login")
                    .usernameParameter("id")
                    .defaultSuccessUrl("/main");
        });

        http.logout(config -> {
            config.logoutUrl("/user/logout")
                    .logoutSuccessUrl("/main")
                    .deleteCookies("JSESSIONID") // Cookie 제거
                    .invalidateHttpSession(true) // Session 초기화
                    .clearAuthentication(true)
                    .permitAll();
        });


        http.authorizeHttpRequests(registry -> {
            registry.requestMatchers("/write")
                    .authenticated()
                    .requestMatchers("/chat")
                    .authenticated()
                    .requestMatchers("/chat/*")
                    .authenticated()
                    .requestMatchers("/board/*")
                    .authenticated()
                    .anyRequest().permitAll();
        });

        return http.build();


    }

    @Bean
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder();
    }

    @Bean
    public WebSecurityCustomizer webSecurityCustomizer(){
        return web -> web.ignoring().requestMatchers(PathRequest.toStaticResources().atCommonLocations());
    }





}
