package com.ubs.opsit.interviews.constant;

public enum LampConstant {
	YELLOW("Y"), RED("R"), IDLE("O");

	String color;

	private LampConstant(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return color;
	}

}
