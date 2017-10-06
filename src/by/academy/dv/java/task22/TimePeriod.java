package by.academy.dv.java.task22;
public class TimePeriod {

	private long timefrom;
	private long timeTo;

	public long getTimefrom() {
		return timefrom;
	}

	public void setTimefrom(long timefrom) {
		this.timefrom = timefrom;
	}

	public long getTimeTo() {
		return timeTo;
	}

	public void setTimeTo(long timeTo) {
		this.timeTo = timeTo;
	}

	public TimePeriod(long timefrom, long timeTo) {
		super();
		this.timefrom = timefrom;
		this.timeTo = timeTo;
	}

	public void prinData() {

		String str = String.format("начало=%s, конец =%s, период=%s", timefrom,
				timeTo, timefrom - timeTo);
		System.out.println(str);

	}

	public int getTotalSeconds() {

		int seconds = (int) (( timeTo-timefrom) / 1000);
		return seconds;

	};

	public int compareTo(TimePeriod anotherPeriod) {

		int totalSeconds1 = getTotalSeconds();
		int totalSeconds2 = anotherPeriod.getTotalSeconds();

		if (totalSeconds1 == totalSeconds2) {
			return 0;
		}
		
		if (totalSeconds1 < totalSeconds2) {
			return -1;
		} else {
			return 1;
		}

	};

}
