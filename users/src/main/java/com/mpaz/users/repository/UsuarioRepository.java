package com.mpaz.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mpaz.users.model.Usuario;

public interface UsuarioRepository extends JpaRepository<Usuario, Integer> {

}
