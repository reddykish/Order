package com.infosys.infytel.controller;


import java.util.List; 

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import com.infosys.infytel.dto.CartDTO;
@FeignClient("UserMS")
@CrossOrigin
public interface UserFeign{
	
	@GetMapping(value="{buyerId}/cart")
	List<CartDTO> CartList(@PathVariable String buyerId) throws Exception;
	//@RequestMapping(value="/cart/{buyerId}")
	//void deleteAllCartItem(@PathVariable("buyerId") String buyerId);
	@DeleteMapping(value="{buyerId}/cart/deleteAll")
	String DeleteAll(@PathVariable String buyerId) throws Exception;
	@PostMapping(value = "api/buyers/rewards/{buyerId}",  consumes = MediaType.APPLICATION_JSON_VALUE)
	String addrewards(@RequestBody Integer rewards,@PathVariable String buyerId) throws Exception;
}
