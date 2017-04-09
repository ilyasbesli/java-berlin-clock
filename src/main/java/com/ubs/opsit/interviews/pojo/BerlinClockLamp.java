package com.ubs.opsit.interviews.pojo;

/**
 * This class consists Berlin Clock Lamp row values.
 * It hold every rows at separate variables
 * 
 * @author ibesli
 *
 */
public class BerlinClockLamp {

	private String topSecond;
	private String topHours;
	private String bottomHours;
	private String topMinutes;
	private String bottomMinutes;

	public String getTopSecond() {
		return topSecond;
	}

	public void setTopSecond(String topSecond) {
		this.topSecond = topSecond;
	}

	public String getTopHours() {
		return topHours;
	}

	public void setTopHours(String topHours) {
		this.topHours = topHours;
	}

	public String getBottomHours() {
		return bottomHours;
	}

	public void setBottomHours(String bottomHours) {
		this.bottomHours = bottomHours;
	}

	public String getTopMinutes() {
		return topMinutes;
	}

	public void setTopMinutes(String topMinutes) {
		this.topMinutes = topMinutes;
	}

	public String getBottomMinutes() {
		return bottomMinutes;
	}

	public void setBottomMinutes(String bottomMinutes) {
		this.bottomMinutes = bottomMinutes;
	}

	/**
	 * This method produce Berlin Clock formatted data.
	 */
	@Override
	public String toString() {
		return new StringBuilder()
				.append(topSecond).append("\n")
				.append(topHours).append("\n")
				.append(bottomHours).append("\n")
				.append(topMinutes).append("\n")
				.append(bottomMinutes)
				.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((bottomHours == null) ? 0 : bottomHours.hashCode());
		result = prime * result + ((bottomMinutes == null) ? 0 : bottomMinutes.hashCode());
		result = prime * result + ((topHours == null) ? 0 : topHours.hashCode());
		result = prime * result + ((topMinutes == null) ? 0 : topMinutes.hashCode());
		result = prime * result + ((topSecond == null) ? 0 : topSecond.hashCode());
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
		BerlinClockLamp other = (BerlinClockLamp) obj;
		if (bottomHours == null) {
			if (other.bottomHours != null)
				return false;
		} else if (!bottomHours.equals(other.bottomHours))
			return false;
		if (bottomMinutes == null) {
			if (other.bottomMinutes != null)
				return false;
		} else if (!bottomMinutes.equals(other.bottomMinutes))
			return false;
		if (topHours == null) {
			if (other.topHours != null)
				return false;
		} else if (!topHours.equals(other.topHours))
			return false;
		if (topMinutes == null) {
			if (other.topMinutes != null)
				return false;
		} else if (!topMinutes.equals(other.topMinutes))
			return false;
		if (topSecond == null) {
			if (other.topSecond != null)
				return false;
		} else if (!topSecond.equals(other.topSecond))
			return false;
		return true;
	}

}
