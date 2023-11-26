/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Cliente {
    private String numero;
    private int Seleccion; /*Se almacena el numero de habitacion*/
    public Cliente(){
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


