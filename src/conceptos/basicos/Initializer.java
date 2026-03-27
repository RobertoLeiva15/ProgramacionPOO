package conceptos.basicos;

public class Initializer {

	    // variable estatica (pertenece a la clase)
	    static int valorEstatico;

	    // variable normal (pertenece al objeto)
	    int valorNormal;

	    // ===== 1. BLOQUE ESTATICO =====
	    // se ejecuta una sola vez cuando inicia el programa
	    static {
	        System.out.println("Bloque estatico");
	        valorEstatico = 5;
	    }

	    // ===== 2. BLOQUE DE INSTANCIA =====
	    // se ejecuta cada vez que creo un objeto
	    {
	        System.out.println("Bloque de instancia");
	        valorNormal = 7;
	    }

	    // ===== 3. CONSTRUCTOR =====
	    // se ejecuta despues del bloque de instancia
	    public Initializer() {
	        System.out.println("Constructor");
	    }

	    // ===== 4. METODO MOSTRAR =====
	    // muestra los valores
	    public void mostrar() {
	        System.out.println("Valor estatico: " + valorEstatico);
	        System.out.println("Valor normal: " + valorNormal);
	    }

	    public static void main(String[] args) {

	        System.out.println("===== INITIALIZER =====");

	        // ===== 5. CREAR OBJETO 1 =====
	        // aqui se ejecuta: bloque instancia -> constructor
	        Initializer obj1 = new Initializer();
	        obj1.mostrar();

	        // ===== 6. CREAR OBJETO 2 =====
	        // vuelve a ejecutar bloque instancia y constructor
	        Initializer obj2 = new Initializer();
	        obj2.mostrar();

	        // ===== 7. ORDEN DE EJECUCION =====
	        // ejemplo simple para ver el orden

	        System.out.println("\n===== ORDEN =====");

	        new PruebaOrden();
	        new PruebaOrden();
	    }
	}


	// ===== CLASE EXTRA PARA VER EL ORDEN =====
	class PruebaOrden {

	    // se ejecuta solo una vez
	    static {
	        System.out.println("Static (una sola vez)");
	    }

	    // se ejecuta cada vez que creo objeto
	    {
	        System.out.println("Instancia (cada objeto)");
	    }

	    public PruebaOrden() {
	        System.out.println("Constructor");
	    }
	}