package com.yedam.spring.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.yedam.spring.java.Chef;

@Component
public class Restaurant {
	private Chef chef;

	public Restaurant(Chef chef) {
		System.out.println("생성자 인젝션");
		this.chef = chef;
	}

	public Restaurant() {}

	@Autowired
	public void setChef(Chef chef) {
		System.out.println("setter 인젝션");
		this.chef = chef;
	}

	public void run() {
		chef.cooking();
	}
}
