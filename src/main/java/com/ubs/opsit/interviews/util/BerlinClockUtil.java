package com.ubs.opsit.interviews.util;

import static com.ubs.opsit.interviews.constant.LampConstant.IDLE;
import static com.ubs.opsit.interviews.constant.LampConstant.RED;
import static com.ubs.opsit.interviews.constant.LampConstant.YELLOW;

import com.ubs.opsit.interviews.pojo.TimeInput;

public class BerlinClockUtil {

	public static String topSecondLamp(TimeInput timeInput) {
		return timeInput.getSeconds() % 2 == 0 ? YELLOW.toString() : IDLE.toString();
	}

	public static String topHourLamps(TimeInput timeInput) {
		StringBuilder lamps = new StringBuilder();
		int noOfLamps = timeInput.getHours() / 5;
		for (int i = 0; i < 4; i++) {
			if (i < noOfLamps)
				lamps.append(RED.toString());
			else
				lamps.append(IDLE.toString());
		}
		return lamps.toString();
	}

	public static String topMinuteLamps(TimeInput timeInput) {
		StringBuilder lamps = new StringBuilder();
		int noOfLamps = timeInput.getMinutes() / 5;
		for (int i = 0; i < 11; i++) {
			if (i < noOfLamps) {
				if ((i + 1) % 3 == 0)
					lamps.append(RED.toString());
				else
					lamps.append(YELLOW.toString());
			} else
				lamps.append(IDLE.toString());
		}
		return lamps.toString();
	}

	public static String bottomHourLamps(TimeInput timeInput) {
		int noOfLamps = timeInput.getHours() % 5;
		return singleTimeLamps(RED.toString(), noOfLamps);
	}

	public static String bottomMinuteLamps(TimeInput timeInput) {
		int noOfLamps = timeInput.getMinutes() % 5;
		return singleTimeLamps(YELLOW.toString(), noOfLamps);
	}

	public static String singleTimeLamps(String activeColor, int noOfActiveLamp) {
		StringBuilder lamps = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			if (i < noOfActiveLamp)
				lamps.append(activeColor);
			else
				lamps.append(IDLE.toString());
		}
		return lamps.toString();
	}

}
