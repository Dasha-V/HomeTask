package by.academy.dv.java.task9;

public class HomeTask9 {

	public static void main(String[] args) {
		int max = 0;
		int min = 0;
		int x = (int) (Math.random() * 20);
		while (x != 0) {
			x = (int) (Math.random() * 20);
			min = x;
			System.out.print(x+" ");
			if (min!=0&&min > max) {
				max = min;

			}
		}
		System.out.println();
		System.out.print("Максимальное число: "+max);
	}

}
