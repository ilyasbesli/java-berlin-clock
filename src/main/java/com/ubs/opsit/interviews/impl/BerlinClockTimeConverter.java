package com.ubs.opsit.interviews.impl;

import com.ubs.opsit.interviews.TimeConverter;
import com.ubs.opsit.interviews.exception.InputTimeFormatException;
import com.ubs.opsit.interviews.pojo.BerlinClockLamp;
import com.ubs.opsit.interviews.pojo.TimeInput;
import com.ubs.opsit.interviews.util.BerlinClockUtil;
import com.ubs.opsit.interviews.validator.TimeValidator;
import com.ubs.opsit.interviews.validator.impl.BerlinClockTimeValidator;

/**
 * This class converts time input parameter to Berlin Clock format.
 * 
 * @author ibesli
 *
 */
public class BerlinClockTimeConverter implements TimeConverter {

	private final TimeValidator timeValidator;

	public BerlinClockTimeConverter() {
		timeValidator = new BerlinClockTimeValidator();
	}

	public BerlinClockTimeConverter(TimeValidator timeValidator) {
		this.timeValidator = timeValidator;
	}

	/**
	 * It is the start point of conversion.
	 * This method convert time input parameter to Berlin Clock format.
	 * 
	 * @param time it is the time input parameter
	 * @return it returns Berlin Clock format string
	 */
	@Override
	public String convertTime(String time) {
		validateTimeInput(time);

		TimeInput timeInput = new TimeInput(time);
		BerlinClockLamp berlinClockLamp = createBerlinClockLamp(timeInput);
		return berlinClockLamp.toString();
	}

	/**
	 * This method validate {@code time} input parameter.
	 * 
	 * @param time
	 * @throws InputTimeFormatException if time parameter is not valid, this exception will be thrown
	 */
	private void validateTimeInput(String time) {
		if (!timeValidator.isTimeInputValid(time))
			throw new InputTimeFormatException(time);
	}

	/**
	 * This method create Berlin Clock object to hold data.
	 * This object will be used to format Berlin Clock time
	 * 
	 * @param timeInput it contains time as a parts like hours, minutes and seconds
	 * @return It will return created {@code BerlinClock} object
	 */
	private BerlinClockLamp createBerlinClockLamp(TimeInput timeInput) {
		BerlinClockLamp berlinClockLamp = new BerlinClockLamp();
		berlinClockLamp.setTopSecond(BerlinClockUtil.topSecondLamp(timeInput));
		berlinClockLamp.setTopHours(BerlinClockUtil.topHourLamps(timeInput));
		berlinClockLamp.setBottomHours(BerlinClockUtil.bottomHourLamps(timeInput));
		berlinClockLamp.setTopMinutes(BerlinClockUtil.topMinuteLamps(timeInput));
		berlinClockLamp.setBottomMinutes(BerlinClockUtil.bottomMinuteLamps(timeInput));
		return berlinClockLamp;
	}

}
