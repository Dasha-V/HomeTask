package Lesson2;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class Task5 {

	public static void main(String[] args) throws Exception {
		// ������ �� ������� � �������� �������
		// 1. ������� ������ �� 10 �������.
		// 2. ������ � ���������� 8 ������� � ��������� �� � ������.
		// 3. ������� ���������� ����� ������� (10 ���������) �� ����� �
		// �������� �������. ������ ������� - � ����� ������.

		String[] array = new String[10];
		BufferedReader reader = new BufferedReader(new InputStreamReader(
				System.in));

		// � ���� ������ ��������� ������ ������ BufferedReader, � ������ ��
		// ���� ������ ������������� ���������� br. ����� �������, ���� ���
		// ����������, � ��� ���� ������ � ���������� �������. � ����� �������,
		// � ������� ������ BufferedReader ���� ����� readLine() - �� ��� �����
		// �� ������������. �������, ����� ��������� �����-�� ������ �� �������,
		// ��� ���� ������� ����� readLine() � ���������� ���� �������:

		for (int i = 0; i < 8; i++) {

			array[i] = reader.readLine();
			// BufferedReader ���������� ����
			// ����������� ����� readLine(),
			// ������� ��������� ��������� ��
			// ������ ���������.
			
		}

		for (int i = array.length - 1; i >= 0; i--) {
			System.out.println(array[i]);
		}
	}
}