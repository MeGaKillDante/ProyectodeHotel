/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Cliente {
    private String Nombre;
    private int DNI;
    private String compas;
    private String datosex;
    private String numero;
    private String prueba;
    private String renta;
    private int Seleccion; /*Se almacena el numero de habitacion*/
    public Cliente(){
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getDNI() {
        return DNI;
    }

    public void setDNI(int DNI) {
        this.DNI = DNI;
    }

    public String getCompas() {
        return compas;
    }

    public void setCompas(String compas) {
        this.compas = compas;
    }

    public String getDatosex() {
        return datosex;
    }

    public void setDatosex(String datosex) {
        this.datosex = datosex;
    }
    
    public int getSeleccion() {
        return Seleccion;
    }

    public void setSeleccion(int Seleccion) {
        this.Seleccion = Seleccion;
    } 

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }
    public String getPrueba() {
        return prueba;
    }

    public void setPrueba(String prueba) {
        this.prueba = prueba;
    }

    public String getRenta() {
        return renta;
    }

    public void setRenta(String renta) {
        this.renta = renta;
    }
        
    

    
}


