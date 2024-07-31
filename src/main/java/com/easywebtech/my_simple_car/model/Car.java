package com.easywebtech.my_simple_car.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;

@XmlAccessorType(XmlAccessType.NONE)
public class Car {
	
    public Car() {}
	
	public Car(Integer length, Integer weight, Integer velocity, String color) {
        this.length = length;
        this.weight = weight;
        this.velocity = velocity;
        this.color = color;
    }
	
	@XmlElement(name = "length")
	private Integer length;
	
	@XmlElement(name = "weight")
	private Integer weight; 
	
	@XmlElement(name = "velocity")
	private Integer velocity;
	
	@XmlElement(name = "color")
	private String color;
	
	public Integer getLength() {
		return length;
	}
	public void setLength(Integer length) {
		this.length = length;
	}
	public Integer getWeight() {
		return weight;
	}
	public void setWeight(Integer weight) {
		this.weight = weight;
	}
	public Integer getVelocity() {
		return velocity;
	}
	public void setVelocity(Integer velocity) {
		this.velocity = velocity;
	}
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	
	
	
}
