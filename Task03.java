package by.epam.unit04.main;

import java.util.Random;

public class Task03 {

	public static void main(String[] args) {
		// Дан массив действительных чисел, размерность которого N. Подсчитать,
		// сколько в нем отрицательных, положительных и нулевых элементов.

		int neg = 0;
		int pos = 0;
		int zero = 0;

		double[] ar = new double[3];
		Random rand = new Random();
		for (int i = 0; i < ar.length; i++) {
			ar[i] = rand.nextInt();
		}

		System.out.println("Исходный массив:");
		for (int i = 0; i < ar.length; i++) {
			System.out.printf("[%4.2f]", ar[i]);
		}
		System.out.println();

		for (int i = 0; i < ar.length; i++) {
			if (ar[i] < 0) {
				neg++;
			}
			if (ar[i] > 0) {
				pos++;
			}
			if (ar[i] == 0) {
				zero++;
			}
		}
		System.out.println("Отрицательных элементов = " + neg);
		System.out.println("Положительных элементов = " + pos);
		System.out.println("Нулевых элементов = " + zero);
	}
}
