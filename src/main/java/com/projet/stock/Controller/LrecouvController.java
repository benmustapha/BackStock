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
import com.projet.stock.model.Lrecouv;

import com.projet.stock.repository.LrecouvRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class LrecouvController {
	@Autowired
	LrecouvRepository repository;
	 @GetMapping("/LLrecouvs")
	  public List<Lrecouv> getAllLrecouvs() {
	    System.out.println("Get all Lrecouvs...");
	 
	    List<Lrecouv> Lrecouvs = new ArrayList<>();
	    repository.findAll().forEach(Lrecouvs::add);
	 
	    return Lrecouvs;
	  }
	
	@GetMapping("/Lrecouvs/{id}")
	public ResponseEntity<Lrecouv> getLrecouvById(@PathVariable(value = "id") Long LrecouvId)
			throws ResourceNotFoundException {
		Lrecouv Lrecouv = repository.findById(LrecouvId)
				.orElseThrow(() -> new ResourceNotFoundException("Lrecouv not found for this id :: " + LrecouvId));
		return ResponseEntity.ok().body(Lrecouv);
	}

	@PostMapping("/Lrecouvs")
	public @Valid Lrecouv createLrecouv(@Valid @RequestBody Lrecouv Lrecouv) {
		
		return repository.save(Lrecouv);
		
		 
	}
	

	@DeleteMapping("/Lrecouvs/{id}")
	public Map<String, Boolean> deleteLrecouv(@PathVariable(value = "id") Long LrecouvId)
			throws ResourceNotFoundException {
		Lrecouv Lrecouv = repository.findById(LrecouvId)
				.orElseThrow(() -> new ResourceNotFoundException("Lrecouv not found  id :: " + LrecouvId));

		repository.delete(Lrecouv);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	  
	 
	  @DeleteMapping("/Lrecouvs/delete")
	  public ResponseEntity<String> deleteAllLrecouvs() {
	    System.out.println("Delete All Lrecouvs...");
	    repository.deleteAll();
	    return new ResponseEntity<>("All Lrecouvs have been deleted!", HttpStatus.OK);
	  }
	 
	

	 

}
