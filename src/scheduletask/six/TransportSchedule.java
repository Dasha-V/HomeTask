package scheduletask.six;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TransportSchedule {

	static void toDoTime(long millis) {
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
		Date date = new Date(millis);
		formatter.setTimeZone(TimeZone.getTimeZone("GMT"));
		String returnFormat = formatter.format(date);
		System.out.println(returnFormat);

	}

	static long connvertToMillis(String choice, int time) {

		if (choice.equals("hour")) {
			time = time * 3600000;

		} else if (choice.equals("minutes")) {
			time = time * 60000;

		}
		return time;

	}

	public long toDoSchedule(int startTimeinHours, int startTimeinMinutes,
			int numOfStation, int[] timeBetwStation) {
		long hour = connvertToMillis("hour", startTimeinHours);
		long minutes = connvertToMillis("minutes", startTimeinMinutes);
		long start = hour + minutes;
		toDoTime(start);

		for (int i = 0; i < numOfStation - 1; i++) {
			int timeToNextSttion = timeBetwStation[i];
			long next = connvertToMillis("minutes", timeToNextSttion);
			start += next;

			toDoTime(start);

		}
		return start;

	}
}
