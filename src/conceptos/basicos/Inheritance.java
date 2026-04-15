package conceptos.basicos;

public class Inheritance {

	    public static void main(String[] args) {

	        System.out.println("===== HERENCIA =====");

	        // ejemplo 1
	        // aqui creamos un objeto de Car (subclase)
	        Car car = new Car();
	        car.setLicensePlate("P123ABC"); // usamos metodo heredado
	        car.setSeats(5);

	        System.out.println("\nejemplo 1 - herencia basica:");
	        System.out.println("Placa: " + car.getLicensePlate());
	        System.out.println("Asientos: " + car.getSeats());

	        // ejemplo 2
	        // aqui vemos el upcasting (sube de hijo a padre)
	        Vehicle v = car; // Car es un Vehicle tambien

	        System.out.println("\nejemplo 2 - upcasting:");
	        System.out.println("Placa desde Vehicle: " + v.getLicensePlate());

	        // ejemplo 3
	        // downcasting (bajar de padre a hijo)
	        Car car2 = (Car) v;

	        System.out.println("\nejemplo 3 - downcasting:");
	        System.out.println("Asientos desde Car: " + car2.getSeats());

	        // ejemplo 4
	        // uso de instanceof (pregunta: es de este tipo?)
	        System.out.println("\nejemplo 4 - instanceof:");
	        System.out.println("es car un Car? " + (car instanceof Car));
	        System.out.println("es car un Vehicle? " + (car instanceof Vehicle));

	        // ejemplo 5
	        // sobrescritura de metodo (override)
	        SportCar sc = new SportCar();
	        sc.setLicensePlate("X999ZZZ");

	        System.out.println("\nejemplo 5 - override:");
	        sc.setLicensePlate("X999ZZZ"); // este metodo fue cambiado

	        // ejemplo 6
	        // ejemplo tipo Animal y Cat (como roadmap)
	        Cat cat = new Cat(false, "milk", 4, "black");

	        System.out.println("\nejemplo 6 - Animal y Cat:");
	        System.out.println("Es vegetariano? " + cat.isVegetarian());
	        System.out.println("Come: " + cat.getEats());
	        System.out.println("Patas: " + cat.getNoOfLegs());
	        System.out.println("Color: " + cat.getColor());

	        System.out.println("\nfin de ejemplos de HERENCIA");
	    }
	}

	// ================= SUPERCLASE =================
	class Vehicle {

	    // este atributo es protected (los hijos lo pueden usar)
	    protected String licensePlate;

	    // metodo para guardar la placa
	    public void setLicensePlate(String plate) {
	        this.licensePlate = plate;
	    }

	    // metodo para obtener la placa
	    public String getLicensePlate() {
	        return licensePlate;
	    }
	}

	// ================= SUBCLASE =================
	class Car extends Vehicle {

	    private int seats;

	    // metodo para guardar asientos
	    public void setSeats(int seats) {
	        this.seats = seats;
	    }

	    // metodo para obtener asientos
	    public int getSeats() {
	        return seats;
	    }
	}

	// ================= SUBCLASE CON OVERRIDE =================
	class SportCar extends Vehicle {

	    // aqui cambiamos el comportamiento del metodo
	    @Override
	    public void setLicensePlate(String plate) {
	        // usamos super para llamar al metodo del padre
	        super.setLicensePlate(plate.toLowerCase());

	        // comentario simple:
	        // aqui convertimos la placa a minusculas
	        System.out.println("placa guardada en minusculas");
	    }
	}

	// ================= EJEMPLO ANIMAL =================
	class Animal {

	    private boolean vegetarian;
	    private String eats;
	    private int noOfLegs;

	    // constructor
	    public Animal(boolean veg, String food, int legs) {
	        this.vegetarian = veg;
	        this.eats = food;
	        this.noOfLegs = legs;
	    }

	    public boolean isVegetarian() {
	        return vegetarian;
	    }

	    public String getEats() {
	        return eats;
	    }

	    public int getNoOfLegs() {
	        return noOfLegs;
	    }
	}

	// ================= SUBCLASE CAT =================
	class Cat extends Animal {

	    private String color;

	    // constructor usando super (muy importante)
	    public Cat(boolean veg, String food, int legs, String color) {
	        super(veg, food, legs); // llama al constructor del padre
	        this.color = color;
	    }

	    public String getColor() {
	        return color;
	    }
	}