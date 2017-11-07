package scheduletask.six;

import java.util.Scanner;

public class TestClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Введите время отправления от первой станции: ");
		double startTime = sc.nextDouble();
		System.out.println("Введите количество станций: ");
		int numOfStation = sc.nextInt();
		double array[] = new double[numOfStation - 1];
		for (int i = 0; i < numOfStation - 1; i++) {
			System.out.println("Введите время до следущей станции: ");
			array[i] = sc.nextDouble();
		}

		TransportSchedule transportSchedule = new TransportSchedule(startTime,
				numOfStation, array);
		transportSchedule.toDoSchedule();
		sc.close();

	}

}
