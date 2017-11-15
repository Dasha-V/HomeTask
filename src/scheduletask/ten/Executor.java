package scheduletask.ten;

public class Executor {

	public void toExecute(int[] coins) {

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

	}

}
