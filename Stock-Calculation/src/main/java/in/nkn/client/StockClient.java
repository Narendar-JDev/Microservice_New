package in.nkn.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(name="Stock-Price-Service")
public interface StockClient {
	
	
    @GetMapping("/price/stockPrice/{companyName}")
	public ResponseEntity<Double> getStockPrice(@PathVariable String companyName);
}
