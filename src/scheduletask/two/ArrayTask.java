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

		for (int a1 : array) {
			for (int a2 : array2) {
				for (int a3 : array3) {
					int sum = a1 + a2;
					if (a3 == sum) {
						System.out.println(a1 + "+" + a2 + " = " + a3);
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
