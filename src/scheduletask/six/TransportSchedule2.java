package scheduletask.six;

public class TransportSchedule2 {
	ConverterMillis converter = new ConverterMillis();
	TimeClass timeClass = new TimeClass();
	private int startTimeinHours;
	private int startTimeinMinutes;
	private int numOfStation;
	int[] timeBetwStation;

	public TransportSchedule2(int startTimeinHours, int startTimeinMinutes,
			int numOfStation, int[] timeBetwStation) {
		super();
		this.startTimeinHours = startTimeinHours;
		this.startTimeinMinutes = startTimeinMinutes;
		this.numOfStation = numOfStation;
		this.timeBetwStation = timeBetwStation;
	}

	public void toDoSchedule() {
		long hour = converter.connvertToMillis("hour", startTimeinHours);
		long minutes = converter
				.connvertToMillis("minutes", startTimeinMinutes);
		long start = hour + minutes;
		timeClass.toDoTime(start);

		for (int i = 0; i < numOfStation - 1; i++) {
			int timeToNextSttion = timeBetwStation[i];
			long next = converter.connvertToMillis("minutes", timeToNextSttion);// ??

			// timeClass.toDoTime(f);

		}

	}
}
