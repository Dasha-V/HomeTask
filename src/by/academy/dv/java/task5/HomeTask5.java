package by.academy.dv.java.task5;

public class HomeTask5 {

	public static void main(String[] args) {

		int money = 101;
		int m = money % 10;

		switch (m) {
		case 1:
			System.out.println(money + " рубль");
			break;
		case 2:
			System.out.println(money + " рубля");
			break;
		case 3:
			System.out.println(money + " рубля");
			break;
		case 4:
			System.out.println(money + " рубля");
			break;

		default:
			System.out.println(money + " рублей");
			break;

		}
	}
}