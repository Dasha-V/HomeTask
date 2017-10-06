package by.academy.dv.java.task10;

public class HomeTask10 {

	public static void main(String[] args) {

		int d = 112;
		int e = 0;
		while (d > 0) {
			e += d % 10;
			d /= 10;
		}

		System.out.print(e);

	}
}
