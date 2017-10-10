package by.academy.dv.java.task4;

public class HomeTask4 {

	public static void main(String[] args) {
		int a = 4;
		int b = 2;
		int srect = a * b;
		double z = 5;
		z *= z;
		double p = 3.1415926;
		double sround = p * z;
		if (sround > srect) {
			System.out.println("Круг закрывает прямоугольник.");
		} else {
			System.out.println("Круг не смог закрыть прямоугольник");

		}

	}

}
