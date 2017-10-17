package by.academy.dv.java.task11;

public class HomeTask11 {

	public static void main(String[] args) {
		int n = 17;
		boolean f = true;

		for (int i = 2; i < n; i++) {

			if (n % i == 0) {
				System.out.println(n + " не является простым");
				f = false;
				break;

			}

		}
		if (f) {
			System.out.println(n + " число простое");
		}

	}

}
