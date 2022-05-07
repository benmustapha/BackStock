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
import com.projet.stock.model.Compte;
import com.projet.stock.repository.CompteRepository;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class CompteController {
	@Autowired
	CompteRepository repository;
	
	 @GetMapping("/comptes")
	  public List<Compte> getAllComptes() {
	    System.out.println("Get all Comptes...");
	    List<Compte> Comptes = new ArrayList<>();
	    repository.findAll().forEach(Comptes::add);
	    return Comptes;
	  }
	
	@GetMapping("/comptes/{id}")
	public ResponseEntity<Compte> getCompteById(@PathVariable(value = "id") Long CompteId)
			throws ResourceNotFoundException {
		Compte Compte = repository.findById(CompteId)
				.orElseThrow(() -> new ResourceNotFoundException("Compte not found for this id :: " + CompteId));
		return ResponseEntity.ok().body(Compte);
	}

	@PostMapping("/comptes")
	public @Valid Compte createCompte(@Valid @RequestBody Compte Compte) {
	
		return repository.save(Compte);
		 
	}

	@DeleteMapping("/comptes/{id}")
	public Map<String, Boolean> deleteCompte(@PathVariable(value = "id") Long CompteId)
			throws ResourceNotFoundException {
		Compte Compte = repository.findById(CompteId)
				.orElseThrow(() -> new ResourceNotFoundException("Compte not found  id :: " + CompteId));
		repository.delete(Compte);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	 
	  @DeleteMapping("/comptes/delete")
	  public ResponseEntity<String> deleteAllComptes() {
	    System.out.println("Delete All Comptes...");
	    repository.deleteAll();
	    return new ResponseEntity<>("All Comptes have been deleted!", HttpStatus.OK);
	  }
	 
	  @PutMapping("/comptes/{id}")
	  public ResponseEntity<Compte> updateCompte(@PathVariable("id") long id, @RequestBody Compte Compte) {
	    System.out.println("Update Compte with ID = " + id + "...");
	    Optional<Compte> CompteInfo = repository.findById(id);
	    if (CompteInfo.isPresent()) {
	    	Compte compte = CompteInfo.get();
	    	compte.setLibelle(Compte.getLibelle());
	      return new ResponseEntity<>(repository.save(Compte), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }
}
