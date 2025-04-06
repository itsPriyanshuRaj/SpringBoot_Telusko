package com.priyanshuRaj.Spring.security.with.Gemini.Config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.http.HttpMethod;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.security.crypto.password.NoOpPasswordEncoder;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.security.provisioning.InMemoryUserDetailsManager;
import org.springframework.security.web.SecurityFilterChain;
import org.springframework.security.web.access.AccessDeniedHandler;
import org.springframework.security.web.csrf.CookieCsrfTokenRepository;

@Configuration
@EnableWebSecurity
public class SecurityConfig {

    @Bean
    public SecurityFilterChain filterChain(HttpSecurity http) throws Exception {
        http
                .csrf(csrf -> csrf
//                                .disable()
                        .csrfTokenRepository(CookieCsrfTokenRepository.withHttpOnlyFalse())
                )
                .authorizeHttpRequests(authz->authz
                        .requestMatchers("/signin").permitAll()
                        .requestMatchers("/public/**").hasRole("NORMAL")
                        .requestMatchers("/user/**").hasRole("USER")
                        .anyRequest()
                        .authenticated()
                )
//                .httpBasic(httpBasic -> httpBasic.realmName("User resources"));
                .formLogin(formLogin -> formLogin
                        .loginPage("/signin")
//                        .permitAll()
                );
        return http.build();
    }


    @Bean
    public InMemoryUserDetailsManager userDetailsService() {
        UserDetails normal = User.withUsername("abc")
                .password(this.passwordEncoder().encode("dell"))
                .roles("NORMAL")
                .build();

        UserDetails user = User.withUsername("priyanshu")
                .password(this.passwordEncoder().encode("raj"))
                .roles("USER")
                .build();

        UserDetails admin = User.withUsername("admin")
                .password(this.passwordEncoder().encode("admin123"))
                .roles("ADMIN")
                .build();

        return new InMemoryUserDetailsManager(normal,user, admin);
    }

    @Bean
    public PasswordEncoder passwordEncoder(){
        return new BCryptPasswordEncoder(10);
    }
}
