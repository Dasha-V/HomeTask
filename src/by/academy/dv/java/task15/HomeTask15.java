package by.academy.dv.java.task15;

public class HomeTask15 {

	public static void main(String[] args) {
		int array[] = { 9, 2, 6, 10, 7, 3 };
		int iMax = array[0];
		int iMin = array[0];
		int sum = 0;
		int indexImin = 0;
		int indexImax = 0;

		for (int i = 0; i < array.length; i++) {
			if (iMax < array[i]) {
				iMax = array[i];
			}
			if (iMin > array[i]) {
				iMin = array[i];
			}
			int index = array[i];
			if (index == iMin) {
				indexImin = i;
			}
			if (index == iMax) {
				indexImax = i;
			}

		}
		for (int i = indexImin; i <= indexImax; i++) {
			sum += array[i];
		}

		for (int i = indexImax; i <= indexImin; i++) {
			sum += array[i];
		}

		System.out.println(sum);

		System.out.println(iMin);
		System.out.println(iMax);
		System.out.println(indexImin);
		System.out.println(indexImax);

	}
}
