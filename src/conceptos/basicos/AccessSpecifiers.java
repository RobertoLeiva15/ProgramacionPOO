package conceptos.basicos;

public class AccessSpecifiers {

    public static void main(String[] args) {

        System.out.println("===== ACCESS SPECIFIERS =====");

        // EJEMPLO 1: private
        class RelojPrivado {
            private long tiempo; // nadie afuera puede cambiarlo

            public long getTiempo() { return tiempo; }
            public void setTiempo(long tiempo) { this.tiempo = tiempo; }
        }

        RelojPrivado rp = new RelojPrivado();
        rp.setTiempo(5000);
        System.out.println("Tiempo privado usando get: " + rp.getTiempo());

        System.out.println("\n");

        // EJEMPLO 2: default
        class RelojDefault {
            long tiempo;
            void mostrarTiempo() { System.out.println("Tiempo default: " + tiempo); }
        }

        RelojDefault rd = new RelojDefault();
        rd.tiempo = 10000;
        rd.mostrarTiempo();

        System.out.println("\n");

        // EJEMPLO 3: protected
        class RelojProtected {
            protected long tiempo;
            void mostrarTiempo() { System.out.println("Tiempo protected: " + tiempo); }
        }

        class SmartReloj extends RelojProtected {
            long obtenerTiempoEnSegundos() { return tiempo / 1000; }
        }

        SmartReloj sr = new SmartReloj();
        sr.tiempo = 20000;
        sr.mostrarTiempo();
        System.out.println("Tiempo en segundos: " + sr.obtenerTiempoEnSegundos());

        System.out.println("\n");

        // EJEMPLO 4: public
        class RelojPublico {
            public long tiempo;
            public void mostrarTiempo() { System.out.println("Tiempo publico: " + tiempo); }
        }

        RelojPublico rpub = new RelojPublico();
        rpub.tiempo = 30000;
        rpub.mostrarTiempo();

        System.out.println("\n");

        // EJEMPLO 5: private constructor
        // usamos la clase que esta fuera de main para que funcione el constructor privado
        RelojConPrivado rpPriv = RelojConPrivado.crearReloj(40000);
        rpPriv.mostrarTiempo();

        System.out.println("\nFin de los ejemplos de ACCESS SPECIFIERS");
    }

    // clase con constructor privado, ahora esta fuera de main
    static class RelojConPrivado {
        private long tiempo; // tiempo guardado

        private RelojConPrivado(long tiempo) { // constructor privado
            this.tiempo = tiempo; // inicializa tiempo
        }

        public static RelojConPrivado crearReloj(long tiempo) {
            // metodo para crear objeto usando constructor privado
            return new RelojConPrivado(tiempo);
        }

        void mostrarTiempo() {
        }
    }
}