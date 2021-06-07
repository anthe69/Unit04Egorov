package by.epam.unit04.main;

import java.util.Random;

public class Task02 {

	public static void main(String[] args) {
		// Дана последовательность чисел а1 ,а2 ,..., ап. Указать наименьшую длину
		// числовой оси, содержащую все эти числа.

		int min;
		int max;

		int[] ar = new int[3];
		Random rand = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(1000);
		}

		System.out.println("Исходная последовательность чисел:");
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("[%d]", ar[i]);
		}
		System.out.println();

		min = ar[0];
		max = ar[0];
		for (int i = 1; i < ar.length; i++) {
			if (ar[i] < min) {
				min = ar[i];
			}
			if (ar[i] > max) {
				max = ar[i];
			}
		}
		System.out.println("Наименьшая длина числовой оси = " + (max - min));
	}
}
