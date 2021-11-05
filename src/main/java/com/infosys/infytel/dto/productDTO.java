package com.infosys.infytel.dto;


import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;



public class productDTO {
	

	private String prodId;
	@NotNull(message = "{product.name.absent}")
	@Pattern(regexp = "[A-Za-z]+( [A-Za-z]+)*", message = "{product.name.invalid}")
	@Size(max=100)
	private String prodName;
	@Min(value=200,message="price should be greater than 200")
	private Integer price;
	@Min(value=1,message="price should be greater than 10")
	private Integer stock;
	@Size(max=500)
	private String description;
	private String sellerId;
	private String category;
	private String subCateg;
	@Min(value=1)
	@Max(value=5)
	private Float prodRating;
	@Pattern(regexp = "([A-Za-z0-9]+)*+([.jpg.png])", message = "{image.name.invalid}")
	private String image;
	public String getProdId() {
		return prodId;
	}
	public void setProdId(String prodId) {
		this.prodId = prodId;
	}
	public String getProdName() {
		return prodName;
	}
	public void setProdName(String prodName) {
		this.prodName = prodName;
	}
	public Integer getPrice() {
		return price;
	}
	public void setPrice(Integer price) {
		this.price = price;
	}
	public Integer getStock() {
		return stock;
	}
	public void setStock(Integer stock) {
		this.stock = stock;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getSellerId() {
		return sellerId;
	}
	public void setSellerId(String sellerId) {
		this.sellerId = sellerId;
	}
	public String getCategory() {
		return category;
	}
	public void setCategory(String category) {
		this.category = category;
	}
	public String getSubCateg() {
		return subCateg;
	}
	public void setSubCateg(String subCateg) {
		this.subCateg = subCateg;
	}
	public Float getProdRating() {
		return prodRating;
	}
	public void setProdRating(Float prodRating) {
		this.prodRating = prodRating;
	}
	public String getImage() {
		return image;
	}
	public void setImage(String image) {
		this.image = image;
	}
	@Override
	public String toString() {
		return "productDTO [prodId=" + prodId + ", prodName=" + prodName + ", price=" + price + ", stock=" + stock
				+ ", description=" + description + ", sellerId=" + sellerId + ", category=" + category + ", subCateg="
				+ subCateg + ", prodRating=" + prodRating + ", image=" + image + "]";
	}
	
}
