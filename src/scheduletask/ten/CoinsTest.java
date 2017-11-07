package scheduletask.ten;

import java.util.Scanner;

public class CoinsTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество монет: ");
		int numOfCoints = sc.nextInt();
		int coins[] = new int[numOfCoints];
		for (int i = 0; i < coins.length; i++) {
			System.out.println("Введите \"Орёл\":1 или \"Решка\":2.");
			coins[i] = sc.nextInt();
		}
		Coin coin = new Coin(coins);
		coin.toCalculate();
		sc.close();

	}

}
