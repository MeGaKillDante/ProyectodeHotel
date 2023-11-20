/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Clases;

public class Cliente {
    private String nombre;
    private String DNI;
    private String Acompañantes;
    private String Extra;
    private String HoraEntrada;
    public Cliente(){
        
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDNI() {
        return DNI;
    }

    public void setDNI(String DNI) {
        this.DNI = DNI;
    }

    public String getAcompañantes() {
        return Acompañantes;
    }

    public void setAcompañantes(String Acompañantes) {
        this.Acompañantes = Acompañantes;
    }

    public String getExtra() {
        return Extra;
    }

    public void setExtra(String Extra) {
        this.Extra = Extra;
    }

    public String getHoraEntrada() {
        return HoraEntrada;
    }

    public void setHoraEntrada(String HoraEntrada) {
        this.HoraEntrada = HoraEntrada;
    }
    
}
