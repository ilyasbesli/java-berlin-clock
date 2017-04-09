package com.ubs.opsit.interviews.validator.impl;

import java.util.regex.Pattern;

import com.ubs.opsit.interviews.validator.TimeValidator;

public class BerlinClockTimeValidator implements TimeValidator {

	private final String TIME24HOURS_PATTERN = "(([01]?[0-9]|2[0-3]):[0-5][0-9]:[0-5][0-9])|24:00:00";

	private Pattern pattern = Pattern.compile(TIME24HOURS_PATTERN);

	/**
	 * Validate 24 hours time format with regular expression
	 * 
	 * @param time time address for validation
	 * @return true time is valid format, false time is invalid format
	 */
	@Override
	public boolean isTimeInputValid(String time) {
		return pattern.matcher(time).matches();
	}

}
