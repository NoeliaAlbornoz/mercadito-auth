package com.mercadito.mercadito_auth.controller; // Paquete de Controladores

import com.mercadito.mercadito_auth.model.User; // Importa la entidad Usuario que representa a los usuarios en la base de datos
import com.mercadito.mercadito_auth.service.UserService; // Importa el servicio UserService para manejar la lógica de usuarios
import org.springframework.beans.factory.annotation.Autowired; // Importa la anotación para la inyección de dependencias en Spring
import org.springframework.http.ResponseEntity; // Importa la clase ResponseEntity para manejar respuestas HTTP personalizadas
import org.springframework.web.bind.annotation.*; // Importa las anotaciones necesarias para construir controladores RESTful
import io.swagger.v3.oas.annotations.Operation; // Importa la anotación para describir operaciones en OpenAPI
import io.swagger.v3.oas.annotations.responses.ApiResponse; // Importa la anotación para definir respuestas en OpenAPI

@RestController // Indica que esta clase es un controlador REST
@RequestMapping("/users") // Define la URL base para todas las rutas de este controlador
public class UserController {

    @Autowired // Inyecta automáticamente el servicio UserService
    private UserService userService; // Servicio para manejar la lógica de usuarios

    // Crear un nuevo usuario
    @PostMapping // Mapea las solicitudes HTTP POST a este método
    @Operation(summary = "Crear un nuevo usuario", description = "Crea un nuevo usuario en la base de datos.") // Describe la operación de cada endpoint
    @ApiResponse(responseCode = "201", description = "Usuario creado exitosamente.") // Proporciona información sobre los códigos de respuesta esperados y su significado
    public ResponseEntity<User> createUser(@RequestBody User user) {
        User createdUser = userService.createUser(user); // Crea un nuevo usuario
        return ResponseEntity.status(201).body(createdUser); // Retorna el usuario creado con un código 201
    }

}
