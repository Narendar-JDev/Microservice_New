package in.ineuron.beans;

import lombok.Data;

@Data
public class CurrencyExchangeBean {
	private Integer currencyId;
	private String currencyFrom;
	private String currencyTo;
	private Double currencyValue;
	private Integer port;
	
	public CurrencyExchangeBean() {
		
	}
	
	public CurrencyExchangeBean(Integer currencyId, String currencyFrom, String currencyTo, Double currencyValue,
			Integer port) {
		super();
		this.currencyId = currencyId;
		this.currencyFrom = currencyFrom;
		this.currencyTo = currencyTo;
		this.currencyValue = currencyValue;
		this.port = port;
	}


	public Integer getCurrencyId() {
		return currencyId;
	}


	public void setCurrencyId(Integer currencyId) {
		this.currencyId = currencyId;
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


	public Double getCurrencyValue() {
		return currencyValue;
	}


	public void setCurrencyValue(Double currencyValue) {
		this.currencyValue = currencyValue;
	}


	public Integer getPort() {
		return port;
	}


	public void setPort(Integer port) {
		this.port = port;
	}


	@Override
	public String toString() {
		return "CurrencyExchangeBean [currencyId=" + currencyId + ", currencyFrom=" + currencyFrom + ", currencyTo="
				+ currencyTo + ", currencyValue=" + currencyValue + ", port=" + port + "]";
	}
	
	
}
