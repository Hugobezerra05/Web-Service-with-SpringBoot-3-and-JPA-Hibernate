package com.educandoweb.Curso.enums;

public enum OrderStatus {

	WAITING_PAYMENT(1),
	PAID(2),
	SHIPPED(3),
	DELIVERED(4),
	CANCELD(5);
	
	private int code ; 
	
	// Constructor ; 
	
	private OrderStatus(int code) {
		this.code = code ;
	}
	
	// Getter ; 
	
	public int getCode() {
		return code ; 
	}
	
	// Method ; 
	
	public static OrderStatus valueOf(int code) {
		
		for (OrderStatus value : OrderStatus.values()) {
			if(value.getCode() == code) {
				return value ; 
			}
		}
		
		throw new IllegalArgumentException("Invalid OrderStatus code.");
	}
}
