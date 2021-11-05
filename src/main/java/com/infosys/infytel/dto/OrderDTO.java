package com.infosys.infytel.dto;

import java.util.Date; 

import javax.persistence.EnumType;
import javax.persistence.Enumerated;
public class OrderDTO {
	private String orderId;
	private String buyerId;
	private Integer amount;
	private Date date;
	private String address;
	@Enumerated(EnumType.STRING)
	private orderstatus status;
		
	public String getOrderId() {
		return orderId;
	}

	public void setOrderId(String orderId) {
		this.orderId = orderId;
	}

	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public Date getDate() {
		return date;
	}

	public void setDate(Date date) {
		this.date = date;
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public orderstatus getStatus() {
		return status;
	}

	public void setStatus(orderstatus status) {
		this.status = status;
	}

	public OrderDTO() {
		super();
	}

	@Override
	public String toString() {
		return "OrderDTO [orderId=" + orderId + ", buyerId=" + buyerId + ", amount=" + amount + ", date=" + date
				+ ", address=" + address + ", status=" + status + "]";
	}
		
		
	}

