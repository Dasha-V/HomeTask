package Lesson2;

import java.lang.reflect.Array;
import java.util.Random;

public class Task6 {

	public static void main(String[] args) {
		// 1. ��������� ��������� ������ (10X15) ���������� ������� �� 0 �� 15
		// 2. �������� �������� ������ ����� 9 � ������ �������
		// 3. ��� ���������� ����� ��������� ������ ���������� ������ � �������
		// � ������� ������� ������ �������, ���������� ������ �����

		// ������� � �������������� ��������� ������

		int[][] arrayd2 = new int[10][15];
		int num = arrayd2[0][0];
		int x = 0;
		int y = 0;
		
		boolean numIsNotFound = false;

		Random rand = new Random();
		for (int i = 0; i < 10; i++)
			for (int j = 0; j < 15; j++)
				arrayd2[i][j] = rand.nextInt(10);
		for (int i = 0; i < 10; i++) {
			for (int j = 0; j < 15; j++)

				System.out.print(arrayd2[i][j] + " ");
			System.out.println();
		}
      
		for (int i = 0; i < arrayd2.length; i++) {
			for (int j = 0; j < arrayd2[i].length; j++) {

				if (arrayd2[i][j] == 9) {

					num = arrayd2[i][j];
					x = i;
					y = j;
					break;
				}

				boolean numIsFound = num == 9;

				if (numIsFound == numIsNotFound) {//��� �� ��������� 7?
				
				} else
					numIsNotFound = true;

			}

		}

		System.out.println("������� ����� " + num + " index i: " + x + " j "
				+ y);
	}
}
