package com.rribeiro.api.resource;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.rribeiro.api.model.Categoria;
import com.rribeiro.api.repository.CategoriaRepository;

//Informa que vai ser um recurso REST.
@RestController
//O nome que vai ficar na url.
@RequestMapping("/categorias")
public class CategoriaResource {
	
	@Autowired
	private CategoriaRepository categoriaRepository;
	
	//Infoma que o método abaixo vai ser chamado via get para o recurso categorias.
	@GetMapping
	public List<Categoria> listar(){
		return categoriaRepository.findAll();
	}
	
}
