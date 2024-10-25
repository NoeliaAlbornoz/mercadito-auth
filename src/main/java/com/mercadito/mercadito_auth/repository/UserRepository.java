package com.mercadito.mercadito_auth.repository; // Paquete donde se encuentra el repositorio

import com.mercadito.mercadito_auth.model.User; // Importa la entidad User
import org.springframework.data.jpa.repository.JpaRepository; // Importa la interfaz JpaRepository

/**
 * UserRepository es una interfaz que extiende JpaRepository.
 * Proporciona métodos CRUD (Crear, Leer, Actualizar, Eliminar) para la entidad User.
 * La implementación de esta interfaz es proporcionada automáticamente por Spring Data JPA.
 */
public interface UserRepository extends JpaRepository<User, Long> {

}

