package com.infosys.infytel.repository;



import org.springframework.data.jpa.repository.JpaRepository; 


import com.infosys.infytel.entity.productordered;

public interface ProductsOrderedRepository extends JpaRepository<productordered, String> {
	
	productordered findByBuyerIdAndProdId(String BuyerId,String prodId);

}
