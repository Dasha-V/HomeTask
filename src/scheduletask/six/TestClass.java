package scheduletask.six;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите час отправления: ");
		int startTimeinHours = sc.nextInt();
		System.out.println("Введите минута отправления: ");
		int startTimeinMinutes = sc.nextInt();
		System.out.println("Введите количество станций: ");
		int numOfStation = sc.nextInt();
		int array[] = new int[numOfStation - 1];
		for (int i = 0; i < numOfStation - 1; i++) {
			System.out.println("Введите время до следущей станции: ");
			array[i] = sc.nextInt();
		}

		TransportSchedule transportSchedule = new TransportSchedule(
				new ConverterMillis(), new TimeClass());
		transportSchedule.toDoSchedule(startTimeinHours, startTimeinMinutes,
				numOfStation, array);

		sc.close();

	}

}
