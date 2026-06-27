// Clase que representa un estudiante
public class Estudiante {

    // Atributos de la clase
    private String nombre;
    private int edad;
    private String carrera;
    private double promedio;


    // Constructor de la clase
    public Estudiante(String nombre, int edad, String carrera, double promedio) {

        this.nombre = nombre;
        this.edad = edad;
        this.carrera = carrera;
        this.promedio = promedio;
    }


    // Método para mostrar información del estudiante
    public void mostrarDatos() {

        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("Carrera: " + carrera);
        System.out.println("Promedio: " + promedio);
    }


    // Método para cambiar el promedio
    public void actualizarPromedio(double nuevoPromedio) {

        promedio = nuevoPromedio;
    }


    // Método que indica si aprobó
    public boolean estaAprobado() {

        return promedio >= 70;
    }


    // Métodos getters
    public String getNombre() {

        return nombre;
    }

}
// Clase principal del programa
public class Main {


    public static void main(String[] args) {


        // Instanciación de objetos
        Estudiante estudiante1 = new Estudiante(
                "Juan Perez",
                20,
                "Ingeniería en Tecnologías",
                85
        );


        Estudiante estudiante2 = new Estudiante(
                "Maria Lopez",
                22,
                "Ingeniería Industrial",
                65
        );


        // Uso de métodos
        estudiante1.mostrarDatos();

        System.out.println(
                "¿Aprobó?: " + estudiante1.estaAprobado()
        );


        System.out.println("----------------");


        estudiante2.mostrarDatos();

        System.out.println(
                "¿Aprobó?: " + estudiante2.estaAprobado()
        );


        // Modificación de datos usando método
        estudiante2.actualizarPromedio(80);


        System.out.println("----------------");
        System.out.println("Nuevo promedio de Maria:");

        estudiante2.mostrarDatos();

    }
}
