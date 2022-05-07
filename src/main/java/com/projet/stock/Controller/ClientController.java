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
import com.projet.stock.model.Client;
import com.projet.stock.repository.ClientRepository;
@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/api")
public class ClientController {
	@Autowired
	ClientRepository repository;
	
	 @GetMapping("/clients")
	  public List<Client> getAllClients() {
	    System.out.println("Get all Clients...");
	 
	    List<Client> Clients = new ArrayList<>();
	    repository.findAll().forEach(Clients::add);
	 
	    return Clients;
	  }
	
	@GetMapping("/clients/{id}")
	public ResponseEntity<Client> getClientById(@PathVariable(value = "id") Long ClientId)
			throws ResourceNotFoundException {
		Client Client = repository.findById(ClientId)
				.orElseThrow(() -> new ResourceNotFoundException("Client not found for this id :: " + ClientId));
		return ResponseEntity.ok().body(Client);
	}

	@PostMapping("/clients")
	public Client createClient(@Valid @RequestBody Client Client) {
		return repository.save(Client);
	}
	

	@DeleteMapping("/clients/{id}")
	public Map<String, Boolean> deleteClient(@PathVariable(value = "id") Long ClientId)
			throws ResourceNotFoundException {
		Client Client = repository.findById(ClientId)
				.orElseThrow(() -> new ResourceNotFoundException("Client not found  id :: " + ClientId));

		repository.delete(Client);
		Map<String, Boolean> response = new HashMap<>();
		response.put("deleted", Boolean.TRUE);
		return response;
	}
	  
	 
	  @DeleteMapping("/clients/delete")
	  public ResponseEntity<String> deleteAllClients() {
	    System.out.println("Delete All Clients...");
	 
	    repository.deleteAll();
	 
	    return new ResponseEntity<>("All Clients have been deleted!", HttpStatus.OK);
	  }
	 
	

	  @PutMapping("/clients/{id}")
	  public ResponseEntity<Client> updateClient(@PathVariable("id") long id, @RequestBody Client Client) {
	    System.out.println("Update Client with ID = " + id + "...");
	 
	    Optional<Client> ClientInfo = repository.findById(id);
	 
	    if (ClientInfo.isPresent()) {
	    	Client client = ClientInfo.get();
	          
	           client.setLibelle(Client.getLibelle());
	           client.setAdresse(Client.getAdresse());
	         
	           client.setEmail(Client.getEmail());
	           client.setLogin(Client.getLogin());
	          
	           client.setPwd(Client.getPwd());
	           
	           client.setTel(Client.getTel());
	          
	          
	      return new ResponseEntity<>(repository.save(Client), HttpStatus.OK);
	    } else {
	      return new ResponseEntity<>(HttpStatus.NOT_FOUND);
	    }
	  }

}
