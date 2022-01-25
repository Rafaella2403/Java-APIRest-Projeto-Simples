package com.rribeiro.api.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import com.rribeiro.api.model.Categoria;

public interface CategoriaRepository extends JpaRepository<Categoria, Long> {
	
	
	
}
