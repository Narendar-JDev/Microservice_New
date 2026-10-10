package in.nkn.restcontroller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloRestController {
	
	@GetMapping("/hello/{name}")
	public String syaHello(@PathVariable("name") String name) {
		
		String helloMsg = "Hello ";
		return helloMsg +" how r u ?";
	}

} 
