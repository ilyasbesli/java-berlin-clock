package com.ubs.opsit.interviews.constant;

/**
 * This class contains type of lamp state.
 * Berlin Clock should have one of these types.
 * 
 * @author ibesli
 *
 */
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
