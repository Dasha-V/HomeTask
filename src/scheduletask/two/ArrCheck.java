package scheduletask.two;

public class ArrCheck {

	public void toCheckAr(int arr1[], int arr2[], int arr3[]) {
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
