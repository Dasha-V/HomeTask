package by.academy.dv.java.task6;

public class HomeTask6 {

	public static void main(String[] args) {
		int day = 2;
		int m = 11;
		int year = 2017;
		int nextDay = ++day;
		int z = nextDay;
		if (z < 9 && m < 9) {
			System.out.println("0" + z + " число, " + "0" + m + " месяц, "
					+ year + " год.");
		} else if (z < 9 && m > 9) {
			System.out.println("0" + z + " число, " + m + " месяц, " + year
					+ " год.");
		} else if (z > 9 && m < 9) {
			System.out.println(z + " число, " + "0" + m + " месяц, " + year
					+ " год.");
		} else {
			System.out
					.println(z + " число, " + m + " месяц, " + year + " год.");

		}
	}
}
