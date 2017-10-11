package by.academy.dv.java.task23;

public class Atm {

	private int moneynom20 = 20;
	private int moneynom50 = 50;
	private int moneynom100 = 100;

	public void add20(int q) {
		moneynom20 += q;

	}

	public void add50(int q) {
		moneynom50 += q;

	}

	public void add100(int q) {
		moneynom100 += q;

	}

	public void doTransaction(int sum) {

		int tempSum = 0;

		if (sum > moneynom100 || sum == moneynom100) {
			tempSum = sum % 100;
			sum = tempSum;

		}
		if (sum > moneynom50 || sum == moneynom50) {
			tempSum = sum % 50;
			sum = tempSum;

		}
		if (sum > moneynom20 || sum == moneynom20) {
			tempSum = sum % 20;
			sum = tempSum;

		}

		if (tempSum == 0) {
			System.out.println("Заберите Ваши деньги");

		} else
			System.out.println("введите корректную сумму");

	}

}
