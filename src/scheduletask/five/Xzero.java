package scheduletask.five;

public class Xzero {

	public static void main(String[] args) {
		int xZero[][] = { { 0, 0, 1 }, { 0, 1, -1 }, { 1, -1, -1 } };
		for (int i = 0; i < xZero.length; i++) {
			for (int j = 0; j < xZero[i].length; j++) {
				System.out.print(xZero[i][j]);
			}
			System.out.println();
		}

		if (xZero[0][0] == 1 && xZero[0][1] == 1 && xZero[0][2] == 1) {
			System.out.println("победили крестики");
		}
		if (xZero[1][0] == 1 && xZero[1][1] == 1 && xZero[1][2] == 1) {
			System.out.println("победили крестики");
		}
		if (xZero[2][0] == 1 && xZero[2][1] == 1 && xZero[2][2] == 1) {
			System.out.println("победили крестики");
		}
		if (xZero[0][0] == 0 && xZero[0][1] == 0 && xZero[0][2] == 0) {
			System.out.println("победили нолики");
		}
		if (xZero[1][0] == 0 && xZero[1][1] == 0 && xZero[1][2] == 0) {
			System.out.println("победили нолики");
		}
		if (xZero[2][0] == 0 && xZero[2][1] == 0 && xZero[2][2] == 0) {
			System.out.println("победили нолики");
		}
		if (xZero[0][0] == 0 && xZero[1][1] == 0 && xZero[2][2] == 0) {
			System.out.println("победили нолики");
		}
		if (xZero[0][2] == 0 && xZero[1][1] == 0 && xZero[2][0] == 0) {
			System.out.println("победили нолики");
		}
		if (xZero[0][0] == 1 && xZero[1][1] == 1 && xZero[2][2] == 1) {
			System.out.println("победили крестики");
		}
		if (xZero[0][2] == 1 && xZero[1][1] == 1 && xZero[2][0] == 1) {
			System.out.println("победили крестики");

		} else {
			System.out.println("ничья");
		}

	}
}
