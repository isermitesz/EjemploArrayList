/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraylist;

import java.util.*;
import javax.swing.*;
import java.io.*;

/**
 *
 * @author iserm
 */
public class ArregloAlumnos {
    private ArrayList<Alumno> objAlumno;
    
    // Contructor
    public ArregloAlumnos() {
        objAlumno = new ArrayList<Alumno>();
        
    }
    
    // Métodos de manejo del ArrayList
    public void agregar(Alumno al) {
        objAlumno.add(al);
    }
    
    public void borrar(Alumno al) {
        objAlumno.remove(al);
    }
    
    public Alumno obtener(int pos) {
        return objAlumno.get(pos);
    }
    
    public Alumno buscar(String noControl) {
        for (int i = 0; i < objAlumno.size(); i++) {
            if(noControl.equals(objAlumno.get(i).getNoControl()))
                return objAlumno.get(i);
        }
        return null;
    }
    
    public int numElementos() {
        return objAlumno.size();
    }
    
    public void leerDatos() {
        cargar();
    }
    
    
    
    // Cargar lista de alumnos
    private void cargar() {
        try {
            
            File archivo = new File("alumnos.txt");
            // Si el archivo existe
            if(archivo.exists()) {
                BufferedReader br = new BufferedReader(new FileReader("alumnos.txt"));
                String linea;
                
                while((linea = br.readLine()) != null) {
                    StringTokenizer st = new StringTokenizer(linea, ",");
                    String noControl = st.nextToken().trim();
                    String apellidoPat = st.nextToken().trim();
                    String apellidoMat = st.nextToken().trim();
                    String Nombre = st.nextToken().trim();
                    int semestre = Integer.parseInt(st.nextToken().trim());
                    Alumno al = new Alumno(noControl, apellidoPat, apellidoMat, Nombre, semestre);
                    agregar(al);
                }
                       
                
            }
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo un error: " + e);
        }   
    }
    public void guardar() {
        try {
            PrintWriter pw = new PrintWriter(new FileWriter("alumnos.txt"));
            for(int i=0; i<numElementos(); i++) {
                pw.println(obtener(i).getNoControl()+","+obtener(i).getApellidoPat()+","+
                        obtener(i).getApellidoMat()+","+obtener(i).getNombre()+","+obtener(i).getSemestre());
                pw.close();
            }
            
        } catch(Exception e) {
            JOptionPane.showMessageDialog(null, "Se produjo el siguiente error: " + e);
        }

    }
}


