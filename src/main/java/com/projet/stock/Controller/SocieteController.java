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
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.projet.stock.exception.ResourceNotFoundException;
import com.projet.stock.model.Societe;
import com.projet.stock.repository.SocieteRepository;

public class SocieteController {
	@Autowired
	SocieteRepository repository;
	
	 @GetMapping("/Societes")
	  public List<Societe> getAllSocietes() {
	    System.out.println("Get all Societes...");
	 
	    List<Societe> Societes = new ArrayList<>();
	    repository.findAll().forEach(Societes::add);
	 
	    return Societes;
	  }
	
	@GetMapping("/Societes/{id}")
	public ResponseEntity<Societe> getSocieteById(@PathVariable(value = "id") Long SocieteId)
			throws ResourceNotFoundException {
		Societe Societe = repository.findById(SocieteId)
				.orElseThrow(() -> new ResourceNotFoundException("Societe not found for this id :: " + SocieteId));
		return ResponseEntity.ok().body(Societe);
	}

	@PostMapping("/Societes")
	public Societe createSociete(@Valid @RequestBody Societe Societe) {
		return repository.save(Societe);
	}
	

	@DeleteMapping("/Societes/{id}")
	public Map<String, Boolean> deleteSociete(@PathVariable(value = "id") Long SocieteId)
			throws ResourceNotFoundException {
		Societe Societe = repository.findById(SocieteId)
				.orElseThrow(() -> new ResourceNotFoundException("Societe not found  id :: " + SocieteId));

		repository.delete(Societe);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	  
	 
	  @DeleteMapping("/Societes/delete")
	  public ResponseEntity<String> deleteAllSocietes() {
	    System.out.println("Delete All Societes...");
	 
	    repository.deleteAll();
	 
	    return new ResponseEntity<>("All Societes have been deleted!", HttpStatus.OK);
	  }
	 
	

	  @PutMapping("/Societes/{id}")
	  public ResponseEntity<Societe> updateSociete(@PathVariable("id") long id, @RequestBody Societe Societe) {
	    System.out.println("Update Societe with ID = " + id + "...");
	 
	    Optional<Societe> SocieteInfo = repository.findById(id);
	 
	    if (SocieteInfo.isPresent()) {
	    	Societe societe = SocieteInfo.get();
	          
	           Societe.setLibelle(Societe.getLibelle());
	          
	      return new ResponseEntity<>(repository.save(Societe), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }

}
