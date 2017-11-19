package scheduletask.two;

import java.util.Arrays;
import java.util.Scanner;

public class ArrayTask {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = 4;
		int array[] = new int[size];
		System.out.println("заполняем массив№1: ");
		enterArray(sc, array);
		System.out.println("заполняем массив№2: ");
		int array2[] = new int[size];
		enterArray(sc, array2);
		System.out.println("заполняем массив№3: ");
		int array3[] = new int[size];
		enterArray(sc, array3);
		Arrays.sort(array);
		Arrays.sort(array2);
		Arrays.sort(array3);

		int length = array.length;
		for (int i = 0; i < length; i++) {
			int a = array[i];
			for (int j = 0; j < length; j++) {
				int b = array2[j];
				int sum = a + b;
				for (int z = 0; z < array3.length; z++) {
					int c = array3[z];
					if (c == sum) {
						System.out.println(a + "+" + b + " = " + c);
					}

				}

			}

		}
		sc.close();

	}

	private static void enterArray(Scanner sc, int[] array) {
		for (int i = 0; i < array.length; i++) {
			System.out.println("Введите число: ");
			array[i] = sc.nextInt();
		}
	}

}
