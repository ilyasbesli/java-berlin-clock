package com.ubs.opsit.interviews.impl;

import com.ubs.opsit.interviews.TimeConverter;
import com.ubs.opsit.interviews.exception.InputTimeFormatException;
import com.ubs.opsit.interviews.pojo.BerlinClockLamp;
import com.ubs.opsit.interviews.pojo.TimeInput;
import com.ubs.opsit.interviews.util.BerlinClockUtil;
import com.ubs.opsit.interviews.validator.TimeValidator;
import com.ubs.opsit.interviews.validator.impl.BerlinClockTimeValidator;

public class BerlinClockTimeConverter implements TimeConverter {

	private final TimeValidator timeValidator;

	public BerlinClockTimeConverter() {
		timeValidator = new BerlinClockTimeValidator();
	}

	public BerlinClockTimeConverter(TimeValidator timeValidator) {
		this.timeValidator = timeValidator;
	}

	@Override
	public String convertTime(String time) {
		validateTimeInput(time);

		TimeInput timeInput = new TimeInput(time);
		BerlinClockLamp berlinClockLamp = createBerlinClockLamp(timeInput);
		return berlinClockLamp.toString();
	}

	private void validateTimeInput(String time) {
		if (!timeValidator.isTimeInputValid(time))
			throw new InputTimeFormatException(time);
	}

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
