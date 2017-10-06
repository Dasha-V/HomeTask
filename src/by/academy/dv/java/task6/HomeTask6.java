package by.academy.dv.java.task6;

public class HomeTask6 {

	public static void main(String[] args) {
		int day = 2;
		int m = 11;
		int year = 2017;
		int nextDay = ++day;
		int z = nextDay;
		if (z < 9 && m < 9) {
			System.out.println("0" + z + " число, " + "0" + m + " мес€ц, "
					+ year + " год.");
		} else if (z < 9 && m > 9) {
			System.out.println("0" + z + " число, " + m + " мес€ц, " + year
					+ " год.");
		} else if (z > 9 && m < 9) {
			System.out.println(z + " число, " + "0" + m + " мес€ц, " + year
					+ " год.");
		} else
			System.out
					.println(z + " число, " + m + " мес€ц, " + year + " год.");

	}

}
