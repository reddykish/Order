package com.infosys.infytel.entity;

import java.io.Serializable;

import javax.persistence.Id;

public class prodkeys implements Serializable{
	
	private String buyerId;
	
	private String prodId;

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getProdId() {
		return prodId;
	}

	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	
}
