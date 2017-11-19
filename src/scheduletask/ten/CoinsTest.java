package scheduletask.ten;

import java.util.Scanner;

public class CoinsTest {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите количество монет: ");
		int numOfCoints = sc.nextInt();
		int coins[] = new int[numOfCoints];
		for (int i = 0; i < coins.length; i++) {
			System.out.println("Введите \"Орёл\":1 или \"Решка\":0.");
			coins[i] = sc.nextInt();
		}
		int sumOnes = 0;
		int sumZeros = 0;
		for (int i = 0; i < coins.length; i++) {
			int num = coins[i];
			if (num == 0) {
				sumZeros += 1;
			} else if (num == 1) {
				sumOnes += 1;
			}
		}
		if (sumOnes < sumZeros) {
			System.out.println(sumOnes);
		} else if (sumOnes > sumZeros) {
			System.out.println(sumZeros);
		}
		sc.close();
	}

}
