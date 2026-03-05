package TimeOfDay;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class TimeOfDayTest {

	@Test
	void test() {
		TimeOfDay myTime = new TimeOfDay(13, 30);
		
		myTime.setHours(17);
		assertEquals(17, myTime.getHours());
		assertEquals(30, myTime.getMinutes());
		assertEquals(1050, myTime.getMinutesFromMidnights());
		
		myTime.setMinutes(50);
		assertEquals(17, myTime.getHours());
		assertEquals(50,myTime.getMinutes());
		assertEquals(1070, myTime.getMinutesFromMidnights());
		
		myTime.setMinutesFromMidnights(1000);
		assertEquals(16, myTime.getHours());
		assertEquals(40, myTime.getMinutes());
		assertEquals(1000, myTime.getMinutesFromMidnights());
		
	}

}
