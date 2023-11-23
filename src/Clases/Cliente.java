/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Cliente {
    private String nombre;
    private String dni;
    private String compas;
    private String datosex;
    private String entrada;
    private String numero;
    private int Seleccion; /*Se almacena el numero de habitacion*/
    public Cliente(){
    }
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
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

    public String getEntrada() {
        return entrada;
    }

    public void setEntrada(String entrada) {
        this.entrada = entrada;
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
    

    
}


