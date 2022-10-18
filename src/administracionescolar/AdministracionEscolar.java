/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package administracionescolar;

import java.io.*;
import java.util.*;

public class AdministracionEscolar {
    
    //ESTRUCTURAS BASE PARA MANEJAR LAS FUNCIONALIDADES
    // Y MAPEOS PARA MANEJAR DATOS
    
    static String nombre, apellido, dni, concepto, domicilio, telefono, materia;
    static File listaAlumnos= new File("data/listaAlumnos.txt");
    static File listaDocentesArchivo= new File("data/listaDocentes.txt");
    static int curso, inasistencias, i;
    static Menu principal;
    static Docente docenteAuxiliar;
    static Alumno alumnoAuxiliar;
    static List <Alumno> listaAlumnos1 = new ArrayList <Alumno> ();
    static List <Alumno> listaAlumnos2 = new ArrayList <Alumno> ();
    static List <Alumno> listaAlumnos3 = new ArrayList <Alumno> ();
    static List <Alumno> listaAlumnos4 = new ArrayList <Alumno> ();
    static List <Alumno> listaAlumnos5 = new ArrayList <Alumno> ();
    static List <Alumno> listaAlumnos6 = new ArrayList <Alumno> ();
    static List <Docente> listaDocentes = new ArrayList <Docente> (9);
    static Map <Integer, String> mapeoMaterias = new HashMap(9);
    static Map <Integer, String> mapeoConcepto = new HashMap(3);
    static Map <String, String> mapeoMateriaArea = new HashMap (9);
    static int notas[]= new int [27];
    public static void main(String[] args) {
        
    mapeoMaterias.put(0, "Matemática");
    mapeoMaterias.put(1, "Lengua");
    mapeoMaterias.put(2, "Física");
    mapeoMaterias.put(3, "Química");
    mapeoMaterias.put(4, "Biología");
    mapeoMaterias.put(5, "Ética");
    mapeoMaterias.put(6, "Historia");
    mapeoMaterias.put(7, "Geografía");
    mapeoMaterias.put(8, "Computación");
    
    mapeoConcepto.put(0, "Muy Aceptable");
    mapeoConcepto.put(1, "Aceptable");
    mapeoConcepto.put(2, "No Aceptable");
    
    mapeoMateriaArea.put("Matemática", "Matemática");
    mapeoMateriaArea.put("Lengua", "Sociales");
    mapeoMateriaArea.put("Física", "Matemática");
    mapeoMateriaArea.put("Química", "Naturales");
    mapeoMateriaArea.put("Biología", "Naturales");
    mapeoMateriaArea.put("Ética", "Sociales");
    mapeoMateriaArea.put("Historia", "Sociales");
    mapeoMateriaArea.put("Geografía", "Sociales");
    mapeoMateriaArea.put("Computación", "Matemática");
    
    try{
                        FileReader leo = new FileReader(listaAlumnos);
                        
                        BufferedReader lector= new BufferedReader(leo);
                        while((nombre=lector.readLine())!=null){
                         apellido= lector.readLine();
                         dni= lector.readLine();
                         curso= Integer.parseInt(lector.readLine());
                         inasistencias= Integer.parseInt(lector.readLine());
                         concepto= lector.readLine();
                         for (i=0; i<27; i++){
                             notas[i]= Integer.parseInt(lector.readLine());
                         }
                         
                         
                         //GUARDA LA INFORMACION DEL ARCHIVO EN EL OBJETO "alumnoAuxiliar".......
                         alumnoAuxiliar= new Alumno(nombre, apellido, dni, curso, inasistencias, concepto, notas);
                        
                        
                        //GUARDA EL OBJETO EN LA LISTA CORRESPONDIENTE DE ACUERDO AL CURSO DEL ALUMNO
    switch (curso) {
        case 1:
            listaAlumnos1.add(alumnoAuxiliar);
            
            break;
        case 2:
            
            listaAlumnos2.add(alumnoAuxiliar);
            
            break;
        case 3:
            listaAlumnos3.add(alumnoAuxiliar);
            
            break;
        case 4:
            listaAlumnos4.add(alumnoAuxiliar);
            
            break;
        case 5:
            listaAlumnos5.add(alumnoAuxiliar);
            
            break;
        case 6:
            
            listaAlumnos6.add(alumnoAuxiliar);
            
            break;
            
    }
                        }
                        leo.close();
                        lector.close();
                        }
                        catch(IOException e){
                           System.out.println(e.getMessage());
                        }
     try{
                        FileReader leo = null;
                        leo = new FileReader(listaDocentesArchivo);
                        
                        BufferedReader lector= new BufferedReader(leo);
                        while((nombre=lector.readLine())!=null){
                         apellido= lector.readLine();
                         domicilio= lector.readLine();
                         telefono= lector.readLine();
                         materia= lector.readLine();
                         //GUARDA LA INFORMACION DEL ARCHIVO EN EL OBJETO "docenteAuxiliar".......
                         docenteAuxiliar= new Docente(nombre, apellido, domicilio, telefono, materia);
                         listaDocentes.add(docenteAuxiliar);
                        }
                        lector.close();
                        leo.close();
     }
     catch (IOException e){
         System.out.println(e.getMessage());
     }
    
        
    //ABRE LA INTERFAZ PRINCIPAL, EMPIEZA EL PROGRAMA......
        Ingresar ingreso = new Ingresar();
        ingreso.setVisible(true);
        
        
}
}
