package by.academy.dv.java.task6;

public class HomeTask6 {

	public static void main(String[] args) {
		int day = 2;
		int m = 11;
		int year = 2017;
		int nextDay = ++day;
		int z = nextDay;
		if (z < 9 && m < 9) {
			System.out.println("0" + z + " �����, " + "0" + m + " �����, "
					+ year + " ���.");
		} else if (z < 9 && m > 9) {
			System.out.println("0" + z + " �����, " + m + " �����, " + year
					+ " ���.");
		} else if (z > 9 && m < 9) {
			System.out.println(z + " �����, " + "0" + m + " �����, " + year
					+ " ���.");
		} else
			System.out
					.println(z + " �����, " + m + " �����, " + year + " ���.");

	}

}
