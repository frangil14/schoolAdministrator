
package administracionescolar;


public class Materia {
    int nota1, nota2, nota3;
    float promedioPorMateria;
    String nombre, area;
    
    //METODOS//

    public Materia(int nota1, int nota2, int nota3, String nombre) {
        this.nota1 = nota1;
        this.nota2= nota2;
        this.nota3= nota3;
        this.nombre = nombre;
        this.area= AdministracionEscolar.mapeoMateriaArea.get(this.nombre);
        
    }

    public Materia(String nombre) {
        this.nombre = nombre;
        this.nota1=0;
        this.nota2=0;
        this.nota3=0;
        this.area= AdministracionEscolar.mapeoMateriaArea.get(this.nombre);
        this.promedioPorMateria= 0;
        
    }

    
    public String getArea() {
        return area;
    }

    public void setArea(String area) {
        this.area = area;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNota1() {
        return nota1;
    }

    public void setNota1(int nota1) {
        this.nota1 = nota1;
    }

    public int getNota2() {
        return nota2;
    }

    public void setNota2(int nota2) {
        this.nota2 = nota2;
    }

    public int getNota3() {
        return nota3;
    }

    public void setNota3(int nota3) {
        this.nota3 = nota3;
    }


    public float getPromedioPorMateria() {
        return promedioPorMateria;
    }

    public void setPromedioPorMateria(float promedioPorMateria) {
        this.promedioPorMateria = promedioPorMateria;
    }
    
    


    @Override
    public String toString() {
        return nombre+", Area: "+area+"\n"+"Notas: "+nota1+", "+nota2+", "+nota3+"\n"+
                "Promedio general: "+promedioPorMateria+"\n";
    }
    
    public float calculaPromedioPorMateria (){
        this.promedioPorMateria=((this.nota1+this.nota2+this.nota3)/3);
        return(this.promedioPorMateria);
    }
    
    
    
    
    
}
