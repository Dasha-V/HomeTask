package scheduletask.six;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.TimeZone;

public class TimeClass {

	public void toDoTime(long millis) {
		SimpleDateFormat formatter = new SimpleDateFormat("HH:mm");
		Date date = new Date(millis);
		formatter.setTimeZone(TimeZone.getTimeZone("GMT"));
		String returnFormat = formatter.format(date);
		System.out.println(returnFormat);

	}

}
