package conceptos.basicos;

public class Packages {
	// Este código muestra ejemplos de paquetes en Java
	// y cómo podemos obtener información de ellos de manera simple.

	    public static void main(String[] args) {
	        System.out.println("===== PACKAGES =====\n");

	        // Ejemplo 1: obtener un paquete específico
	        // buscamos el paquete donde está la clase String
	        Package paqueteString = Package.getPackage("java.lang");
	        if (paqueteString != null) {
	            System.out.println("Nombre del paquete: " + paqueteString.getName());
	            System.out.println("Título de la especificación: " + paqueteString.getSpecificationTitle());
	            System.out.println("Versión de la especificación: " + paqueteString.getSpecificationVersion());
	            System.out.println("Proveedor de la especificación: " + paqueteString.getSpecificationVendor());
	            System.out.println("Título de implementación: " + paqueteString.getImplementationTitle());
	            System.out.println("Versión de implementación: " + paqueteString.getImplementationVersion());
	            System.out.println("Proveedor de implementación: " + paqueteString.getImplementationVendor());
	            System.out.println("Está sellado: " + paqueteString.isSealed());
	            System.out.println();
	        } else {
	            System.out.println("No se encontró el paquete java.lang");
	        }

	        // Ejemplo 2: obtener todos los paquetes cargados
	        // esto nos da un arreglo de todos los paquetes que la JVM conoce
	        Package[] todosPaquetes = Package.getPackages();
	        System.out.println("Cantidad de paquetes cargados: " + todosPaquetes.length);
	        System.out.println("Algunos nombres de paquetes:");
	        for (int i = 0; i < Math.min(5, todosPaquetes.length); i++) {
	            System.out.println("- " + todosPaquetes[i].getName());
	        }
	        System.out.println();

	        // Ejemplo 3: usar hashCode y toString de un paquete
	        // hashCode nos da un número único basado en el nombre del paquete
	        // toString nos da el nombre del paquete en forma de texto
	        if (paqueteString != null) {
	            System.out.println("HashCode del paquete java.lang: " + paqueteString.hashCode());
	            System.out.println("toString del paquete java.lang: " + paqueteString.toString());
	            System.out.println();
	        }

	        // Ejemplo 4: checar compatibilidad de versión
	        // podemos ver si el paquete es compatible con una versión deseada
	        try {
	            if (paqueteString != null) {
	                String versionDeseada = "1.8";
	                boolean compatible = paqueteString.isCompatibleWith(versionDeseada);
	                System.out.println("¿java.lang es compatible con " + versionDeseada + "? " + compatible);
	            }
	        } catch (NumberFormatException e) {
	            System.out.println("Error: la versión tiene formato incorrecto");
	        }
	        System.out.println();

	        // Ejemplo 5: trabajar con anotaciones del paquete
	        // un paquete puede tener anotaciones, si no tiene, nos devuelve null o array vacío
	        if (paqueteString != null) {
	            System.out.println("¿Tiene anotaciones? " + (paqueteString.getAnnotations().length > 0));
	            System.out.println("Anotaciones declaradas: " + paqueteString.getDeclaredAnnotations().length);
	        }
	    }
	}