package by.academy.dv.java.task2part2;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class HomeTask2part2 {

	public static void main(String[] args) {

		String str = "ab15cdf 168EAGR";
		Pattern pat = Pattern.compile("[0-9A-Fa-f]+");
		Matcher m = pat.matcher(str);

		while (m.find()) {

			System.out.println(m.group());

		}

	}
}
