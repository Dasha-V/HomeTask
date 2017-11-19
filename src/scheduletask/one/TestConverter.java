package scheduletask.one;

import java.util.Scanner;

public class TestConverter {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Выберите \"Масса\" или \"Расстояние\"");
		String choice = sc.nextLine();
		if ("Масса".equalsIgnoreCase(choice)) {
			System.out.print("Введите единицу измерения: кг карат фунт грамм ");
		}
		if ("Расстояние".equalsIgnoreCase(choice)) {
			System.out.print("Введите единицу измерения: метр миля ярд фут ");
		}
		String condition = sc.nextLine();
		System.out.print("Введите число ");
		double x = sc.nextDouble();

		ClientConverter converter = new ClientConverter(x);
		converter.toChoseConverter(condition);
		sc.close();

	}

}
