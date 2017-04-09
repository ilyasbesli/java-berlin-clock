package com.ubs.opsit.interviews.pojo;

import java.util.stream.Stream;

public class TimeInput {

	private Integer hours;
	private Integer minutes;
	private Integer seconds;

	public TimeInput(String time) {
		int[] timeSplitArr = Stream.of(time.split(":")).mapToInt(Integer::parseInt).toArray();
		hours = Integer.valueOf(timeSplitArr[0]);
		minutes = Integer.valueOf(timeSplitArr[1]);
		seconds = Integer.valueOf(timeSplitArr[2]);
	}

	public Integer getHours() {
		return hours;
	}

	public void setHours(Integer hours) {
		this.hours = hours;
	}

	public Integer getMinutes() {
		return minutes;
	}

	public void setMinutes(Integer minutes) {
		this.minutes = minutes;
	}

	public Integer getSeconds() {
		return seconds;
	}

	public void setSeconds(Integer seconds) {
		this.seconds = seconds;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + hours;
		result = prime * result + minutes;
		result = prime * result + seconds;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TimeInput other = (TimeInput) obj;
		if (hours != other.hours)
			return false;
		if (minutes != other.minutes)
			return false;
		if (seconds != other.seconds)
			return false;
		return true;
	}

	@Override
	public String toString() {
		return "TimeInput [hours=" + hours + ", minutes=" + minutes + ", seconds=" + seconds + "]";
	}

}
