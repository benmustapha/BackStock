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
import com.projet.stock.model.Lfcomm;

import com.projet.stock.repository.LfcommRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class LfcommController {
	@Autowired
	LfcommRepository repository;
	 @GetMapping("/LLfcomms")
	  public List<Lfcomm> getAllLfcomms() {
	    System.out.println("Get all Lfcomms...");
	 
	    List<Lfcomm> Lfcomms = new ArrayList<>();
	    repository.findAll().forEach(Lfcomms::add);
	 
	    return Lfcomms;
	  }
	
	@GetMapping("/Lfcomms/{id}")
	public ResponseEntity<Lfcomm> getLfcommById(@PathVariable(value = "id") Long LfcommId)
			throws ResourceNotFoundException {
		Lfcomm Lfcomm = repository.findById(LfcommId)
				.orElseThrow(() -> new ResourceNotFoundException("Lfcomm not found for this id :: " + LfcommId));
		return ResponseEntity.ok().body(Lfcomm);
	}

	@PostMapping("/Lfcomms")
	public @Valid Lfcomm createLfcomm(@Valid @RequestBody Lfcomm Lfcomm) {
		
		return repository.save(Lfcomm);
		
		 
	}
	

	@DeleteMapping("/Lfcomms/{id}")
	public Map<String, Boolean> deleteLfcomm(@PathVariable(value = "id") Long LfcommId)
			throws ResourceNotFoundException {
		Lfcomm Lfcomm = repository.findById(LfcommId)
				.orElseThrow(() -> new ResourceNotFoundException("Lfcomm not found  id :: " + LfcommId));

		repository.delete(Lfcomm);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	  
	 
	  @DeleteMapping("/Lfcomms/delete")
	  public ResponseEntity<String> deleteAllLfcomms() {
	    System.out.println("Delete All Lfcomms...");
	    repository.deleteAll();
	    return new ResponseEntity<>("All Lfcomms have been deleted!", HttpStatus.OK);
	  }
	 
	

	

}
