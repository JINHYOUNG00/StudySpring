package com.yedam.spring.java;

public class Restaurant {
	private Chef chef;
	
	public Restaurant(Chef chef) {
		System.out.println("생성자 인젝션");
		this.chef = chef;
	}
	
	public Restaurant() {}
	
	public void setChef(Chef chef) {
		System.out.println("setter 인젝션");
		this.chef = chef;
	}
	
	public void run() {
		chef.cooking();
	}
}
