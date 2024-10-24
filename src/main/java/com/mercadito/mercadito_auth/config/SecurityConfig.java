package com.mercadito.mercadito_auth.config; // Paquete donde se encuentran configuraciones generales

import org.springframework.context.annotation.Bean; // Importar la anotación Bean
import org.springframework.context.annotation.Configuration; // Importar la anotación Configuration
import org.springframework.security.config.annotation.web.builders.HttpSecurity; // Importar HttpSecurity para configurar la seguridad HTTP
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity; // Importar la anotación para habilitar la seguridad web
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder; // Importar la clase BCryptPasswordEncoder para cifrar contraseñas
import org.springframework.security.crypto.password.PasswordEncoder; // Importar la interfaz PasswordEncoder
import org.springframework.security.web.SecurityFilterChain; // Importar SecurityFilterChain para gestionar la cadena de filtros de seguridad

@Configuration // Indica que esta clase es una configuración de Spring
@EnableWebSecurity // Habilita la seguridad web en la aplicación
public class SecurityConfig {

    @Bean // Indica que este método devuelve un bean que será gestionado por el contenedor de Spring
    public SecurityFilterChain securityFilterChain(HttpSecurity http) throws Exception {
        http // Configuración de seguridad HTTP
                .authorizeHttpRequests(authorize -> authorize // Configura las solicitudes HTTP que requieren autorización
                        .anyRequest().permitAll() // Permitir acceso a todas las solicitudes, sin restricciones
                )
                .csrf(csrf -> csrf.disable()); // Deshabilitar protección CSRF (Cross-Site Request Forgery), para pruebas

        return http.build(); // Construir y devolver el objeto SecurityFilterChain configurado
    }

    @Bean // Indica que este método devuelve un bean que será gestionado por el contenedor de Spring
    public PasswordEncoder passwordEncoder() {
        return new BCryptPasswordEncoder(); // Crear y devolver un bean de PasswordEncoder usando BCrypt para cifrado de contraseñas
    }
}
