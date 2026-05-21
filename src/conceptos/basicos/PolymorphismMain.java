package conceptos.basicos;
public class PolymorphismMain {

    public static void main(String[] args) {

        System.out.println("===== POLYMORPHISM =====");


        // ejemplo 1
        // aqui usamos el mismo metodo pero con animales diferentes

        PolyAnimal animal1 = new PolyDog();
        PolyAnimal animal2 = new PolyCat();

        System.out.println("\nejemplo 1 - sonidos:");

        // el mismo metodo cambia dependiendo del objeto
        animal1.makeSound();
        animal2.makeSound();



        // ejemplo 2
        // aqui usamos un arreglo de animales

        System.out.println("\nejemplo 2 - arreglo:");

        PolyAnimal[] animals = {
                new PolyDog(),
                new PolyCat(),
                new PolyBird()
        };

        // recorremos todos los animales
        for (PolyAnimal a : animals) {

            // cada objeto responde diferente
            a.makeSound();
        }



        // ejemplo 3
        // usamos instanceof para revisar el tipo

        System.out.println("\nejemplo 3 - instanceof:");

        PolyAnimal pet = new PolyDog();

        System.out.println("pet es PolyDog? " + (pet instanceof PolyDog));
        System.out.println("pet es PolyAnimal? " + (pet instanceof PolyAnimal));
        System.out.println("pet es PolyCat? " + (pet instanceof PolyCat));



        // ejemplo 4
        // aqui hacemos downcasting

        System.out.println("\nejemplo 4 - downcasting:");

        PolyAnimal animal = new PolyDog();

        // bajamos de PolyAnimal a PolyDog
        PolyDog dog = (PolyDog) animal;

        dog.run();



        // ejemplo 5
        // otro ejemplo con vehiculos

        System.out.println("\nejemplo 5 - vehiculos:");

        PolyVehicle vehicle1 = new PolyCar();
        PolyVehicle vehicle2 = new PolyMotorcycle();

        vehicle1.move();
        vehicle2.move();

    }
}



// ================= CLASE PADRE =================

// esta es la clase principal
class PolyAnimal {

    // este metodo sera cambiado por los hijos
    public void makeSound() {

        System.out.println("el animal hace un sonido");
    }
}



// ================= CLASE DOG =================

class PolyDog extends PolyAnimal {

    // override cambia el metodo del padre
    @Override
    public void makeSound() {

        System.out.println("el perro dice guau");
    }

    // metodo propio del perro
    public void run() {

        System.out.println("el perro esta corriendo");
    }
}



// ================= CLASE CAT =================

class PolyCat extends PolyAnimal {

    @Override
    public void makeSound() {

        System.out.println("el gato dice miau");
    }
}



// ================= CLASE BIRD =================

class PolyBird extends PolyAnimal {

    @Override
    public void makeSound() {

        System.out.println("el pajaro canta");
    }
}



// ================= CLASE VEHICLE =================

class PolyVehicle {

    // metodo normal
    public void move() {

        System.out.println("el vehiculo se mueve");
    }
}



// ================= CLASE CAR =================

class PolyCar extends PolyVehicle {

    // cambiamos el metodo del padre
    @Override
    public void move() {

        System.out.println("el carro se mueve en la calle");
    }
}



// ================= CLASE MOTORCYCLE =================

class PolyMotorcycle extends PolyVehicle {

    @Override
    public void move() {

        System.out.println("la moto se mueve rapido");
    }
}