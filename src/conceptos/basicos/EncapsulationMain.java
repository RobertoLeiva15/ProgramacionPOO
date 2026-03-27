package conceptos.basicos;

public class EncapsulationMain {
	// Clase principal donde vamos a poner todos los ejemplos de Encapsulation

	    public static void main(String[] args) {
	        // Esta línea nos dice que los ejemplos que vienen son de Encapsulation
	        System.out.println("==== ENCPSULATION ====\n");

	        // Ejemplo 1: Clase EncapTest con getters y setters
	        // Creamos un objeto de EncapTest y usamos métodos para acceder a sus variables privadas
	        EncapTest encap = new EncapTest();
	        encap.setName("James");  // Le damos un nombre usando setter
	        encap.setAge(20);        // Le damos edad usando setter
	        encap.setIdNum("12343ms");// Le damos un ID usando setter

	        // Imprimimos los valores usando getters
	        System.out.println("Ejemplo 1 - EncapTest:");
	        System.out.println("Name : " + encap.getName() + " Age : " + encap.getAge() + " ID : " + encap.getIdNum() + "\n");

	        // Ejemplo 2: Clase Person de solo lectura 
	        // Solo podemos leer los valores, no modificarlos porque no tiene setters
	        PersonReadOnly person1 = new PersonReadOnly();
	        System.out.println("Ejemplo 2 - PersonReadOnly (solo lectura):");
	        System.out.println("Name of the person is: " + person1.getName());
	        System.out.println("Age of the person is: " + person1.getAge() + "\n");

	        // Ejemplo 3: Clase Person de solo escritura 
	        // Solo podemos poner valores usando setters, no leerlos directamente
	        PersonWriteOnly person2 = new PersonWriteOnly();
	        person2.setName("Robert");
	        person2.setAge(21);
	        System.out.println("Ejemplo 3 - PersonWriteOnly (solo escritura):");
	        System.out.println("Se han asignado valores con setters, no podemos leer directamente.\n");

	        // Ejemplo 4: Clase Person totalmente encapsulada
	        // Podemos poner y obtener valores usando setters y getters
	        PersonFull per1 = new PersonFull();
	        PersonFull per2 = new PersonFull();

	        per1.setName("Robert");
	        per1.setAge(21);

	        per2.setName("Riyan");
	        per2.setAge(22);

	        System.out.println("Ejemplo 4 - PersonFull (totalmente encapsulada):");
	        System.out.println("Person 1: Name : " + per1.getName() + " Age : " + per1.getAge());
	        System.out.println("Person 2: Name : " + per2.getName() + " Age : " + per2.getAge() + "\n");

	        // Ejemplo 5: Clase Employee totalmente encapsulada con constructor
	        Employee emp = new Employee("Robert", "EMP001", 75450.00);
	        System.out.println("Ejemplo 5 - Employee (inicial):");
	        System.out.println(emp.getEmpId() + " , " + emp.getEmpName() + " , " + emp.getSalary());

	        // Actualizamos valores usando setters
	        emp.setEmpName("Riyan");
	        emp.setEmpId("EMP002");
	        emp.setSalary(90500.00);

	        System.out.println("Ejemplo 5 - Employee (actualizado):");
	        System.out.println(emp.getEmpId() + " , " + emp.getEmpName() + " , " + emp.getSalary());
	    }
	}

	// Clase EncapTest con getters y setters 
	class EncapTest {
	    private String name;
	    private String idNum;
	    private int age;

	    // Getter para edad
	    public int getAge() {
	        return age;
	    }

	    // Getter para nombre
	    public String getName() {
	        return name;
	    }

	    // Getter para ID
	    public String getIdNum() {
	        return idNum;
	    }

	    // Setter para edad
	    public void setAge(int newAge) {
	        age = newAge;
	    }

	    // Setter para nombre
	    public void setName(String newName) {
	        name = newName;
	    }

	    // Setter para ID
	    public void setIdNum(String newId) {
	        idNum = newId;
	    }
	}

	// Clase de solo lectura
	class PersonReadOnly {
	    private String name = "Robert";
	    private int age = 21;

	    public String getName() {
	        return this.name;
	    }

	    public int getAge() {
	        return this.age;
	    }
	}

	// Clase de solo escritura
	class PersonWriteOnly {
	    private String name;
	    private int age;

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }
	}

	// Clase totalmente encapsulada
	class PersonFull {
	    private String name;
	    private int age;

	    public void setName(String name) {
	        this.name = name;
	    }

	    public void setAge(int age) {
	        this.age = age;
	    }

	    public String getName() {
	        return this.name;
	    }

	    public int getAge() {
	        return this.age;
	    }
	}

	// Clase Employee totalmente encapsulada con constructor
	class Employee {
	    private String emp_name;
	    private String emp_id;
	    private double net_salary;

	    // Constructor para inicializar los valores
	    public Employee(String emp_name, String emp_id, double net_salary) {
	        this.emp_name = emp_name;
	        this.emp_id = emp_id;
	        this.net_salary = net_salary;
	    }

	    // Getters
	    public String getEmpName() {
	        return emp_name;
	    }

	    public String getEmpId() {
	        return emp_id;
	    }

	    public double getSalary() {
	        return net_salary;
	    }

	    // Setters
	    public void setEmpName(String emp_name) {
	        this.emp_name = emp_name;
	    }

	    public void setEmpId(String emp_id) {
	        this.emp_id = emp_id;
	    }

	    public void setSalary(double net_salary) {
	        this.net_salary = net_salary;
	    }
	}