package by.academy.dv.java.task4part2;

import java.text.NumberFormat;
import java.util.Locale;

public class HomeTask4par2 {

	public static void main(String[] args) {
		Locale localeUk = new Locale("uk", "UA");
		NumberFormat ukFormat = NumberFormat.getCurrencyInstance(localeUk);
		System.out.println(ukFormat.format(153.5));

	}

}
