package scheduletask.six;

import java.text.DecimalFormat;

public class TransportSchedule {

	private double startTime;
	private int numOfStation;
	double[] timeBetwStation;

	public TransportSchedule(double startTime, int numOfStation,
			double[] timeBetwStation) {
		super();
		this.startTime = startTime;
		this.numOfStation = numOfStation;
		this.timeBetwStation = timeBetwStation;
	}

	public void toDoSchedule() {
		DecimalFormat dcf = new DecimalFormat("#.00");
		System.out.println(dcf.format(startTime));
		for (int i = 0; i < numOfStation - 1; i++) {
			double timeToNextSttion = timeBetwStation[i];
			double our = timeToNextSttion / 60;
			int n = (int) our;
			double minuts = ((our - n) * 60) * 0.01;// ??
			startTime += (n + minuts);

			System.out.println(dcf.format(startTime));
		}

	}
}
