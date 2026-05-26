package conceptos.basicos;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class PersistenceMain {

	public static void main(String[] args) {

		System.out.println("===== PERSISTENCIA =====");

		// ejemplo 1
		// escribir archivo

		System.out.println("\nejemplo 1 - escribir:");

		try {

			FileWriter writer = new FileWriter("students.txt");

			writer.write("Carlos\n");
			writer.write("Maria\n");
			writer.write("Luis\n");

			writer.close();

			System.out.println("archivo creado");

		} catch (IOException e) {

			System.out.println("error al escribir");
		}

		// ejemplo 2
		// leer archivo

		System.out.println("\nejemplo 2 - leer:");

		try {

			BufferedReader reader =
					new BufferedReader(new FileReader("students.txt"));

			String line;

			while ((line = reader.readLine()) != null) {

				System.out.println(line);
			}

			reader.close();

		} catch (IOException e) {

			System.out.println("error al leer");
		}

		// ejemplo 3
		// agregar contenido

		System.out.println("\nejemplo 3 - agregar:");

		try {

			FileWriter writer =
					new FileWriter("students.txt", true);

			writer.write("Ana\n");

			writer.close();

			System.out.println("dato agregado");

		} catch (IOException e) {

			System.out.println("error");
		}

		// ejemplo 4
		// leer nuevamente

		System.out.println("\nejemplo 4 - leer actualizado:");

		try {

			BufferedReader reader =
					new BufferedReader(new FileReader("students.txt"));

			String line;

			while ((line = reader.readLine()) != null) {

				System.out.println(line);
			}

			reader.close();

		} catch (IOException e) {

			System.out.println("error");
		}

		// ejemplo 5
		// escribir numeros

		System.out.println("\nejemplo 5 - numeros:");

		try {

			FileWriter writer =
					new FileWriter("numbers.txt");

			for (int i = 1; i <= 5; i++) {

				writer.write(i + "\n");
			}

			writer.close();

			System.out.println("numeros guardados");

		} catch (IOException e) {

			System.out.println("error");
		}

		// ejemplo 6
		// leer numeros

		System.out.println("\nejemplo 6 - leer numeros:");

		try {

			BufferedReader reader =
					new BufferedReader(new FileReader("numbers.txt"));

			String line;

			while ((line = reader.readLine()) != null) {

				System.out.println(line);
			}

			reader.close();

		} catch (IOException e) {

			System.out.println("error");
		}

		// ejemplo 7
		// mensaje final

		System.out.println("\nejemplo 7 - final:");

		System.out.println("persistencia finalizada");
	}
}