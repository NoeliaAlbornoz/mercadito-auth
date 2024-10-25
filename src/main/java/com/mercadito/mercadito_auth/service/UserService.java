package com.mercadito.mercadito_auth.service; // Paquete donde se encuentra el servicio de usuarios

import com.mercadito.mercadito_auth.model.User; // Importa la entidad User
import com.mercadito.mercadito_auth.repository.UserRepository; // Importa el repositorio UserRepository
import org.springframework.beans.factory.annotation.Autowired; // Importa la anotación para la inyección de dependencias
import org.springframework.security.crypto.password.PasswordEncoder; // Importa PasswordEncoder para codificar contraseñas
import org.springframework.stereotype.Service; // Importa la anotación Service para indicar que es un servicio

/**
 * UserService es una clase de servicio que maneja la lógica de negocio relacionada con los usuarios.
 * Proporciona métodos para realizar operaciones CRUD sobre la entidad User.
 */
@Service // Marca esta clase como un servicio manejado por Spring
public class UserService {

    @Autowired // Inyecta el UserRepository en este servicio
    private UserRepository userRepository; // Repositorio para acceder a la base de datos de usuarios

    @Autowired // Inyecta el UserRepository en este servicio
    private PasswordEncoder passwordEncoder; // Codificador de contraseñas

    /**
     * Crea un nuevo usuario en el repositorio.
     *
     * @param user el usuario a crear.
     * @return el usuario creado con su ID asignado.
     */
    public User createUser(User user) {
        user.setPassword(passwordEncoder.encode(user.getPassword())); // Codifica la contraseña
        return userRepository.save(user); // Guarda el usuario en el repositorio
    }

}

