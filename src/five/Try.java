package five;

public class Try {

	public static void main(String[] args) {
		int arr[][] = { { 0, 1, 1 }, 
				        { 0, -1, -1 },
				       { 1, -1, -1 } };
		
		

		if (arr[0][0] == 1 && arr[0][1] == 1 && arr[0][2] == 1) {
			System.out.println("победили крестики");
		}
		if (arr[1][0] == 1 && arr[1][1] == 1 && arr[1][2] == 1) {
			System.out.println("победили крестики");
		}
		if (arr[2][0] == 1 && arr[2][1] == 1 && arr[2][2] == 1) {
			System.out.println("победили крестики");
		}
		if (arr[0][0] == 0 && arr[0][1] == 0 && arr[0][2] == 0) {
			System.out.println("победили нолики");
		}
		if (arr[1][0] == 0 && arr[1][1] == 0 && arr[1][2] == 0) {
			System.out.println("победили нолики");
		}
		if (arr[2][0] == 0 && arr[2][1] == 0 && arr[2][2] == 0) {
			System.out.println("победили нолики");
		}
		if (arr[0][0] == 0 && arr[1][1] == 0 && arr[2][2] == 0) {
			System.out.println("победили нолики");
		}
		if (arr[0][2] == 0 && arr[1][1] == 0 && arr[2][0] == 0) {
			System.out.println("победили нолики");
		}
		if (arr[0][0] == 1 && arr[1][1] == 1 && arr[2][2] == 1) {
			System.out.println("победили крестики");
		}
		if (arr[0][2] == 1 && arr[1][1] == 1 && arr[2][0] == 1) {
			System.out.println("победили крестики");

		}else {System.out.println("ничья");}

	}
}
