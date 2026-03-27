package conceptos.basicos;

public class Casting {

	    public static void main(String[] args) {

	        System.out.println("===== CASTING =====");

	        // CASTING significa cambiar un tipo de dato a otro
	        // como cambiar un numero a texto o a decimal


	        // ===== 1. INT A DOUBLE =====
	        // aquí tengo un numero entero (sin decimales)
	        int numero = 10;

	        // aquí lo paso a decimal (ahora tiene .0)
	        // java lo hace solo, no hay que hacer nada
	        double decimal = numero;

	        System.out.println("\nINT a DOUBLE");
	        System.out.println("Entero: " + numero);
	        System.out.println("Decimal: " + decimal);


	        // ===== 2. DOUBLE A INT =====
	        // aquí tengo un numero con decimales
	        double numDecimal = 10.99;

	        // aquí lo paso a entero (pierde los decimales)
	        // tengo que poner (int) porque si no java no deja
	        int numEntero = (int) numDecimal;

	        System.out.println("\nDOUBLE a INT");
	        System.out.println("Decimal: " + numDecimal);
	        System.out.println("Entero: " + numEntero);


	        // ===== 3. INT A STRING =====
	        // aquí convierto un numero a texto
	        int numeroTexto = 50;

	        // ahora ya no es numero, es texto
	        String texto = String.valueOf(numeroTexto);

	        System.out.println("\nINT a STRING");
	        System.out.println("Numero: " + numeroTexto);
	        System.out.println("Texto: " + texto);


	        // ===== 4. STRING A INT =====
	        // aquí tengo un numero pero como texto
	        String dato = "50";

	        // aquí lo convierto a numero otra vez
	        int numeroConvertido = Integer.parseInt(dato);

	        System.out.println("\nSTRING a INT");
	        System.out.println("Texto: " + dato);
	        System.out.println("Numero: " + numeroConvertido);


	        // ===== 5. ERROR =====
	        // si el texto no es numero da error
	        String textoMalo = "hola";

	        // esto fallaria porque "hola" no es numero
	        // int error = Integer.parseInt(textoMalo);

	        System.out.println("\nSi intento convertir 'hola' a numero da error");
	    }
	}