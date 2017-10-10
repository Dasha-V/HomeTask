package by.academy.dv.java.task9;

public class HomeTask9 {

	public static void main(String[] args) {
		int max = 0;
		int x = (int) (Math.random() * 20);
		while (x != 0) {
			x = (int) (Math.random() * 20);

			System.out.print(x + " ");
			if (x != 0 && x > max) {
				max = x;

			}
		}
		System.out.println();
		System.out.print("Максимальное число: " + max);
	}

}
