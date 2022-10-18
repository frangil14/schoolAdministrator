
package administracionescolar;



public class Alumno extends Persona {
    String dni;
    int curso;
    float promedioGeneral;
    int inasistencias;
    Materia materiasCursa [];
    String concepto;

    public Alumno() {
    }
    
    

    public Alumno(String nombre, String apellido, String dni, int curso, int inasistencias, String concepto) {
        super(nombre, apellido);
        int i;
        this.dni = dni;
        this.curso = curso;
        this.inasistencias = inasistencias;       
        this.concepto = concepto;
        //INICIALIZA LAS MATERIAS EN EL ORDEN DEL MAPEO
        materiasCursa = new Materia [9];
        for (i=0; i<9; i++) {
            materiasCursa[i]= new Materia(AdministracionEscolar.mapeoMaterias.get(i));
        }
    }
    
    public Alumno(String nombre, String apellido, String dni, int curso, int inasistencias, String concepto, int notas[]) {
        super(nombre, apellido);
        int i,j, contador;
        contador=0;
        j=0;
        i=0;
        this.dni = dni;
        this.curso = curso;
        this.inasistencias = inasistencias;       
        this.concepto = concepto;
        //INICIALIZA LAS MATERIAS EN EL ORDEN DEL MAPEO
        materiasCursa = new Materia [9];
            while (contador<9){
                materiasCursa[i]= new Materia(AdministracionEscolar.mapeoMaterias.get(i));
                materiasCursa[i].setNota1(notas[j]);
                materiasCursa[i].setNota2(notas[j+1]);
                materiasCursa[i].setNota3(notas[j+2]);
                materiasCursa[i].calculaPromedioPorMateria();
                j=j+3;
                i++;
                contador=contador+1;
            }
        this.calcularPromedioGeneral();
    }
    
    public String getConcepto() {
        return concepto;
    }
    
    public void setConcepto(String concepto){
        this.concepto= concepto;
    }

    public int getCurso() {
        return curso;
    }

    public void setCurso(int curso) {
        this.curso = curso;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public int getInasistencias() {
        return inasistencias;
    }

    public void setInasistencias(int inasistencias) {
        this.inasistencias = inasistencias;
    }

    public float getPromedioGeneral() {
        return promedioGeneral;
    }

    public void setPromedioGeneral(float promedioGeneral) {
        this.promedioGeneral = promedioGeneral;
    }
    
    
    @Override
    public String toString() {
        int i;
        return super.toString()+ dni+"\n"+curso+"\n"
                +inasistencias+"\n"+concepto+"\n";
    }
    
    public float calcularPromedioGeneral (){
        int i;
        float auxiliarPromedio=0;
        for (i=0; i<9; i++){
            auxiliarPromedio=(auxiliarPromedio+materiasCursa[i].calculaPromedioPorMateria());
                }
        this.promedioGeneral= (auxiliarPromedio/9);
        return(this.promedioGeneral);

    }
    
    @Override
    public int compareTo(Alumno a){
        if (this.promedioGeneral>a.promedioGeneral) {
            return (-1);
        }
        else {
            if (this.promedioGeneral==a.promedioGeneral) {
                return (0);
            }
            else {
                return (1);
            }
        }
    }
   
}
