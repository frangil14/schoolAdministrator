
package administracionescolar;



public class Docente extends Persona {
    String domicilio, telefono, materia;

    public String getMateria() {
        return materia;
    }

    public void setMateria(String materia) {
        this.materia = materia;
    }
    
    //METODOS//

    public Docente() {
    }

    public Docente(String nombre, String apellido, String domicilio, String telefono, String materia) {
        super(nombre, apellido);
        this.domicilio = domicilio;
        this.telefono = telefono;
        this.materia= materia;
    }

    public String getDomicilio() {
        return domicilio;
    }

    public void setDomicilio(String domicilio) {
        this.domicilio = domicilio;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return (super.toString()+ this.domicilio + "\n" + this.telefono+"\n"+this.materia+"\n");
    }
    
    @Override
    public int compareTo(Alumno a){
        return(0);
    }
}
