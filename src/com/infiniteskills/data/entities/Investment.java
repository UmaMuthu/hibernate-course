package com.infiniteskills.data.entities;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.DiscriminatorColumn;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.TableGenerator;

@Entity
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
@Table(name = "investment")
@DiscriminatorColumn(name = "INVESTMENT_TYPE")
public abstract class Investment {
	@Id
	@GeneratedValue(strategy = GenerationType.TABLE, generator = "key_generator")
	@TableGenerator(table = "ifinances_keys", pkColumnName = "pk_name", valueColumnName = "pk_value", name = "key_generator")
	@Column(name = "INVESTMENT_ID")
	private long investmentId;
	@Column(name = "NAME")
	private String name;

	public long getInvestmentId() {
		return investmentId;
	}

	public void setInvestmentId(long investmentId) {
		this.investmentId = investmentId;
	}

	@Column(name = "ISSUER")
	private String issuer;
	@Column(name = "PURCHASE_DATE")
	private Date purchaseDate;
	@JoinColumn(name = "PORTFOLIO_ID")
	@ManyToOne(cascade = CascadeType.ALL)
	private Portfolio portfolio;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getIssuer() {
		return issuer;
	}

	public void setIssuer(String issuer) {
		this.issuer = issuer;
	}

	public Date getPurchaseDate() {
		return purchaseDate;
	}

	public void setPurchaseDate(Date purchaseDate) {
		this.purchaseDate = purchaseDate;
	}

	public Portfolio getPortfolio() {
		return portfolio;
	}

	public void setPortfolio(Portfolio portfolio) {
		this.portfolio = portfolio;
	}

}
