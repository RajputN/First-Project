package com.example.product;

public class Product {
	    private int id;
	    private String name;
	    private String url;
	    private int categoryid;
	    private String description;
	    private int price;
	    private int quantity;
	    
		public int getId() {
			return id;
		}
		public String getDescription() {
			return description;
		}
		public void setDesciption(String description) {
			this.description = description;
		}
		public void setId(int id) {
			this.id = id;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public String getUrl() {
			return url;
		}
		public void setUrl(String url) {
			this.url = url;
		}
		public int getCategoryid() {
			return categoryid;
		}
		public void setCategoryid(int category) {
			this.categoryid = category;
		}
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getQuantity() {
			return quantity;
		}
		public void setQuantity(int quantity) {
			this.quantity = quantity;
		}
	    
	    
	    

}
