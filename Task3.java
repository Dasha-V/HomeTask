package Lesson2;

public class Task3 {

	public static void main(String[] args) {
		// � ������ ������� ����� �1, �2, ... , �n �������� ������� �����������
		// � ������������ ��������.
		// 0 1 2 3 4 5
		int[] array = { 1, 4, 9, -5, 10, -6 };
		int maxV = 0;
		int minV = 0;
		int indexMaxV = 0;
		int indexMinV = 0;
		int temp;
		for (int i = 0; i < array.length; i++) {

			int currentValue = array[i];
			
			if (maxV < currentValue) {// ������� � ���������� ������������
				maxV = currentValue;// �������� ���������� maxV

			}

			if (minV > currentValue) {// ������� � ���������� ������������
				minV = currentValue; // �������� ���������� minV

			}

			if (currentValue == maxV) {
				indexMaxV = i;

			}

			if (currentValue == minV) {
				indexMinV = i;

			}
			// �������� �������

			temp = indexMinV;
			indexMinV = indexMaxV;
			indexMinV = temp;

		}

		System.out.println(maxV);
		System.out.println(minV);
		System.out.println(indexMaxV);
		System.out.println(indexMinV);

	}
}