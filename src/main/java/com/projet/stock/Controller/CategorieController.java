package com.projet.stock.Controller;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import javax.validation.Valid;

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

import com.projet.stock.exception.ResourceNotFoundException;
import com.projet.stock.model.Categorie;
import com.projet.stock.repository.CategorieRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CategorieController {
	@Autowired
	CategorieRepository repository;
	
	 @GetMapping("/categories")
	  public List<Categorie> getAllCategories() {
	    System.out.println("Get all Categories...");
	 
	    List<Categorie> Categories = new ArrayList<>();
	    repository.findAll().forEach(Categories::add);
	 
	    return Categories;
	  }
	
	@GetMapping("/categories/{id}")
	public ResponseEntity<Categorie> getCategorieById(@PathVariable(value = "id") Long CategorieId)
			throws ResourceNotFoundException {
		Categorie Categorie = repository.findById(CategorieId)
				.orElseThrow(() -> new ResourceNotFoundException("Categorie not found for this id :: " + CategorieId));
		return ResponseEntity.ok().body(Categorie);
	}

	@PostMapping("/categories")
	public Categorie createCategorie(@Valid @RequestBody Categorie Categorie) {
		return repository.save(Categorie);
	}
	

	@DeleteMapping("/categories/{id}")
	public Map<String, Boolean> deleteCategorie(@PathVariable(value = "id") Long CategorieId)
			throws ResourceNotFoundException {
		Categorie Categorie = repository.findById(CategorieId)
				.orElseThrow(() -> new ResourceNotFoundException("Categorie not found  id :: " + CategorieId));

		repository.delete(Categorie);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	  
	 
	  @DeleteMapping("/categories/delete")
	  public ResponseEntity<String> deleteAllCategories() {
	    System.out.println("Delete All Categories...");
	 
	    repository.deleteAll();
	 
	    return new ResponseEntity<>("All Categories have been deleted!", HttpStatus.OK);
	  }
	 
	

	  @PutMapping("/categories/{id}")
	  public ResponseEntity<Categorie> updateCategorie(@PathVariable("id") long id, @RequestBody Categorie Categorie) {
	    System.out.println("Update Categorie with ID = " + id + "...");
	 
	    Optional<Categorie> CategorieInfo = repository.findById(id);
	 
	    if (CategorieInfo.isPresent()) {
	    	Categorie categorie = CategorieInfo.get();
	          categorie.setLibelle(Categorie.getLibelle());
	           
	      return new ResponseEntity<>(repository.save(Categorie), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
}
