package by.epam.unit04.main;

import java.util.Random;

public class Task04 {

	public static void main(String[] args) {
		// Реализовать сортировки выбором или пузырьком по убыванию.

		boolean sorted = false;
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

		while(!sorted) {
			sorted = true;
			for (int i = 0; i < ar.length - 1; i++) {
				if (ar[i] < ar[i + 1]) {
					temp = ar[i];
					ar[i] = ar[i + 1];
					ar[i + 1] = temp;
					sorted = false;
				}
			}
		}

		System.out.println("Отсортированный массив (пузырьком) по убыванию:");
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("[%d]", ar[i]);
		}
	}
}
