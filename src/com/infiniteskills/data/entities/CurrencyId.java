package com.infiniteskills.data.entities;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Id;

@SuppressWarnings("serial")
public class CurrencyId implements Serializable {
	private String name;

	private String countryName;

	public String getName() {
		return name;
	}

	public String getCountryName() {
		return countryName;
	}

	public void setCountryName(String countryName) {
		this.countryName = countryName;
	}

	public void setName(String name) {
		this.name = name;
	}

	CurrencyId() {

	}

	public CurrencyId(String name, String countryName) {
		super();
		this.name = name;
		this.countryName = countryName;
	}
}
