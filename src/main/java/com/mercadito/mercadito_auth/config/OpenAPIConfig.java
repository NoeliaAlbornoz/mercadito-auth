package com.mercadito.mercadito_auth.config; // Paquete de Configuraciones

import io.swagger.v3.oas.models.info.Info; // Importa la clase Info para proporcionar metadatos de la API (título, versión, descripción)
import io.swagger.v3.oas.models.OpenAPI; // Importa OpenAPI, que representa el objeto raíz para la configuración de OpenAPI
import org.springframework.context.annotation.Bean; // Importa la anotación @Bean para definir beans gestionados por Spring
import org.springframework.context.annotation.Configuration; // Importa @Configuration para indicar que esta clase es una configuración de Spring

@Configuration // Indica que esta clase es una configuración de Spring
public class OpenAPIConfig {

    /**
     * Define un bean OpenAPI personalizado para configurar la documentación de la API.
     *
     * @return Un objeto OpenAPI configurado con la información básica de la API.
     */
    @Bean // Marca este método como un bean gestionado por el contenedor de Spring
    public OpenAPI customOpenAPI() {
        return new OpenAPI() // Crea una instancia de OpenAPI
                .info(new Info() // Agrega metadatos para la API usando la clase Info
                        .title("Mercadito API") // Establece el título de la API
                        .version("1.0") // Define la versión de la API
                        .description("Documentación de la API para el microservicio de autenticación Mercadito")); // Proporciona una descripción de la API
    }
}
