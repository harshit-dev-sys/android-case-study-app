package com.casestudy.android.ui.productList.pojo;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class SlotsItem{

	@SerializedName("new_arrival")
	private String newArrival;

	@SerializedName("product_slug")
	private String productSlug;

	@SerializedName("dy_display_price")
	private String dyDisplayPrice;

	@SerializedName("crossed_price")
	private String crossedPrice;

	@SerializedName("rating")
	private String rating;

	@SerializedName("description")
	private String description;

	@SerializedName("inventory")
	private String inventory;

	@SerializedName("in_stock")
	private String inStock;

	@SerializedName("price")
	private String price;

	@SerializedName("publish_time")
	private String publishTime;

	@SerializedName("product_id")
	private String productId;

	@SerializedName("variant")
	private String variant;

	@SerializedName("currency")
	private String currency;

	@SerializedName("categories")
	private List<String> categories;

	@SerializedName("sku")
	private String sku;

	@SerializedName("brand")
	private String brand;

	@SerializedName("sale_text")
	private String saleText;

	@SerializedName("currency_symbol")
	private String currencySymbol;

	@SerializedName("image_url")
	private String imageUrl;

	@SerializedName("product_heading")
	private String productHeading;

	@SerializedName("url")
	private String url;

	@SerializedName("brand_url")
	private String brandUrl;

	@SerializedName("under_sale")
	private String underSale;

	@SerializedName("app_exclusive")
	private String appExclusive;

	@SerializedName("bestseller")
	private String bestseller;

	@SerializedName("group_id")
	private String groupId;

	@SerializedName("name")
	private String name;

	public void setNewArrival(String newArrival){
		this.newArrival = newArrival;
	}

	public String getNewArrival(){
		return newArrival;
	}

	public void setProductSlug(String productSlug){
		this.productSlug = productSlug;
	}

	public String getProductSlug(){
		return productSlug;
	}

	public void setDyDisplayPrice(String dyDisplayPrice){
		this.dyDisplayPrice = dyDisplayPrice;
	}

	public String getDyDisplayPrice(){
		return dyDisplayPrice;
	}

	public void setCrossedPrice(String crossedPrice){
		this.crossedPrice = crossedPrice;
	}

	public String getCrossedPrice(){
		return crossedPrice;
	}

	public void setRating(String rating){
		this.rating = rating;
	}

	public String getRating(){
		return rating;
	}

	public void setDescription(String description){
		this.description = description;
	}

	public String getDescription(){
		return description;
	}

	public void setInventory(String inventory){
		this.inventory = inventory;
	}

	public String getInventory(){
		return inventory;
	}

	public void setInStock(String inStock){
		this.inStock = inStock;
	}

	public String getInStock(){
		return inStock;
	}

	public void setPrice(String price){
		this.price = price;
	}

	public String getPrice(){
		return price;
	}

	public void setPublishTime(String publishTime){
		this.publishTime = publishTime;
	}

	public String getPublishTime(){
		return publishTime;
	}

	public void setProductId(String productId){
		this.productId = productId;
	}

	public String getProductId(){
		return productId;
	}

	public void setVariant(String variant){
		this.variant = variant;
	}

	public String getVariant(){
		return variant;
	}

	public void setCurrency(String currency){
		this.currency = currency;
	}

	public String getCurrency(){
		return currency;
	}

	public void setCategories(List<String> categories){
		this.categories = categories;
	}

	public List<String> getCategories(){
		return categories;
	}

	public void setSku(String sku){
		this.sku = sku;
	}

	public String getSku(){
		return sku;
	}

	public void setBrand(String brand){
		this.brand = brand;
	}

	public String getBrand(){
		return brand;
	}

	public void setSaleText(String saleText){
		this.saleText = saleText;
	}

	public String getSaleText(){
		return saleText;
	}

	public void setCurrencySymbol(String currencySymbol){
		this.currencySymbol = currencySymbol;
	}

	public String getCurrencySymbol(){
		return currencySymbol;
	}

	public void setImageUrl(String imageUrl){
		this.imageUrl = imageUrl;
	}

	public String getImageUrl(){
		return imageUrl;
	}

	public void setProductHeading(String productHeading){
		this.productHeading = productHeading;
	}

	public String getProductHeading(){
		return productHeading;
	}

	public void setUrl(String url){
		this.url = url;
	}

	public String getUrl(){
		return url;
	}

	public void setBrandUrl(String brandUrl){
		this.brandUrl = brandUrl;
	}

	public String getBrandUrl(){
		return brandUrl;
	}

	public void setUnderSale(String underSale){
		this.underSale = underSale;
	}

	public String getUnderSale(){
		return underSale;
	}

	public void setAppExclusive(String appExclusive){
		this.appExclusive = appExclusive;
	}

	public String getAppExclusive(){
		return appExclusive;
	}

	public void setBestseller(String bestseller){
		this.bestseller = bestseller;
	}

	public String getBestseller(){
		return bestseller;
	}

	public void setGroupId(String groupId){
		this.groupId = groupId;
	}

	public String getGroupId(){
		return groupId;
	}

	public void setName(String name){
		this.name = name;
	}

	public String getName(){
		return name;
	}

	@Override
 	public String toString(){
		return 
			"SlotsItem{" + 
			"new_arrival = '" + newArrival + '\'' + 
			",product_slug = '" + productSlug + '\'' + 
			",dy_display_price = '" + dyDisplayPrice + '\'' + 
			",crossed_price = '" + crossedPrice + '\'' + 
			",rating = '" + rating + '\'' + 
			",description = '" + description + '\'' + 
			",inventory = '" + inventory + '\'' + 
			",in_stock = '" + inStock + '\'' + 
			",price = '" + price + '\'' + 
			",publish_time = '" + publishTime + '\'' + 
			",product_id = '" + productId + '\'' + 
			",variant = '" + variant + '\'' + 
			",currency = '" + currency + '\'' + 
			",categories = '" + categories + '\'' + 
			",sku = '" + sku + '\'' + 
			",brand = '" + brand + '\'' + 
			",sale_text = '" + saleText + '\'' + 
			",currency_symbol = '" + currencySymbol + '\'' + 
			",image_url = '" + imageUrl + '\'' + 
			",product_heading = '" + productHeading + '\'' + 
			",url = '" + url + '\'' + 
			",brand_url = '" + brandUrl + '\'' + 
			",under_sale = '" + underSale + '\'' + 
			",app_exclusive = '" + appExclusive + '\'' + 
			",bestseller = '" + bestseller + '\'' + 
			",group_id = '" + groupId + '\'' + 
			",name = '" + name + '\'' + 
			"}";
		}
}