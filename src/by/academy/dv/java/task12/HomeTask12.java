package by.academy.dv.java.task12;

import java.text.NumberFormat;

public class HomeTask12 {

	public static void main(String[] args) {
		int number = 23548698;
		NumberFormat formatter = NumberFormat.getNumberInstance();
		String s = formatter.format(number);
		System.out.println(s);

	}

}
