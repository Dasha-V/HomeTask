package by.academy.dv.java.task20;

public class Task20 {

	public static void main(String[] args) {
		StringBuffer newString = new StringBuffer();
		String str = "Просто строка с текстом";
		String newStr[] = str.split(" ");
		for (String string : newStr) {

			char lastA = string.charAt(string.length() - 1);
			newString.append(lastA);

		}

		System.out.println(newString);

	}

}
