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

    public static void comer(String platillo) {
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
        Persona.comer("sandwich");

        Persona p1 = new Persona();
        p1.dormir(3);
        p1.hacerEjercicio(3.5);
    }
}