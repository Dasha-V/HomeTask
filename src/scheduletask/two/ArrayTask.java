package scheduletask.two;

public class ArrayTask {

	public static void main(String[] args) {
		int arr1[] = { 1, 2, 4, 7 };
		int arr2[] = { 2, 5, 7, 8 };
		int arr3[] = { 1, 3, 5, 9 };
		for (int i = 0; i < arr1.length; i++) {
			int a = arr1[i];
			for (int j = 0; j < arr1.length; j++) {
				int b = arr2[j];
				int sum = a + b;
				for (int z = 0; z < arr2.length; z++) {
					int c = arr3[z];
					if (c == sum) {
						System.out.println(a + "+" + b + " = " + c);
					}

				}

			}

		}

	}

}
