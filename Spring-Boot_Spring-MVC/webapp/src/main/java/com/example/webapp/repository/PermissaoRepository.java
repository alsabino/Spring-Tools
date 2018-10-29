package com.example.webapp.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.webapp.entity.GrupoEntity;
import com.example.webapp.entity.PermissaoEntity;

public interface PermissaoRepository extends JpaRepository<PermissaoEntity, Long> {
	
	List<PermissaoEntity> findByGruposIn(GrupoEntity grupoEntity);

}
