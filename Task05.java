package by.epam.unit04.main;

import java.util.Random;

public class Task05 {

	public static void main(String[] args) {
		// Реализовать алгоритм сортировки вставками.

		int temp;

		int[] ar = new int[5];
		Random rand = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(1000);
		}

		System.out.println("Исходный массив:");
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("[%d]", ar[i]);
		}
		System.out.println();

		int i;
		for (int j = 1; j < ar.length; j++) {
			temp = ar[j];
			for (i = j; i > 0 && ar[i-1] > temp; i--) {
				ar[i] = ar[i-1];
			}
			ar[i] = temp;
		}

		System.out.println("Отсортированный массив (вставками):");
		for (int j = 0; j < ar.length; j++) {
			System.out.printf("[%d]", ar[j]);
		}
	}
}
