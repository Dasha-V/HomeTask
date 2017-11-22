package scheduletask.seven;

import java.util.Scanner;

public class TaskSeven {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Сколько продуктов у студента в холодильнике? ");
		int productsQuantity = scanner.nextInt();
		if (productsQuantity == 0) {
			System.out.println("Мышь повесилась.");

		}

		int mealsQuantity = 2;
		int allMeals = 0;
		while (mealsQuantity <= productsQuantity) {

			int mealsVariant = factorial(productsQuantity)
					/ ((factorial(productsQuantity - mealsQuantity)) * factorial(mealsQuantity));
			allMeals += mealsVariant;
			mealsQuantity++;

		}

		System.out.println("Итого можно приготовить " + allMeals
				+ " варианта(ов) блюд.");
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
