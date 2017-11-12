package scheduletask.two;

import java.util.Scanner;

public class ArrayTask {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		int size = 4;
		int array[] = new int[size];
		System.out.println("заполняем массив№1: ");
		for (int i = 0; i < array.length; i++) {
			System.out.println("Введите число: ");
			array[i] = sc.nextInt();
		}
		System.out.println("заполняем массив№2: ");
		int array2[] = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Введите число: ");
			array2[i] = sc.nextInt();
		}
		System.out.println("заполняем массив№3: ");
		int array3[] = new int[size];
		for (int i = 0; i < array.length; i++) {
			System.out.println("Введите число: ");
			array3[i] = sc.nextInt();
		}
		SelSort selSort = new SelSort();
		selSort.selectionSort(array);
		selSort.selectionSort(array2);
		selSort.selectionSort(array3);

		ArrCheck arrCheck = new ArrCheck();
		arrCheck.toCheckAr(array, array2, array3);
		sc.close();

	}

}
