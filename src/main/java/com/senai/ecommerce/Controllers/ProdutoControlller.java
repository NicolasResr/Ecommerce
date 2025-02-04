package com.senai.ecommerce.Controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.senai.ecommerce.services.ProdutoService;

@RequestMapping(value = "/produto")
@RestController
public class ProdutoControlller {
	
	@Autowired
	ProdutoService service;
	
	@GetMapping
	public ResponseEntity<?> buscar(){
		return ResponseEntity.ok(service.buscarTodos());
	}
}
