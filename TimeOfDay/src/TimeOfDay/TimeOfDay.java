package TimeOfDay;

public class TimeOfDay {
	
	
	private int hours;
	private int minutes;
	
	/**
	 * Creates a new TimeOfDay object.
	 * 
	 * @param hours the hour of the day (0-23)
	 * @param minutes the minute of the hour (0-59)
	 * @pre | 0 <= hours && hours <= 23
	 * @pre | 0 <= minutes && minutes <= 59
	 * @post | getHours() == hours
	 * @post | getMinutes() == minutes
	 */
	
	public TimeOfDay(int hours, int minutes) {
		this.hours = hours;
		this.minutes = minutes;	
	}
	
	
	
	/**
	 * Returns the hour of this time.
	 * 
	 * @return the hour (0-23)
	 */
	public int getHours() {
		return hours;
		
	}
	
	
	/**
	 * Returns the minute of this time.
	 * 
	 * @return the minute (0-59)
	 */
	public int getMinutes() {
		return minutes;	
	}
	
	/**
	 * Returns the number of minutes since midnight.
	 * 
	 * @return minutes since midnight (0-1439)
	 */
	public int getMinutesFromMidnights() {
		return hours * 60 + minutes;	
	}
	
	
	/**
	 * Sets the hour of this time.
	 * 
	 * @param hours the new hour (0-23)
	 * @pre | 0 <= hours && hours <= 23
	 * @mutates | this
	 * @post | getHours() == hours
	 * @post | getMinutes() == old(getMinutes())
	 */
	public void setHours(int hours) {
		this.hours = hours;
	}
	
	
	/**
	 * Sets the minute of this time.
	 * 
	 * @param minutes the new minute (0-59)
	 * @pre | 0 <= minutes && minutes <= 59
	 * @mutates | this
	 * @post | getMinutes() == minutes
	 * @post | getHours() == old(getHours())
	 */
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	
	/**
	 * Sets the time using minutes since midnight.
	 * 
	 * @param minutes minutes since midnight (0-1439)
	 * @pre | 0 <= minutes && minutes <= 1439
	 * @mutates | this
	 * @post | getMinutesFromMidnights() == minutes
	 */
	public void setMinutesFromMidnights(int minutes) {
		this.hours = minutes/60;
		this.minutes = minutes%60 ;
	}
}
