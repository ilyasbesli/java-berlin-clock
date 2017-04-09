package com.ubs.opsit.interviews.validator.impl;

import java.util.regex.Pattern;

import com.ubs.opsit.interviews.validator.TimeValidator;

/**
 * This class implements {@code BerlinClockTimeValidator} interface.
 * Validate {@code time} parameter according to Berlin Clock format
 * 
 * @author ibesli
 *
 */
public class BerlinClockTimeValidator implements TimeValidator {

	private final String TIME24HOURS_PATTERN = "(([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9])|24:00:00";

	private Pattern pattern = Pattern.compile(TIME24HOURS_PATTERN);

	/**
	 * Validate 24 hours time format with regular expression
	 * 
	 * @param time {@code time} parameter for validation
	 * @return {@code true} time is valid format, {@code false} time is invalid format
	 */
	@Override
	public boolean isTimeInputValid(String time) {
		return pattern.matcher(time).matches();
	}

}
