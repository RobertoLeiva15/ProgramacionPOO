package conceptos.basicos;

public class PassByValue_Reference {

	    // ===== PASS BY VALUE / PASS BY REFERENCE =====
	    // En Java todo se pasa por valor
	    // eso significa que cuando mando datos a un metodo
	    // en realidad estoy mandando una copia y no el original
	    // es como prestar una copia de algo, no el original

	    public static void main(String[] args) {

	        System.out.println("===== PASS BY VALUE / REFERENCE =====");

	        // ===== 1. PRIMITIVOS =====
	        // aqui uso numeros (int)
	        // los numeros no cambian afuera del metodo

	        int x = 1;
	        int y = 2;

	        System.out.println("\nPRIMITIVOS");
	        System.out.println("Antes: x=" + x + " y=" + y);

	        cambiarPrimitivos(x, y);

	        System.out.println("Despues: x=" + x + " y=" + y);

	        // explicacion:
	        // aunque dentro del metodo cambie los valores
	        // afuera siguen igual porque solo se cambio la copia


	        // ===== 2. OBJETOS =====
	        // aqui uso un objeto
	        // los objetos si pueden cambiar por dentro

	        Persona p = new Persona("Roberto");

	        System.out.println("\nOBJETOS");
	        System.out.println("Antes: " + p.nombre);

	        cambiarObjeto(p);

	        System.out.println("Despues: " + p.nombre);

	        // explicacion:
	        // aqui si cambia porque estoy modificando el contenido del objeto


	        // ===== 3. CAMBIAR REFERENCIA =====
	        // intento cambiar todo el objeto

	        Persona p2 = new Persona("Carlos");

	        System.out.println("\nCAMBIAR REFERENCIA");
	        System.out.println("Antes: " + p2.nombre);

	        cambiarReferencia(p2);

	        System.out.println("Despues: " + p2.nombre);

	        // explicacion:
	        // aunque cree otro objeto dentro del metodo
	        // afuera sigue igual porque solo cambie la copia de la referencia


	        // ===== 4. STRING =====
	        // los string no cambian

	        String texto = "Hola";

	        System.out.println("\nSTRING");
	        System.out.println("Antes: " + texto);

	        cambiarString(texto);

	        System.out.println("Despues: " + texto);

	        // explicacion:
	        // string es como un texto fijo
	        // no cambia aunque lo modifique dentro del metodo


	        // ===== 5. OBJETO ESTUDIANTE =====

	        Estudiante e = new Estudiante(10, "Luis");

	        System.out.println("\nESTUDIANTE");
	        System.out.println("Antes: " + e);

	        cambiarEstudiante(e);

	        System.out.println("Despues: " + e);

	        // explicacion:
	        // si cambio los datos internos del objeto
	        // si se ve el cambio afuera


	        // ===== 6. NUEVO OBJETO =====

	        Estudiante e2 = new Estudiante(20, "Ana");

	        System.out.println("\nNUEVO OBJETO");
	        System.out.println("Antes: " + e2);

	        cambiarObjetoCompleto(e2);

	        System.out.println("Despues: " + e2);

	        // explicacion:
	        // crear un nuevo objeto dentro del metodo
	        // no cambia el objeto original
	    }


	    // ===== METODOS =====

	    public static void cambiarPrimitivos(int a, int b) {
	        // aqui solo cambio la copia
	        a = 5;
	        b = 10;
	    }

	    public static void cambiarObjeto(Persona p) {
	        // cambio el contenido del objeto
	        p.nombre = "Pedro";
	    }

	    public static void cambiarReferencia(Persona p) {
	        // creo un objeto nuevo pero no afecta afuera
	        p = new Persona("Maria");
	    }

	    public static void cambiarString(String s) {
	        // intento cambiar texto
	        s = "Adios";
	    }

	    public static void cambiarEstudiante(Estudiante e) {
	        // cambio datos internos
	        e.nombre = "Cambiado";
	    }

	    public static void cambiarObjetoCompleto(Estudiante e) {
	        // creo otro objeto pero no cambia el original
	        e = new Estudiante(99, "Nuevo");
	    }
	}


	// ===== CLASE PERSONA =====
	class Persona {
	    String nombre;

	    public Persona(String nombre) {
	        this.nombre = nombre;
	    }
	}


	// ===== CLASE ESTUDIANTE =====
	class Estudiante {
	    int id;
	    String nombre;

	    public Estudiante(int id, String nombre) {
	        this.id = id;
	        this.nombre = nombre;
	    }

	    public String toString() {
	        return "ID: " + id + " Nombre: " + nombre;
	    }
	}