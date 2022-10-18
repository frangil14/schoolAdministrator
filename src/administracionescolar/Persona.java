
package administracionescolar;


public abstract class Persona implements Comparable<Alumno> {
    String nombre, apellido;
    
    //CLASE ABSTRACTA PADRE DE ALUMNO Y DOCENTE//

    public Persona(String nombre, String apellido) {
        this.nombre = nombre;
        this.apellido = apellido;
    }

    public Persona() {
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }
    
    //PARA IMPRIMIR//
    @Override
    public String toString() {
        return nombre + "\n" + apellido + "\n";
    }
    @Override
    public abstract int compareTo(Alumno a);
    
    
}
