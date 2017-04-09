package com.ubs.opsit.interviews.util;

import static com.ubs.opsit.interviews.constant.LampConstant.IDLE;
import static com.ubs.opsit.interviews.constant.LampConstant.RED;
import static com.ubs.opsit.interviews.constant.LampConstant.YELLOW;

import com.ubs.opsit.interviews.pojo.TimeInput;

/**
 * It contains util methods of Berlin Clock conversion
 * 
 * @author ibesli
 *
 */
public class BerlinClockUtil {

	/**
	 * It generates first rows of Berlin Clock.
	 * It holds seconds counter.
	 * 
	 * @param timeInput It take {@code TimeInput} parameter
	 * @return {@code Y} if second is even number, {@code 0} second is odd
	 */
	public static String topSecondLamp(TimeInput timeInput) {
		return timeInput.getSeconds() % 2 == 0 ? YELLOW.toString() : IDLE.toString();
	}

	/**
	 * It generates first hours row of Berlin Clock.
	 * It holds hours counter. Every light shows 5 hours
	 * 
	 * @param timeInput It take {@code TimeInput} parameter
	 * @return formatted Berlin Clock first hours row
	 */
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

	/**
	 * It generates first minutes row of Berlin Clock.
	 * It holds minutes counter. Every light shows 5 minutes
	 * 
	 * @param timeInput It take {@code TimeInput} parameter
	 * @return formatted Berlin Clock first minutes row
	 */
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

	/**
	 * It generates second hours row of Berlin Clock.
	 * It holds hours counter. Every light shows 1 hour
	 * 
	 * @param timeInput It take {@code TimeInput} parameter
	 * @return formatted Berlin Clock second hours row
	 */
	public static String bottomHourLamps(TimeInput timeInput) {
		int noOfLamps = timeInput.getHours() % 5;
		return singleTimeLamps(RED.toString(), noOfLamps);
	}

	/**
	 * It generates second minutes row of Berlin Clock.
	 * It holds minutes counter. Every light shows 1 minute
	 * 
	 * @param timeInput It take {@code TimeInput} parameter
	 * @return formatted Berlin Clock second minutes row
	 */
	public static String bottomMinuteLamps(TimeInput timeInput) {
		int noOfLamps = timeInput.getMinutes() % 5;
		return singleTimeLamps(YELLOW.toString(), noOfLamps);
	}

	/**
	 * This method generate second minutes and hours row of Berlin Clock
	 * 
	 * @param color which color will be filled
	 * @param noOfActiveLamp number of active lamps
	 * @return formatted Berlin Clock row related take parameter
	 */
	public static String singleTimeLamps(String color, int noOfActiveLamp) {
		StringBuilder lamps = new StringBuilder();
		for (int i = 0; i < 4; i++) {
			if (i < noOfActiveLamp)
				lamps.append(color);
			else
				lamps.append(IDLE.toString());
		}
		return lamps.toString();
	}

}
