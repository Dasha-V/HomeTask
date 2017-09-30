package Lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Task4 {

	public static void main(String[] args) {
		// Напишите программу, где пользователь вводит любое целое положительное
		// число. А программа суммирует все числа от 1 до введенного
		// пользователем числа.
		int counter = 0;
		Scanner sc = new Scanner(System.in); // создаём объект класса Scanner
		int enterNum;
		System.out.print("Введите целое число: ");
		if (sc.hasNextInt()) { // возвращает истинну если с потока ввода можно
								// считать целое число
			enterNum = sc.nextInt(); // считывает целое число с потока ввода и
										// сохраняем в переменную

			
			int array[] = new int[enterNum]; // создаём массив с длинной равной
												// введённому числу
			for (int i = 0; i < enterNum; i++) { // заполняем массив

				array[i] = i + 1;

			}

			int sum = 0;
			// цикл для обхода каждого элемента массива
			for (int num : array) {
				// суммирование каждого элемента массива
				sum = sum + num;
			}

			System.out.println(sum);

		}

	}

}
