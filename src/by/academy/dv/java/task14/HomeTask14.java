package by.academy.dv.java.task14;

public class HomeTask14 {

	public static void main(String[] args) {
		int marks[] = { 1, 2, 5, 8, 9, 7 };
		int marksMax = marks[0];
		int indexMaxV = 0;
		
		for (int i = 0; i < marks.length; i++) {
			if (marksMax < marks[i]) {
				marksMax = marks[i];
				 

			}
			int val= marks[i];
			if (val == marksMax) {
				indexMaxV = i;

			}
		}
		System.out.println(indexMaxV);
	}

}
