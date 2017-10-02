package by.academydv.java.task2;

public class HomeTask2 {

	public static void main(String[] args) {
		int s = 605000;
		int day;
		int week;
		int sec;
		int m;
		int min;
		int h;
		sec = s% 60;
		m = (s-sec)/60;
		min = m%60;
		h = (m-min)/60;
		day = h/24;
		week = day/7;
	System.out.println(week+ " неделя " + day + " дней "+  
		h + " часов " + min + " минут " + sec + " секунд");
	}

}
