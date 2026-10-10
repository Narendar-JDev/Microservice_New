package in.ineuron.beans;

import lombok.Data;

@Data
public class CurrencyCostBean {

	private String currencyFrom;
	private String currencyTo;
	private Double totalCurrencyAmt;
	private Integer port;
	
	public CurrencyCostBean() {
		
	}
	
	public CurrencyCostBean(String currencyFrom, String currencyTo, Double totalCurrencyAmt, Integer port) {
		super();
		this.currencyFrom = currencyFrom;
		this.currencyTo = currencyTo;
		this.totalCurrencyAmt = totalCurrencyAmt;
		this.port = port;
	}


	public String getCurrencyFrom() {
		return currencyFrom;
	}


	public void setCurrencyFrom(String currencyFrom) {
		this.currencyFrom = currencyFrom;
	}


	public String getCurrencyTo() {
		return currencyTo;
	}


	public void setCurrencyTo(String currencyTo) {
		this.currencyTo = currencyTo;
	}


	public Double getTotalCurrencyAmt() {
		return totalCurrencyAmt;
	}


	public void setTotalCurrencyAmt(Double totalCurrencyAmt) {
		this.totalCurrencyAmt = totalCurrencyAmt;
	}


	public Integer getPort() {
		return port;
	}


	public void setPort(Integer port) {
		this.port = port;
	}


	@Override
	public String toString() {
		return "CurrencyCostBean [currencyFrom=" + currencyFrom + ", currencyTo=" + currencyTo + ", totalCurrencyAmt="
				+ totalCurrencyAmt + ", port=" + port + "]";
	}
	
	
	

}
