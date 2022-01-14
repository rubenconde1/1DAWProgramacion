package Tema5;

class Alumno {
    private static int contadorAlumnos = 0;
    private int id;
    private String nombre;
    private String grupo;

    static void nuevoAlumno() {
        contadorAlumnos++;
    };

    public Alumno(String n, int codigo) {
        nombre = n;
        id = codigo;
        grupo = "No asignado";
        nuevoAlumno();
    }

    public Alumno(String n, int codigo, String clase) {
        nombre = n;
        id = codigo;
        grupo = clase;
        nuevoAlumno();
    }

    public static void imprimirInforme() {
        System.out.println(contadorAlumnos);
    };

    public void preguntarDuda() {
        System.out.println(nombre + ", levanta la mano.");
    }

    public static void imprimirInformeAlumnos(Alumno[] alumnos) {
        for (Alumno alumno : alumnos) {
            System.out.println(alumno.nombre + "\t" + alumno.grupo);
        }
    }

    /*
    public static void main(String[] args) {
        Alumno a1, a2, a3;

        a1 = new Alumno("Alfonso", 123);
        a2 = new Alumno("Raquel", 345, "1CSFG");
        a3 = new Alumno("Frank", 542);

        Alumno.imprimirInforme();
        a2.preguntarDuda();
        
    }
    */
}