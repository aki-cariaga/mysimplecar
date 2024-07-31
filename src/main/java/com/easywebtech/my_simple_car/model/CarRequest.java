package com.easywebtech.my_simple_car.model;

import jakarta.xml.bind.annotation.XmlAccessType;
import jakarta.xml.bind.annotation.XmlAccessorType;
import jakarta.xml.bind.annotation.XmlElement;
import jakarta.xml.bind.annotation.XmlRootElement;

@XmlAccessorType(XmlAccessType.NONE)
@XmlRootElement(name = "car")
public class CarRequest extends Car {
	
	@XmlElement(name = "lengthOperator")
	private String lengthOperator;
	
	@XmlElement(name = "weightOperator")
	private String weightOperator;
	
	@XmlElement(name = "velocityOperator")
	private String velocityOperator;
	
	public String getLengthOperator() {
		return lengthOperator;
	}
	public void setLengthOperator(String lengthOperator) {
		this.lengthOperator = lengthOperator;
	}
	
	public String getWeightOperator() {
		return weightOperator;
	}
	public void setWeightOperator(String weightOperator) {
		this.weightOperator = weightOperator;
	}
	public String getVelocityOperator() {
		return velocityOperator;
	}
	public void setVelocityOperator(String velocityOperator) {
		this.velocityOperator = velocityOperator;
	}
	
	
}
