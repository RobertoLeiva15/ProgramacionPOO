package conceptos.basicos;

public class AbstractMain {

	public static void main(String[] args) {
		System.out.println("===== ABSTRACT CLASSES =====");

        // ejemplo 1
        // no podemos crear objetos de una clase abstracta

        System.out.println("\nejemplo 1 - clases abstractas:");

        /*
         * Esto NO funciona:
         *
         * AbstractAnimal animal = new AbstractAnimal();
         *
         * porque una clase abstracta no se puede instanciar
         */

        // ejemplo 2
        // usamos clases hijas

        System.out.println("\nejemplo 2 - animales:");

        AbstractAnimal dog = new AbstractDog();
        AbstractAnimal cat = new AbstractCat();

        dog.makeSound();
        cat.makeSound();

        // ejemplo 3
        // metodo normal heredado

        System.out.println("\nejemplo 3 - metodo heredado:");

        dog.sleep();
        cat.sleep();

        // ejemplo 4
        // arreglo de objetos abstractos

        System.out.println("\nejemplo 4 - arreglo:");

        AbstractAnimal[] animals = {
                new AbstractDog(),
                new AbstractCat(),
                new AbstractBird()
        };

        for (AbstractAnimal a : animals) {

            a.makeSound();
        }

        // ejemplo 5
        // clase abstracta con vehiculos

        System.out.println("\nejemplo 5 - vehiculos:");

        AbstractVehicle car = new AbstractCar();
        AbstractVehicle motorcycle = new AbstractMotorcycle();

        car.move();
        motorcycle.move();

    }
}

// ================= CLASE ABSTRACTA ANIMAL =================

abstract class AbstractAnimal {

    // metodo abstracto
    // las clases hijas deben implementarlo

    abstract void makeSound();
    
    // metodo normal
    void sleep() {

        System.out.println("el animal esta durmiendo");
    }
}
// ================= CLASE DOG =================

class AbstractDog extends AbstractAnimal {

    @Override
    void makeSound() {

        System.out.println("el perro dice guau");
    }
}



// ================= CLASE CAT =================

class AbstractCat extends AbstractAnimal {

    @Override
    void makeSound() {

        System.out.println("el gato dice miau");
    }
}



// ================= CLASE BIRD =================

class AbstractBird extends AbstractAnimal {

    @Override
    void makeSound() {

        System.out.println("el pajaro canta");
    }
}

// ================= CLASE ABSTRACTA VEHICLE =================

abstract class AbstractVehicle {

    // metodo abstracto
    abstract void move();
}

// ================= CLASE CAR =================

class AbstractCar extends AbstractVehicle {

    @Override
    void move() {

        System.out.println("el carro se mueve en la calle");
    }
}

// ================= CLASE MOTORCYCLE =================

class AbstractMotorcycle extends AbstractVehicle {

    @Override
    void move() {

        System.out.println("la moto se mueve rapido");
    }
}