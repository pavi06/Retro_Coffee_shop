package com.shop.retrocoffeeshop.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

@Entity
@Table(name="retro_items")
public class Items {
	
	@Id
	@SequenceGenerator(name="items_seq",initialValue=3000,allocationSize=1)
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator="items_seq")
	int itemId;
	String itemName;
	String itemCategory;
	double itemPrice;
	
	public Items(int itemId, String itemName,String itemCategory, double itemPrice){
		this.itemId=itemId;
		this.itemName=itemName;
		this.itemCategory=itemCategory;
		this.itemPrice=itemPrice;
	}
	
	public int getItemId() {
		return itemId;
	}
	public void setItemId(int itemId) {
		this.itemId = itemId;
	}
	public String getItemName() {
		return itemName;
	}
	public void setItemName(String itemName) {
		this.itemName = itemName;
	}
	public String getItemCategory() {
		return itemCategory;
	}
	public void setItemCategory(String itemCategory) {
		this.itemCategory = itemCategory;
	}
	public double getItemPrice() {
		return itemPrice;
	}
	public void setItemPrice(double itemPrice) {
		this.itemPrice = itemPrice;
	}
	

}
