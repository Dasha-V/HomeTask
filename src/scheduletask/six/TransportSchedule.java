package scheduletask.six;

public class TransportSchedule {
	ConverterMillis converter;
	TimeClass timeClass;

	public TransportSchedule(ConverterMillis converter, TimeClass timeClass) {
		super();
		this.converter = converter;
		this.timeClass = timeClass;
	}

	public long toDoSchedule(int startTimeinHours, int startTimeinMinutes,
			int numOfStation, int[] timeBetwStation) {
		long hour = converter.connvertToMillis("hour", startTimeinHours);
		long minutes = converter
				.connvertToMillis("minutes", startTimeinMinutes);
		long start = hour + minutes;
		timeClass.toDoTime(start);

		for (int i = 0; i < numOfStation - 1; i++) {
			int timeToNextSttion = timeBetwStation[i];
			long next = converter.connvertToMillis("minutes", timeToNextSttion);
			start += next;

			timeClass.toDoTime(start);

		}
		return start;

	}
}
