package in.nkn.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="Eureka-Client-Hello")
public interface HelloClient {

	@GetMapping("/hello/{name}")
	
	public String invokeHelloService(@PathVariable String name);
		
	
}
