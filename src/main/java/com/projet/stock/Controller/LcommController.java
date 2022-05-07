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
import com.projet.stock.model.Lcomm;

import com.projet.stock.repository.LcommRepository;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class LcommController {
	@Autowired
	LcommRepository repository;
	 @GetMapping("/lcomms")
	  public List<Lcomm> getAllLcomms() {
	    System.out.println("Get all Lcomms...");
	 
	    List<Lcomm> Lcomms = new ArrayList<>();
	    repository.findAll().forEach(Lcomms::add);
	 
	    return Lcomms;
	  }
	 @GetMapping("/lcomms/{id}")
	  public List<Lcomm> getAllByNumero(@PathVariable(value = "id") int numero) {
	    System.out.println("Get all Lcomms...");
	 
	    List<Lcomm> Lcomms = new ArrayList<>();
	    repository.findAllByNumero(numero).forEach(Lcomms::add);
	 
	    return Lcomms;
	  }
	
	@GetMapping("/lcommss/{id}")
	public ResponseEntity<Lcomm> getLcommById(@PathVariable(value = "id") Long LcommId)
			throws ResourceNotFoundException {
		Lcomm Lcomm = repository.findById(LcommId)
				.orElseThrow(() -> new ResourceNotFoundException("Lcomm not found for this id :: " + LcommId));
		return ResponseEntity.ok().body(Lcomm);
	}

	@PostMapping("/lcomms")
	public @Valid Lcomm createLcomm(@Valid @RequestBody Lcomm Lcomm) {
		
		return repository.save(Lcomm);
		
		 
	}
	

	@DeleteMapping("/lcomms/{id}")
	public Map<String, Boolean> deleteLcomm(@PathVariable(value = "id") Long LcommId)
			throws ResourceNotFoundException {
		Lcomm Lcomm = repository.findById(LcommId)
				.orElseThrow(() -> new ResourceNotFoundException("Lcomm not found  id :: " + LcommId));

		repository.delete(Lcomm);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	  
	 
	 
	 
	

	  @PutMapping("/lcomms/{id}")
	  public ResponseEntity<Lcomm> updateLcomm(@PathVariable("id") long id, @RequestBody Lcomm Lcomm) {
	    System.out.println("Update Lcomm with ID = " + id + "...");
	 
	    Optional<Lcomm> LcommInfo = repository.findById(id);
	 
	    if (LcommInfo.isPresent()) {
	    	Lcomm lcomm = LcommInfo.get();
	    	lcomm.setLibart(Lcomm.getLibart());
	          
	         
	          
	      return new ResponseEntity<>(repository.save(Lcomm), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }

	 
	  

}
