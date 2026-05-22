package conceptos.basicos;

public class OverloadingMain {

    public static void main(String[] args) {

        System.out.println("===== OVERLOADING =====");


        // ejemplo 1
        // aqui usamos el mismo metodo add
        // pero con diferentes parametros

        OverCalculator calc = new OverCalculator();

        System.out.println("\nejemplo 1 - suma de 2 enteros:");

        calc.add(5, 10);



        // ejemplo 2
        // mismo metodo add
        // pero ahora recibe 3 numeros

        System.out.println("\nejemplo 2 - suma de 3 enteros:");

        calc.add(5, 10, 15);



        // ejemplo 3
        // mismo metodo add
        // pero con decimales

        System.out.println("\nejemplo 3 - suma decimal:");

        calc.add(5.5, 2.5);



        // ejemplo 4
        // metodo show con texto

        System.out.println("\nejemplo 4 - mostrar texto:");

        calc.show("Hola Roberto");



        // ejemplo 5
        // mismo metodo show
        // pero con numero entero

        System.out.println("\nejemplo 5 - mostrar numero:");

        calc.show(100);



        // ejemplo 6
        // multiplicacion de enteros

        System.out.println("\nejemplo 6 - multiplicacion:");

        calc.multiply(4, 5);



        // ejemplo 7
        // multiplicacion decimal

        System.out.println("\nejemplo 7 - multiplicacion decimal:");

        calc.multiply(2.5, 4.0);

    }
}



// ================= CLASE CALCULATOR =================

// aqui trabajamos la sobrecarga
class OverCalculator {



    // ================= METODOS ADD =================

    // suma de 2 enteros
    void add(int a, int b) {

        int result = a + b;

        System.out.println("la suma es: " + result);
    }



    // mismo metodo add
    // pero recibe 3 enteros
    void add(int a, int b, int c) {

        int result = a + b + c;

        System.out.println("la suma de 3 numeros es: " + result);
    }



    // mismo metodo add
    // pero con decimales
    void add(double a, double b) {

        double result = a + b;

        System.out.println("la suma decimal es: " + result);
    }



    // ================= METODOS SHOW =================

    // metodo para mostrar texto
    void show(String text) {

        System.out.println("texto recibido: " + text);
    }



    // mismo metodo show
    // pero con entero
    void show(int number) {

        System.out.println("numero recibido: " + number);
    }



    // ================= METODOS MULTIPLY =================

    // multiplicacion con enteros
    void multiply(int a, int b) {

        int result = a * b;

        System.out.println("la multiplicacion es: " + result);
    }



    // mismo metodo multiply
    // pero con decimales
    void multiply(double a, double b) {

        double result = a * b;

        System.out.println("la multiplicacion decimal es: " + result);
    }
}