package com.ubs.opsit.interviews.exception;

public class InputTimeFormatException extends RuntimeException {

	private static final long serialVersionUID = 8845365360438449848L;

	public InputTimeFormatException(String time) {
		super("Input time " + time + "format is invalid.Its format should be [HH:mm:ss]");
	}
}
