package conceptos.basicos;

public class Basics_of_OOP {

	    public static void main(String[] args) {

	        System.out.println("===== BASICS OF POO =====");

	        // ejemplo 1: clase Persona con campos y metodo
	        // esto es una clase, un molde para crear personas
	        class Persona {
	            String nombre; // aqui guardo el nombre de la persona
	            int edad; // aqui guardo la edad de la persona

	            // metodo para mostrar los datos de la persona
	            void mostrarDatos() {
	                System.out.println("Mi nombre es: " + nombre);
	                System.out.println("Tengo " + edad + " años");
	            }
	        }

	        // aqui creo un objeto de la clase Persona
	        Persona p1 = new Persona();
	        p1.nombre = "Roberto"; // le pongo un nombre
	        p1.edad = 19; // le pongo la edad
	        p1.mostrarDatos(); // muestro los datos en pantalla

	        // creo otra persona
	        Persona p2 = new Persona();
	        p2.nombre = "Ana";
	        p2.edad = 18;
	        p2.mostrarDatos(); // muestro los datos de la segunda persona

	        System.out.println("\n");

	        // ejemplo 2: clase Animal con constructor
	        // un constructor sirve para dar datos cuando creamos el objeto
	        class Animal {
	            String especie;
	            String color;

	            // constructor que recibe datos al crear el animal
	            Animal(String especie, String color) {
	                this.especie = especie;
	                this.color = color;
	            }

	            void mostrarDatos() {
	                System.out.println("Especie: " + especie);
	                System.out.println("Color: " + color);
	            }
	        }

	        // creo objetos de Animal usando constructor
	        Animal a1 = new Animal("Perro", "Marron");
	        a1.mostrarDatos();

	        Animal a2 = new Animal("Gato", "Blanco");
	        a2.mostrarDatos();

	        System.out.println("\n");

	        // ejemplo 3: clase Coche con metodo para cambiar color
	        class Coche {
	            String marca;
	            String modelo;
	            String color;

	            // constructor para crear coche con datos
	            Coche(String marca, String modelo, String color) {
	                this.marca = marca;
	                this.modelo = modelo;
	                this.color = color;
	            }

	            // metodo para cambiar el color del coche
	            void setColor(String color) {
	                this.color = color;
	            }

	            void mostrarDatos() {
	                System.out.println("Marca: " + marca);
	                System.out.println("Modelo: " + modelo);
	                System.out.println("Color: " + color);
	            }

	            // clase anidada Motor dentro de Coche
	            class Motor {
	                int caballos;

	                Motor(int caballos) {
	                    this.caballos = caballos;
	                }

	                void mostrarMotor() {
	                    System.out.println("Motor de " + caballos + " caballos");
	                }
	            }
	        }

	        // creo un coche y muestro datos
	        Coche c1 = new Coche("Toyota", "Corolla", "Rojo");
	        c1.mostrarDatos(); // muestro el coche

	        c1.setColor("Verde"); // cambio el color del coche
	        System.out.println("Despues de cambiar color:");
	        c1.mostrarDatos(); // muestro otra vez para ver el cambio

	        // creo un motor para ese coche
	        Coche.Motor m1 = c1.new Motor(120); // motor con 120 caballos
	        m1.mostrarMotor(); // muestro los caballos del motor

	        // creo otro motor para otro coche
	        Coche c2 = new Coche("Honda", "Civic", "Azul");
	        Coche.Motor m2 = c2.new Motor(150);
	        c2.mostrarDatos(); // muestro datos del segundo coche
	        m2.mostrarMotor(); // muestro su motor

	        System.out.println("\n");

	        // ejemplo 4: puedo crear varios objetos de la misma clase
	        Persona p3 = new Persona();
	        p3.nombre = "Luis";
	        p3.edad = 25;
	        p3.mostrarDatos();

	        Persona p4 = new Persona();
	        p4.nombre = "Maria";
	        p4.edad = 22;
	        p4.mostrarDatos();

	    }
	}
