package Lesson2;

public class Task3 {

	public static void main(String[] args) {
		// ¬ данном массиве чисел ј1, ј2, ... , јn помен€ть местами минимальный
		// и максимальный элементы.
		// 0 1 2 3 4 5
		int[] array = { 1, 4, 9, -5, 10, -6 };
		int maxV = 0;
		int minV = 0;
		int indexMaxV = 0;
		int indexMinV = 0;
		int temp;
		for (int i = 0; i < array.length; i++) {

			int currentValue = array[i];
			
			if (maxV < currentValue) {// находим и записываем максимальное
				maxV = currentValue;// значение переменную maxV

			}

			if (minV > currentValue) {// находим и записываем максимальное
				minV = currentValue; // значение переменную minV

			}

			if (currentValue == maxV) {
				indexMaxV = i;

			}

			if (currentValue == minV) {
				indexMinV = i;

			}
			// мен€емс€ местами

			temp = indexMinV;
			indexMinV = indexMaxV;
			indexMinV = temp;

		}

		System.out.println(maxV);
		System.out.println(minV);
		System.out.println(indexMaxV);
		System.out.println(indexMinV);

	}
}