package com.projet.stock.Controller;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.projet.stock.exception.ResourceNotFoundException;
import com.projet.stock.model.LcommService;
import com.projet.stock.repository.LcommServiceRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class LcommServiceController {
	@Autowired
	LcommServiceRepository repository;
	 @GetMapping("/LLcommServices")
	  public List<LcommService> getAllLcommServices() {
	    System.out.println("Get all LcommServices...");
	 
	    List<LcommService> LcommServices = new ArrayList<>();
	    repository.findAll().forEach(LcommServices::add);
	 
	    return LcommServices;
	  }
	
	@GetMapping("/LcommServices/{id}")
	public ResponseEntity<LcommService> getLcommServiceById(@PathVariable(value = "id") Long LcommServiceId)
			throws ResourceNotFoundException {
		LcommService LcommService = repository.findById(LcommServiceId)
				.orElseThrow(() -> new ResourceNotFoundException("LcommService not found for this id :: " + LcommServiceId));
		return ResponseEntity.ok().body(LcommService);
	}

	@PostMapping("/LcommServices")
	public @Valid LcommService createLcommService(@Valid @RequestBody LcommService LcommService) {
		
		return repository.save(LcommService);
		
		 
	}
	

	@DeleteMapping("/LcommServices/{id}")
	public Map<String, Boolean> deleteLcommService(@PathVariable(value = "id") Long LcommServiceId)
			throws ResourceNotFoundException {
		LcommService LcommService = repository.findById(LcommServiceId)
				.orElseThrow(() -> new ResourceNotFoundException("LcommService not found  id :: " + LcommServiceId));

		repository.delete(LcommService);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	  
	 
	  @DeleteMapping("/LcommServices/delete")
	  public ResponseEntity<String> deleteAllLcommServices() {
	    System.out.println("Delete All LcommServices...");
	    repository.deleteAll();
	    return new ResponseEntity<>("All LcommServices have been deleted!", HttpStatus.OK);
	  }
	 
	

	 

}
