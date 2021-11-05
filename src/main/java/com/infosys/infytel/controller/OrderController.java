package com.infosys.infytel.controller;


import java.util.List; 

import org.slf4j.Logger; 
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import com.infosys.infytel.dto.OrderDTO;
import com.infosys.infytel.dto.OrderStatusDTO;
import com.infosys.infytel.dto.orderstatus;
import com.infosys.infytel.dto.reorderDTO;
import com.infosys.infytel.service.OrderService;


@RestController
@CrossOrigin
@RequestMapping(value="/Orders")
public class OrderController {

	Logger logger = LoggerFactory.getLogger(this.getClass());

	@Autowired
	OrderService oService;

	@Autowired
	private Environment environment;
	@PostMapping(value = "/reorder",  consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> ReOrder(@RequestBody reorderDTO Reorder) throws Exception{
		try {
			System.out.println(Reorder);
			oService.reorder(Reorder);
			String successMessage ="reOrders Placed successfully" ;
			return new ResponseEntity<>(successMessage, HttpStatus.CREATED);
		}catch(Exception exception) {
		
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, exception.getMessage(), exception);
		}	
	}
	@PostMapping(value = "/{buyerId}/placeOrder",  consumes = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> placeOrder(@PathVariable String buyerId,@RequestBody String Address) throws Exception{
		try {
			
			oService.placeOrder(buyerId,Address);
			String successMessage ="Orders Placed successfully" ;
			return new ResponseEntity<>(successMessage, HttpStatus.CREATED);
		}catch(Exception exception) {
		
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, exception.getMessage(), exception);
		}	
	}
	
	@GetMapping(value = "/{orderId}",  produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<OrderDTO> findAllOrdersByOrderId(@PathVariable String orderId) throws Exception{
		try {
			OrderDTO cust= oService.viewOrder(orderId);
			return new ResponseEntity<>(cust,HttpStatus.OK);
		} catch (Exception exception) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, exception.getMessage(), exception);
		}
	}
	@GetMapping(value = "/Buyer/{BuyerId}" ,produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<OrderDTO>> findproductbyBuyerId(@PathVariable String BuyerId) throws Exception{
		try {
			List<OrderDTO> cust= oService.viewOrdersByBuyer(BuyerId);
			return new ResponseEntity<>(cust,HttpStatus.OK);
		} catch (Exception exception) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, exception.getMessage(), exception);
		}
	}
	@PutMapping(value = "/update/{orderId}",  produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<String> updatestatus(@RequestBody OrderStatusDTO status,@PathVariable String orderId ) throws Exception{
		try {
			
			
		    oService.updateStatus(status.getStatus(),orderId);
			String successMessage = "API.UPDATE_SUCCESS" ;
			return new ResponseEntity<>(successMessage, HttpStatus.OK);
		} catch (Exception exception) {
			throw new ResponseStatusException(HttpStatus.NOT_FOUND, environment.getProperty(exception.getMessage()), exception);
	
		}
	}
	
	
}
	

