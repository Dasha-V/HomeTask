package by.academy.dv.java.task7;

public class homeTask7 {

	public static void main(String[] args) {
		int a = 5;
		int b = 6;
		int c = 4;
		int d = 2;
		int e = 8;
		int f = 20;

		if (e >= a && e >= c && f >= (b + d)) {
			if (e >= (a + c) && f >= b && f >= d) {
				System.out.println("Дома помещаются на участке.");

			} else
				System.out.println("Участок слишком малю.");

		}

	}

}
