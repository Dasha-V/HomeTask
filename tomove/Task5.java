package Lesson2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task5 {

	public static void main(String[] args) throws Exception {
		// Массив из строчек в обратном порядке
		// 1. Создать массив на 10 строчек.
		// 2. Ввести с клавиатуры 8 строчек и сохранить их в массив.
		// 3. Вывести содержимое всего массива (10 элементов) на экран в
		// обратном порядке. Каждый элемент - с новой строки.

		String[] array = new String[10];
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		// В этой строке создается объект класса BufferedReader, и ссылка на
		// этот объект присваивается переменной br. Таким образом, имея эту
		// переменную, у нас есть доступ к созданному объекту. В числе прочего,
		// у объекта класса BufferedReader есть метод readLine() - мы это знаем
		// из документации. Поэтому, чтобы прочитать какую-то строку из консоли,
		// нам надо вызвать метод readLine() у созданного нами объекта:

		for (int i = 0; i < 8; i++) {

			array[i] = reader.readLine();
			// BufferedReader определяет свой
			// собственный метод readLine(),
			// который позволяет считывать из
			// потока построчно.
			
		}

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}
}