package by.academy.dv.java.task3part2;

public class HomeTask3part2 {

	public static void main(String[] args) {

		String str = "<p style = \"color:red\" hello <p>";
		System.out.println(str.replaceAll("<p [^>]+>", "<p>"));

	}
}
