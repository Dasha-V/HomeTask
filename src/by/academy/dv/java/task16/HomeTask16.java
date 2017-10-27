package by.academy.dv.java.task16;

public class HomeTask16 {

	public static void main(String[] args) {
		int array[] = new int[10];
		for (int i = 0; i < 10; i++) {
			array[i] = (int) (Math.random() * 6 + 1);
			System.out.print(array[i]);
		}
		System.out.print("  ");
		for (int i = array.length - 1; i >= 0; i--) {

			System.out.print(array[i]);
		}

	}
}
