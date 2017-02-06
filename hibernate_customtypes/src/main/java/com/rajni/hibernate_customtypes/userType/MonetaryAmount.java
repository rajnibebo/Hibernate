/**
 * 
 */
package com.rajni.hibernate_customtypes.userType;

import java.io.Serializable;
import java.math.BigDecimal;
import java.util.Currency;

/**
 * @author rajni.ubhi
 *
 */
public class MonetaryAmount implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private final BigDecimal amount;
	private final Currency currency;
	
	public MonetaryAmount(BigDecimal amount , Currency currency) {
		// TODO Auto-generated constructor stub
		this.amount = amount;
		this.currency = currency;
	}
	public BigDecimal getAmount() {
		return amount;
	}
	public Currency getCurrency() {
		return currency;
	}
	public MonetaryAmount converTo(Currency currency) {
		BigDecimal amount = new BigDecimal(this.amount.doubleValue());
		switch (currency.getCurrencyCode()) {
			case "INR":
				amount = amount.add(new BigDecimal(60));
				break;
	
			default:
				amount = amount.add(new BigDecimal(50));
				break;
		}
		return new MonetaryAmount(amount, currency);
	}
	public boolean equals(Object obj) {
		if (obj instanceof MonetaryAmount) {
			MonetaryAmount monAmount = (MonetaryAmount) obj;
			return monAmount.currency.equals(currency)
					&& monAmount.amount.equals(amount);
		}
		return false;
	}

	public int hashCode() {
		return 31 * (currency.hashCode() + amount.intValue());
	}
}
