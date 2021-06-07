package by.epam.unit04.main;

import java.util.Random;

public class Task07 {

	public static void main(String[] args) {
		// Дана квадратная матрица. Вывести на экран элементы, стоящие на
		// диагонали.

		int[][] mas = new int[4][4];
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
		
		System.out.println("Элементы, стоящие на диагонали матрицы:");
		for (int i = 0; i < mas.length; i++) {
			System.out.printf("[%3d]", mas[i][i]);
		}
	}
}
