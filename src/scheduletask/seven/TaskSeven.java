package scheduletask.seven;

import java.util.Scanner;

public class TaskSeven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out
				.println("Давай напишем сколько продуктов есть в холодильнике");
		int productsQuantity = scanner.nextInt();
		System.out.println("А теперь кол-во продуктов в каждом из блюд.");
		int mealsQuantity = scanner.nextInt();

		int meals = factorial(productsQuantity)
				/ ((factorial(productsQuantity - mealsQuantity) * factorial(mealsQuantity)));

		System.out.println(meals + " блюда"
				+ " + и можно приготовить и съесть всё продукты сразу :)");
		scanner.close();
	}

	private static int factorial(int a) {
		if (a == 0 || a == 1)
			return 1;
		else {
			int fact = 1;
			for (int i = 2; i <= a; i++) {
				fact *= i;
			}
			return fact;
		}
	}

}
