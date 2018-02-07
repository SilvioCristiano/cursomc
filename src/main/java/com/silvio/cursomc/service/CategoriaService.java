package com.silvio.cursomc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.silvio.cursomc.domain.Categoria;
import com.silvio.cursomc.repositories.CategoriaRepository;

@Service
public class CategoriaService {
	@Autowired
	private CategoriaRepository repo;
	
	public Categoria buscar(Integer id) {

		Categoria obj = repo.findOne(id);
		return obj;
	}

}
