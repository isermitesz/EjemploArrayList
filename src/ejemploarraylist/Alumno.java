/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejemploarraylist;

/**
 *
 * @author iserm
 */
public class Alumno {
    private String noControl;
    private String apellidoPat;
    private String apellidoMat;
    private String nombre;
    private int semestre;
    
 // Contructor clase
public Alumno(String noControl,String apellidoPat, 
    String apellidoMat, String nombre, int semestre) {
    this.noControl = noControl;
    this.apellidoPat = apellidoPat;
    this.apellidoMat = apellidoMat;
    this.nombre = nombre;
    this.semestre = semestre;
}

// Métodos SET

public void setNoControl(String noControl) {
    this.noControl = noControl;
}

public void setApellidoPat(String apellidoPat) {
    this.apellidoPat = apellidoPat;
}

public void setApellidoMat(String apellidoMat) {
    this.apellidoMat = apellidoMat;
}

public void setNombre(String nombre) {
    this.nombre = nombre;
}

public void setSemestre(int semestre) {
    this.semestre = semestre;
}

// Métodos GET

public String getNoControl() {
    return noControl;
}

public String getApellidoPat() {
    return apellidoPat;
}

public String getApellidoMat() {
    return apellidoMat;
}

public String getNombre() {
    return nombre;
}

public int getSemestre() {
    return semestre;
}
    
}



