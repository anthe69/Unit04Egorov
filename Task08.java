package by.epam.unit04.main;

import java.util.Random;

public class Task08 {

	public static void main(String[] args) {
		// Дана матрица. Вывести k-ю строку и p-й столбец матрицы.

		int k = 2; // Считаем что первая строка = 0 (нулевая)
		int p = 0; // Считаем что первый столбец = 0 (нулевой)

		int[][] mas = new int[3][4];
		Random rand = new Random();
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				mas[i][j] = rand.nextInt(1000);
			}
		}

		System.out.println("Исходная матрица:");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%3d]", mas[i][j]);
			}
			System.out.println();
		}

		System.out.println(k + "-я строка матрицы:");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (i == k) {
					System.out.printf("[%3d]", mas[i][j]);
				}
			}
		}
		System.out.println();

		System.out.println(p + "-й столбец матрицы:");
		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				if (j == p) {
					System.out.printf("[%3d]", mas[i][j]);
				}
			}
		}
	}
}
