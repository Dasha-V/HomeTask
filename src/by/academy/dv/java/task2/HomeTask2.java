package by.academy.dv.java.task2;

public class HomeTask2 {

	public static void main(String[] args) {
		int s = 605000;
		int sec = s % 60;
		int m = (s - sec) / 60;
		int min = m % 60;
		int h = (m - min) / 60;
		int day = h / 24;
		int week = day / 7;

		System.out.println(String.format(
				"Week: %s, day: %s, hour: %s, min: %s, sec: %s", week, day, h,
				min, sec));
	}

}
