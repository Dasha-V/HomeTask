package Lesson2;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

@SuppressWarnings("unused")
public class Task4 {

	public static void main(String[] args) {
		// �������� ���������, ��� ������������ ������ ����� ����� �������������
		// �����. � ��������� ��������� ��� ����� �� 1 �� ����������
		// ������������� �����.
		int counter = 0;
		Scanner sc = new Scanner(System.in); // ������ ������ ������ Scanner
		int enterNum;
		System.out.print("������� ����� �����: ");
		if (sc.hasNextInt()) { // ���������� ������� ���� � ������ ����� �����
								// ������� ����� �����
			enterNum = sc.nextInt(); // ��������� ����� ����� � ������ ����� �
										// ��������� � ����������

			
			int array[] = new int[enterNum]; // ������ ������ � ������� ������
												// ��������� �����
			for (int i = 0; i < enterNum; i++) { // ��������� ������

				array[i] = i + 1;

			}

			int sum = 0;
			// ���� ��� ������ ������� �������� �������
			for (int num : array) {
				// ������������ ������� �������� �������
				sum = sum + num;
			}

			System.out.println(sum);

		}

	}

}
