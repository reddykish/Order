package com.infosys.infytel.dto;

public class reorderDTO {
	String BuyerId;
	String Address;
	Integer quantity;
	String prodId;
	public String getBuyerId() {
		return BuyerId;
	}
	public void setBuyerId(String buyerId) {
		BuyerId = buyerId;
	}
	public String getAddress() {
		return Address;
	}
	public void setAddress(String address) {
		Address = address;
	}
	public Integer getQuantity() {
		return quantity;
	}
	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	@Override
	public String toString() {
		return "reorderDTO [BuyerId=" + BuyerId + ", Address=" + Address + ", quantity=" + quantity + ", prodId="
				+ prodId + "]";
	}
	
	

}
