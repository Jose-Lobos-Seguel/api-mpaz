package com.mpaz.users.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.mpaz.users.model.Rol;

public interface RolRepository extends JpaRepository<Rol, Integer> {

}
