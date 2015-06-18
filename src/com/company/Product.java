package com.company;
class Product {
	private String name;
	private double gram;
	private double cost;
	private double price;
	
	// Designers
	
	public Product(){}
	
	public Product(String name,double gram, int cost){
		this.name = name;
		this.gram = gram;
		this.cost = cost;
	}
	
	//getters setters 
	
	public void setGram(double gram){
		this.gram = gram;
	}
	
	public double getGram() {
		return gram;
	}
	
	public void setCost(int cost){
		this.cost = cost;
	}
	
	public double getCost() {
		return cost;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}
}