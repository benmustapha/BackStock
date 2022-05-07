package com.projet.stock.Controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class helloController {
	@RequestMapping("/hello")
	  public String index() {
	    return "Hello SpringBoot ";
	  }
}
