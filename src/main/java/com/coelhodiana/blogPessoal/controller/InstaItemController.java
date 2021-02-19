package com.coelhodiana.blogPessoal.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.coelhodiana.blogPessoal.model.InstaItem;
import com.coelhodiana.blogPessoal.repository.InstaItemRepository;

@RestController
@RequestMapping("/instaitems")
@CrossOrigin(origins = "*", allowedHeaders = "*")
public class InstaItemController {
	
	@Autowired
	private InstaItemRepository repository;

	@GetMapping
	public ResponseEntity<List<InstaItem>> GetAll() {
		return ResponseEntity.ok(repository.findAll());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<InstaItem> GetById(@PathVariable long id){
		return repository.findById(id)
				.map(resp -> ResponseEntity.ok(resp))
				.orElse(ResponseEntity.notFound().build());
	}
	
	@PostMapping
	public ResponseEntity<InstaItem> post (@RequestBody InstaItem instaItem) {
		return ResponseEntity.status(HttpStatus.CREATED).body(repository.save(instaItem));
	}
	
	@PutMapping
	public ResponseEntity<InstaItem> put (@RequestBody InstaItem instaItem) {
		return ResponseEntity.status(HttpStatus.OK).body(repository.save(instaItem));
	}
	
	@DeleteMapping("/{id}")
	public void delete(@PathVariable long id) {
		repository.deleteById(id);
	}
	
}
