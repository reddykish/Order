package com.infosys.infytel.dto;

import javax.persistence.EnumType;
import javax.persistence.Enumerated;

public class OrderStatusDTO {
	
	@Enumerated(EnumType.STRING)
	private orderstatus status;

	public orderstatus getStatus() {
		return status;
	}

	public void setStatus(orderstatus status) {
		this.status = status;
	}

	@Override
	public String toString() {
		return "OrderStatusDTO [status=" + status + "]";
	}

	
	

}
