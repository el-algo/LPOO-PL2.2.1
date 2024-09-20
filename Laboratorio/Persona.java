/*
1. Modelar una clase llamada Persona.
2. Considerar al menos CINCO atributos demográficos de una persona.
3. Modelar los métodos set y get para cada atributo.
4. Considerar los métodos comer(...), dormir(...), hacerEjercicio(...).
Para cada método decida el protocolo. Cada uno de los tres métodos debe recibir
AL MENOS UN PARAMETRO, y como comportamiento deben al menos imprimir el valor
del parámetros o parámetros que le llegaron.
5. El método comer(...) declararlo como "static". Los otros dos métodos NO son
static.
6. Ponga ejemplos de cómo se invocarían comer(...), dormir(...),
hacerEjercicio(...).
7. Puede probar la invocación de esos tres métodos, ejecutando el programa.
(Opcional)
*/
public class Persona {
    String nombre;
    int edad;
    String genero;
    String nacionalidad;
    String estadoCivil;

    public void comer(String platillo) {
        System.out.println("Degustando un delicioso " + platillo + ".");
    }

    public void dormir(int horasDescanso) {
        System.out.println("Esta persona descanso " + horasDescanso +
            " horas seguidas.");
    }

    public void hacerEjercicio(double horasEjercicio) {
        if (horasEjercicio > 2.0) {
            System.out.println(horasEjercicio + " hrs es suficiente ejercicio.");
        } else {
            System.out.println(horasEjercicio + " hrs no es suficiente ejercicio.");
        }
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return nombre;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getEdad() {
        return edad;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public String getGenero() {
        return genero;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }
    
    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setEstadoCivil(String estadoCivil) {
        this.estadoCivil = estadoCivil;
    }

    public String getEstadoCivil() {
        return estadoCivil;
    }

    public static void main(String[] args) {
        // Integrante 1
        Persona p1 = new Persona();
        p1.setNombre("José");
        p1.setEdad(21);
        p1.setGenero("Hombre");
        p1.setNacionalidad("Mexicano");
        p1.setEstadoCivil("Soltero");

        System.out.println(p1.getNombre());
        System.out.println(p1.getEdad());
        System.out.println(p1.getGenero());
        System.out.println(p1.getNacionalidad());
        System.out.println(p1.getEstadoCivil());
        p1.comer("nugget");
        p1.dormir(6);
        p1.hacerEjercicio(1.5);
        System.out.println();

        // Integrante 2
        Persona p2 = new Persona();
        p2.setNombre("Alexander");
        p2.setEdad(21);
        p2.setGenero("Hombre");
        p2.setNacionalidad("Mexicano");
        p2.setEstadoCivil("Soltero");

        System.out.println(p2.getNombre());
        System.out.println(p2.getEdad());
        System.out.println(p2.getGenero());
        System.out.println(p2.getNacionalidad());
        System.out.println(p2.getEstadoCivil());
        p2.comer("taco");
        p2.dormir(10);
        p2.hacerEjercicio(3.5);
        System.out.println();

        // Integrante 3
        Persona p3 = new Persona();
        p3.setNombre("Alan");
        p3.setEdad(25);
        p3.setGenero("Hombre");
        p3.setNacionalidad("Mexicano");
        p3.setEstadoCivil("Soltero");

        System.out.println(p3.getNombre());
        System.out.println(p3.getEdad());
        System.out.println(p3.getGenero());
        System.out.println(p3.getNacionalidad());
        System.out.println(p3.getEstadoCivil());
        p3.comer("arroz");
        p3.dormir(7);
        p3.hacerEjercicio(2.0);
        System.out.println();
    }
}