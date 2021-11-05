package com.infosys.infytel.controller;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;


import com.infosys.infytel.dto.productDTO;
@FeignClient("productms")
@CrossOrigin
public interface ProductFeign {
	
	@GetMapping(value="api/product/{prodId}")
	productDTO getProduct(@PathVariable("prodId") String prodId) throws Exception;
	@PutMapping(value = "api/products/{prodId}",  produces = MediaType.APPLICATION_JSON_VALUE)
	String updatestock(@PathVariable String prodId,@RequestBody Integer quantity ) throws Exception;
}
