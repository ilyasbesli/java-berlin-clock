package com.ubs.opsit.interviews.exception;

/**
 * When time input value is not valid this exception will be thrown.
 * 
 * @author ibesli
 *
 */
public class InputTimeFormatException extends RuntimeException {

	private static final long serialVersionUID = 8845365360438449848L;

	/**
	 * This {@code exception} takes {@code time} input parameter.
	 * It will call parent constructor with {@code time} input parameter.
	 * 
	 * @param time it takes time input parameter
	 */
	public InputTimeFormatException(String time) {
		super("Input time " + time + "format is invalid.Its format should be [HH:mm:ss]");
	}
}
