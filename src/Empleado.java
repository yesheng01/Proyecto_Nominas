/*
  PACKAGE_NAME
  Nombre_project: BaseDeDatos
  DataBase
  Created by: Sheng Diego y Daniel
  Date : 12/03/2021
  Description:
 */
import  java.sql.*;


public class Empleado {

    private int id;
    private String dni;
    private String nom;
    private String apellidos;
    private String aelectronica;
    private String direccion;
    private int id_convenio;


    public Empleado(int i, String d, String n, String ap, String ae, String dir,int id_convenio){
        setId(i);
        setDni(d);
        setNom(n);
        setApellidos(ap);
        setAelectronica(ae);
        setDireccion(dir);
        setId_convenio(id_convenio);
    }

    public int getId() {
        return id;
    }

    public String getDni() {
        return dni;
    }

    public String getNom() {
        return nom;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getAelectronica() {
        return aelectronica;
    }

    public String getDireccion() {
        return direccion;
    }


    public void setId(int id) {
        this.id = id;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setAelectronica(String aelectronica) {
        this.aelectronica = aelectronica;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getId_convenio() {
        return id_convenio;
    }

    public void setId_convenio(int id_convenio) {
        this.id_convenio = id_convenio;
    }
}
