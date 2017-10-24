package com.infiniteskills.data.entities;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.DiscriminatorValue;
import javax.persistence.Entity;

@Entity
@DiscriminatorValue("ST")
//@Table(name = "stock1")
public class Stock extends Investment{
	
	@Column(name="SHARE_PRICE")
	private BigDecimal sharePrice;
	@Column(name="QUANTITY")
	private int quantity;
	
	
	public BigDecimal getSharePrice() {
		return sharePrice;
	}
	public void setSharePrice(BigDecimal sharePrice) {
		this.sharePrice = sharePrice;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	
	
	
	

}
