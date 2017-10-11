package by.academy.dv.java.task18;

public class HomeTask18 {

	public static void main(String[] args) {
		String str = "строка!! с разными, знаками , препинания;;";
		int n1 = 0;
		int n2 = 0;
		int n3 = 0;
		int sum = 0;
		char symbol;
		for (int i = 0; i < str.length(); i++) {
			symbol = str.charAt(i);
			if (symbol == ',') {
				n1++;
			} else if (symbol == '!') {
				n2++;
			} else if (symbol == ';') {
				n3++;
			}

			sum = n1 + n2 + n3;
		}

		System.out.println("Содержит: " + " ,= " + n1 + " != " + n2 + " ; = "
				+ n3 + ". Итого: " + sum);

	}
}
