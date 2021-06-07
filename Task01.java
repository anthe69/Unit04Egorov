package by.epam.unit04.main;

import java.util.Random;

public class Task01 {

	public static void main(String[] args) {
		// Дана последовательность натуральных чисел а1 , а2 ,..., ап. Создать массив из
		// четных чисел этой последовательности. Если таких чисел нет, то вывести
		// сообщение об этом факте.

		int cnt = 0;

		int[] ar = new int[3];
		Random rand = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt(1000);
			if (ar[i] % 2 == 0) {
				cnt++;
			}
		}

		System.out.println("Исходная последовательность чисел:");
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("[%d]", ar[i]);
		}
		System.out.println();

		if (cnt == 0) {
			System.out.println("Четных чисел не обнаружено!");
		} else {
			System.out.println("Массив из четных чисел последовательности:");
			for (int i = 0; i < ar.length; i++) {
				if (ar[i] % 2 == 0) {
					System.out.printf("[%d]", ar[i]);
				}
			}
		}
	}
}
