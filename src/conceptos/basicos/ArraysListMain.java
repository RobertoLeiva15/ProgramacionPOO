package conceptos.basicos;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ArraysListMain {

	public static void main(String[] args) {

		System.out.println("===== ARRAYS Y LIST =====");

		// ejemplo 1
		// declarar e instanciar array

		System.out.println("\nejemplo 1 - arrays:");

		int[] numbers = new int[5];

		numbers[0] = 10;
		numbers[1] = 20;
		numbers[2] = 30;
		numbers[3] = 40;
		numbers[4] = 50;

		for (int i = 0; i < numbers.length; i++) {

			System.out.println(numbers[i]);
		}

		// ejemplo 2
		// array literal y for each

		System.out.println("\nejemplo 2 - array literal:");

		String[] names = { "Juan", "Maria", "Pedro" };

		for (String n : names) {

			System.out.println(n);
		}

		// ejemplo 3
		// matriz bidimensional

		System.out.println("\nejemplo 3 - matriz:");

		int[][] matrix = {
				{ 1, 2, 3 },
				{ 4, 5, 6 }
		};

		for (int i = 0; i < matrix.length; i++) {

			for (int j = 0; j < matrix[i].length; j++) {

				System.out.print(matrix[i][j] + " ");
			}

			System.out.println();
		}

		// ejemplo 4
		// ordenar arrays

		System.out.println("\nejemplo 4 - sort:");

		int[] sortArray = { 9, 3, 7, 1, 5 };

		Arrays.sort(sortArray);

		System.out.println(Arrays.toString(sortArray));

		// ejemplo 5
		// listas

		System.out.println("\nejemplo 5 - listas:");

		List<String> students = new ArrayList<>();

		students.add("Carlos");
		students.add("Ana");
		students.add("Luis");

		System.out.println(students);

		// ejemplo 6
		// metodos de list

		System.out.println("\nejemplo 6 - metodos list:");

		students.add(1, "Maria");

		System.out.println("get: " + students.get(0));
		System.out.println("contains: " + students.contains("ana"));
		System.out.println("size: " + students.size());

		System.out.println(students);

		// ejemplo 7
		// ordenar y recorrer lista

		System.out.println("\nejemplo 7 - ordenar lista:");

		List<Integer> numbersList = new ArrayList<>();

		numbersList.add(30);
		numbersList.add(10);
		numbersList.add(20);

		Collections.sort(numbersList);

		for (Integer n : numbersList) {

			System.out.println(n);
		}
	}
}