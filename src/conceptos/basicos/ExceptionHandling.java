package conceptos.basicos;

public class ExceptionHandling {
	// Este es un ejemplo completo de Exception Handling en Java
	// Todos los comentarios están explicados de manera simple para entender

	    public static void main(String[] args) {
	        System.out.println("===== EXCEPTION HANDLING =====\n");

	        // EJEMPLO 1: DIVISION SIMPLE
	        System.out.println("Ejemplo 1: Division con try y catch");

	        try {
	            int a = 10;
	            int b = 0; // dividir por 0 da error
	            int resultado = a / b; // aqui se genera un error
	            System.out.println("Resultado: " + resultado); // esto no se ejecuta si hay error
	        } catch (ArithmeticException e) {
	            // atrapamos el error de division por cero
	            System.out.println("Error: No se puede dividir por cero");
	            System.out.println("Mensaje del error: " + e.getMessage());
	        }

	        System.out.println("\n");

	        // EJEMPLO 2: MULTIPLES CATCH
	        System.out.println("Ejemplo 2: Multiple catch");

	        try {
	            String texto = null;
	            System.out.println(texto.length()); // esto genera NullPointerException
	        } catch (NullPointerException e) {
	            System.out.println("Error: El texto es nulo");
	        } catch (Exception e) {
	            // aqui atrapamos cualquier otro error
	            System.out.println("Ups! Ocurrió otro error inesperado");
	        }

	        System.out.println("\n");

	        // EJEMPLO 3: FINALLY
	        System.out.println("Ejemplo 3: Finally");

	        try {
	            int[] numeros = {1, 2, 3};
	            System.out.println(numeros[5]); // error: indice fuera de rango
	        } catch (Exception e) {
	            System.out.println("Error: indice fuera del arreglo");
	        } finally {
	            // finally siempre se ejecuta aunque haya error
	            System.out.println("Este bloque finally siempre se ejecuta");
	        }

	        System.out.println("\n");

	        // EJEMPLO 4: THROWS Y THROW
	        System.out.println("Ejemplo 4: throws y throw");

	        try {
	            revisarEdad(15); // este metodo puede lanzar error
	        } catch (Exception e) {
	            System.out.println("Error desde el metodo revisarEdad: " + e.getMessage());
	        }

	        System.out.println("\n");

	        // EJEMPLO 5: EXCEPCION PERSONALIZADA
	        System.out.println("Ejemplo 5: Excepcion personalizada");

	        try {
	            lanzarMiError();
	        } catch (MiExcepcion e) {
	            System.out.println("Atrapamos nuestra excepcion personalizada: " + e.getMessage());
	        }

	        System.out.println("\n");

	        // EJEMPLO 6: INPUT ERRONEO
	        System.out.println("Ejemplo 6: Manejar errores de input");

	        try {
	            String numero = "abc"; // esto no se puede convertir a entero
	            int valor = Integer.parseInt(numero); // NumberFormatException
	            System.out.println("Numero convertido: " + valor);
	        } catch (NumberFormatException e) {
	            System.out.println("Error: No se puede convertir eso a numero");
	        }

	        System.out.println("\n");

	        // EJEMPLO 7: MULTIPLES EXCEPCIONES EN UN SOLO TRY
	        System.out.println("Ejemplo 7: Varias excepciones juntas");

	        try {
	            int[] arreglo = {1, 2, 3};
	            System.out.println(arreglo[5]); // ArrayIndexOutOfBoundsException
	            String texto = null;
	            System.out.println(texto.length()); // NullPointerException (no llega si ocurre arriba)
	        } catch (ArrayIndexOutOfBoundsException e) {
	            System.out.println("Error: indice del arreglo fuera de rango");
	        } catch (NullPointerException e) {
	            System.out.println("Error: el texto es nulo");
	        }

	        System.out.println("\n");

	        // EJEMPLO 8: TRY CON RECURSOS (para aprender a cerrar cosas)
	        System.out.println("Ejemplo 8: Try con recursos (simulando archivo)");

	        try (MiRecurso recurso = new MiRecurso()) {
	            recurso.usarRecurso();
	        } catch (Exception e) {
	            System.out.println("Error usando el recurso: " + e.getMessage());
	        }

	        System.out.println("\nFin de los ejemplos de Exception Handling completo");
	    }

	    // Metodo que puede lanzar una excepcion si la edad es menor de 18
	    static void revisarEdad(int edad) throws Exception {
	        if (edad < 18) {
	            throw new Exception("La edad debe ser mayor o igual a 18");
	        } else {
	            System.out.println("Edad valida: " + edad);
	        }
	    }

	    // Clase para excepcion personalizada
	    static class MiExcepcion extends Exception {
	        public MiExcepcion(String mensaje) {
	            super(mensaje);
	        }
	    }

	    static void lanzarMiError() throws MiExcepcion {
	        throw new MiExcepcion("Error especial creado por mi");
	    }

	    // Clase para ejemplo de try con recursos
	    static class MiRecurso implements AutoCloseable {
	        public void usarRecurso() throws Exception {
	            System.out.println("Usando el recurso...");
	            // aqui podriamos simular un error si queremos
	        }

	        @Override
	        public void close() throws Exception {
	            System.out.println("Cerrando el recurso automaticamente");
	        }
	    }
	}