package by.academy.dv.java.task21;

public class HomeTask21 {

	public static void main(String[] args) {
		String word = "welcome to hotel California. ";
		String[] words = word.split(" ");
		StringBuffer stringbuffer = new StringBuffer();
		String allTogether = " ";
		for (String string : words) {
			stringbuffer.append(string);
			allTogether += string;
		}
		System.out.println(stringbuffer);
		System.out.println(allTogether);

	}

}
