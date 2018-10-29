package com.example.webapp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webapp.entity.UsuarioEntity;

public interface UsuarioRepository extends JpaRepository<UsuarioEntity, Long> {

	UsuarioEntity findByLogin(String login);

}
