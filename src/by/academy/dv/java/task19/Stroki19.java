package by.academy.dv.java.task19;

public class Stroki19 {

	public static void main(String[] args) {
		String str = "  Всего слов в строке   ";
		String str2 = str.trim();
		String[] words = str2.split(" ");

		System.out.println("Всего слов в строке " + words.length);

	}

}
