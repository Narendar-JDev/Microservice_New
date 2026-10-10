package in.ineuron.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import lombok.Data;

/*
 *  Note: Configure the H2 database correctly as in application.properties file to keep mode as "update"
 * ------
 */
@Entity
@Table(name = "CURRENCY_EXCHANGE")
@Data
public class CurrencyExchangeEntity {

	@Id
	@Column(name = "CURRENCY_ID")
	private Integer currencyId;

	@Column(name = "CURRENCY_FROM")
	private String currencyFrom;

	@Column(name = "CURRENCY_TO")
	private String currencyTo;

	@Column(name = "CURRENCY_VALUE")
	private Double currencyValue;
	
	public CurrencyExchangeEntity() {
		
	}
	

	public CurrencyExchangeEntity(Integer currencyId, String currencyFrom, String currencyTo, Double currencyValue) {
		super();
		this.currencyId = currencyId;
		this.currencyFrom = currencyFrom;
		this.currencyTo = currencyTo;
		this.currencyValue = currencyValue;
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




	@Override
	public String toString() {
		return "CurrencyExchangeEntity [currencyId=" + currencyId + ", currencyFrom=" + currencyFrom + ", currencyTo="
				+ currencyTo + ", currencyValue=" + currencyValue + "]";
	}
	
	
	

}
