package com.casestudy.android.ui.productList.pojo;

import java.util.List;
import com.google.gson.annotations.SerializedName;

public class ProductResponse {

	@SerializedName("slots")
	private List<SlotsItem> slots;

	@SerializedName("subheader")
	private String subheader;

	@SerializedName("variation_name")
	private String variationName;

	@SerializedName("banner")
	private String banner;

	public void setSlots(List<SlotsItem> slots){
		this.slots = slots;
	}

	public List<SlotsItem> getSlots(){
		return slots;
	}

	public void setSubheader(String subheader){
		this.subheader = subheader;
	}

	public String getSubheader(){
		return subheader;
	}

	public void setVariationName(String variationName){
		this.variationName = variationName;
	}

	public String getVariationName(){
		return variationName;
	}

	public void setBanner(String banner){
		this.banner = banner;
	}

	public String getBanner(){
		return banner;
	}

	@Override
 	public String toString(){
		return 
			"ProductResponse{" +
			"slots = '" + slots + '\'' + 
			",subheader = '" + subheader + '\'' + 
			",variation_name = '" + variationName + '\'' + 
			",banner = '" + banner + '\'' + 
			"}";
		}
}