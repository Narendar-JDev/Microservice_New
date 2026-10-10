 package in.nkn.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import in.nkn.entity.StockPrice;

public interface StockRepository extends JpaRepository<StockPrice, Integer> {

	public StockPrice findByCompanyName(String companyName);
}
