package com.mercadito.mercadito_auth.model; // Paquete donde se encuentra la clase User

import lombok.Data; // Importa la anotación Data de Lombok para generación automática de métodos
import lombok.NoArgsConstructor; // Importa la anotación para crear un constructor sin argumentos
import lombok.AllArgsConstructor; // Importa la anotación para crear un constructor con todos los argumentos

import jakarta.persistence.*; // Importa las anotaciones de JPA para la persistencia
import io.swagger.v3.oas.annotations.media.Schema; // Importa la anotación Schema de OpenAPI para la documentación

@Entity // Indica que esta clase es una entidad de JPA
@Table(name = "users") // Especifica el nombre de la tabla en la base de datos
@Data // Lombok: Genera automáticamente los métodos getters, setters, toString, equals y hashCode
@NoArgsConstructor // Lombok: Genera un constructor sin argumentos
@AllArgsConstructor // Lombok: Genera un constructor que acepta todos los argumentos
public class User {

    @Id // Indica que este campo es la clave primaria de la entidad
    @GeneratedValue(strategy = GenerationType.IDENTITY) // Indica que el valor se generará automáticamente
    @Schema(description = "ID único del usuario") // Describe el campo para la documentación de OpenAPI
    private Long id; // Campo que representa el ID del usuario

    @Column(unique = true, nullable = false) // Especifica que el campo debe ser único y no puede ser nulo
    @Schema(description = "Nombre de usuario único") // Describe el campo para la documentación de OpenAPI
    private String username; // Campo que representa el nombre de usuario

    @Column(nullable = false) // Especifica que el campo no puede ser nulo
    @Schema(description = "Contraseña del usuario") // Describe el campo para la documentación de OpenAPI
    private String password; // Campo que representa la contraseña del usuario

}
