package in.nkn.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.nkn.entity.StockPrice;
import in.nkn.exception.StockNotFoundException;
import in.nkn.repository.StockRepository;

@Service
public class StockPriceServiceImpl implements IStockPriceService {

	
	@Autowired
	private StockRepository repo;
	
	@Override
	public Double findByCompanyName(String companyName) {
		StockPrice stockPrice = repo.findByCompanyName(companyName);
		
		if (stockPrice == null) {
			throw new StockNotFoundException("Company not available");
		} 
		return stockPrice.getCompanyPrice();
	}

}
