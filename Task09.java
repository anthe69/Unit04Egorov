package by.epam.unit04.main;

public class Task09 {

	public static void main(String[] args) {
		// Сформировать квадратную матрицу порядка n по заданному образцу(n -
		// четное):

		int n = 6;

		int[][] mas = new int[n][n];
		for (int i = 0; i < mas.length; i++) {
			mas[i][n - i - 1] = i + 1;
		}

		for (int i = 0; i < mas.length; i++) {
			for (int j = 0; j < mas[i].length; j++) {
				System.out.printf("[%2d]", mas[i][j]);
			}
			System.out.println();
		}
	}
}
