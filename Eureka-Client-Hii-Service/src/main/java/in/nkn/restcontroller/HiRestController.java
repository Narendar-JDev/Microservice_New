package in.nkn.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import in.nkn.client.HelloClient;

@RestController
public class HiRestController {
	
	@Autowired
	private HelloClient client;
	
	@GetMapping("/hi/{name}")
	public String syaHiee(@PathVariable("name") String name) {
		System.out.println("Implemention classname is :: "+client.getClass().getName());
		
		String hieeMsg = "Hi ";
		
		String helloMsg = client.invokeHelloService(name);
		
		return hieeMsg + "------" + helloMsg +"------" +name+ " how r u ?";
	}

} 
