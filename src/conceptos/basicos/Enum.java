package conceptos.basicos;

public class Enum {
	
	    // enum es como una lista de opciones que no cambian
	    // sirve para no equivocarse escribiendo valores

	    enum Nivel {
	        ALTO,
	        MEDIO,
	        BAJO
	    }

	    public static void main(String[] args) {

	        System.out.println("===== ENUM =====");

	        // ===== 1. USO BASICO =====
	        // creo una variable que solo puede tener esos valores

	        Nivel nivel = Nivel.ALTO;

	        System.out.println("Nivel seleccionado: " + nivel);

	        // ===== 2. USO CON IF =====
	        // comparo el valor para saber cual es

	        if (nivel == Nivel.ALTO) {
	            System.out.println("Es nivel ALTO");
	        } else if (nivel == Nivel.MEDIO) {
	            System.out.println("Es nivel MEDIO");
	        } else {
	            System.out.println("Es nivel BAJO");
	        }

	        // ===== 3. USO CON SWITCH =====
	        // otra forma de comparar (más ordenado)

	        switch (nivel) {
	            case ALTO:
	                System.out.println("Switch dice ALTO");
	                break;
	            case MEDIO:
	                System.out.println("Switch dice MEDIO");
	                break;
	            case BAJO:
	                System.out.println("Switch dice BAJO");
	                break;
	        }

	        // ===== 4. RECORRER ENUM =====
	        // muestra todos los valores que existen

	        System.out.println("\nTodos los niveles:");

	        for (Nivel n : Nivel.values()) {
	            System.out.println(n);
	        }

	        // ===== 5. TO STRING =====
	        // convierte enum a texto

	        String texto = nivel.toString();
	        System.out.println("\nConvertido a texto: " + texto);
	        
	        // ===== 6. VALUE OF =====
	        // convierte texto a enum

	        Nivel otro = Nivel.valueOf("MEDIO");
	        System.out.println("Convertido desde texto: " + otro);

	        // ===== 7. ORDINAL =====
	        // muestra la posicion (empieza en 0)

	        System.out.println("\nPosicion de ALTO: " + Nivel.ALTO.ordinal());
	        System.out.println("Posicion de MEDIO: " + Nivel.MEDIO.ordinal());

	        // ===== 8. COMPARETO =====
	        // compara posiciones

	        int comparacion = Nivel.ALTO.compareTo(Nivel.MEDIO);
	        System.out.println("\nComparar ALTO con MEDIO: " + comparacion);

	        // ===== 9. NAME =====
	        // devuelve el nombre como texto

	        System.out.println("\nNombre del enum: " + Nivel.ALTO.name());

	        // ===== 10. EJEMPLO TIPO PIZZA =====
	        // ejemplo parecido al de la pagina

	        Size pizza = Size.MEDIUM;

	        switch (pizza) {
	            case SMALL:
	                System.out.println("\nPizza pequeña");
	                break;
	            case MEDIUM:
	                System.out.println("Pizza mediana");
	                break;
	            case LARGE:
	                System.out.println("Pizza grande");
	                break;
	            case EXTRALARGE:
	                System.out.println("Pizza extra grande");
	                break;
	        }

	        // ===== 11. ERROR =====
	        // no puedo poner cualquier valor

	        // Nivel malo = Nivel.SUPER; no existe

	        System.out.println("\nNo puedo usar valores que no existen");
	    }

	    // otro enum como el ejemplo de pizza
	    enum Size {
	        SMALL,
	        MEDIUM,
	        LARGE,
	        EXTRALARGE
	    }
	}