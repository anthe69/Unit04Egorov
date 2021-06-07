package by.epam.unit04.main;

import java.util.Random;

public class Task06 {

	public static void main(String[] args) {
		// Дан двухмерный массив n×m элементов. Определить, сколько раз встречается
		// число 7 среди элементов массива.

		int cnt = 0;
		int num = 7;

		int[][] mas = new int[3][4];
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(10);
			}
		}

		System.out.println("Исходная матрица:");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%d]", mas[i][j]);
				if (mas[i][j] == num) {
					cnt++;
				}
			}
			System.out.println();
		}
		System.out.println("Число " + num + " встречается " + cnt + " раз(а) среди элементов массива.");
	}
}
