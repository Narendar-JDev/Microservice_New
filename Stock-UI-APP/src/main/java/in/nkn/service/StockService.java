package in.nkn.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;



@Service
public class StockService {

    public String getTotalStockPrice(String companyName, Integer quantity)
    	{
    
    	
    	String REST_END_POINT = "http://localhost:1111/calc/calculate/{companyName}/{quantity}";
    	String response = null;
    	
    	WebClient webclient = WebClient.create();
    	
    	try {
    		response=webclient.
					get().
					uri(REST_END_POINT, companyName,quantity).
					retrieve().
					bodyToMono(String.class).
					block();
    		
		} catch (Exception e) {
			response="Company not found";
		}
    	
    	return response;
    }
	
}
