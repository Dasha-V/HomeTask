package by.academy.dv.java.task13;

public class HomeTask13 {

	public static void main(String[] args) {

		double x;

		for (x = -0.2; x <= 10; x += 0.2) {

			if (x % 1 == 0 && x > 0) {

				break;

			}

		}
		System.out.println("Первое натуральное число: " + x);
	}

}
