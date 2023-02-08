/**
 * @author jacoby - jking11@dmacc.edu
 * CIS175 - Spring 2023
 * Feb 7, 2023
 */
package model;

import java.text.DecimalFormat;
import java.text.NumberFormat;

public class USDConverter {
	NumberFormat formatter = new DecimalFormat("#0.00");
	private double amountUSD;
	
	public USDConverter() {
		super();
	}

	public USDConverter(double amountUSD) {
		super();
		this.amountUSD = amountUSD;
		setAmountUSD(amountUSD);
	}

	public String getAmountUSD() {
		return formatter.format(amountUSD);
	}

	public void setAmountUSD(double amountUSD) {
		this.amountUSD = amountUSD;
	}
	
	public String getPesoConversion() {
		final double PESOS = 18.870244;
		return String.valueOf(formatter.format(amountUSD * PESOS));
	}
	
	public String getEuroConversion() {
		final double EUROS = 0.93155001;
		return String.valueOf(formatter.format(amountUSD * EUROS));
	}
}
