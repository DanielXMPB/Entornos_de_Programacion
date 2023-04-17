/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Logica;

/**
 *
 * @author Daniel Perez
 */
public class Chico {
    private int Codigo;
    private String Sexo;
    private String Nombre;
    private int Edad;
    private String Ciudad;

    public Chico() {
    }

    public Chico(int Codigo, String Sexo, String Nombre, int Edad, String Ciudad) {
        this.Codigo = Codigo;
        this.Sexo = Sexo;
        this.Nombre = Nombre;
        this.Edad = Edad;
        this.Ciudad = Ciudad;
    }

    public int getCodigo() {
        return Codigo;
    }

    public void setCodigo(int Codigo) {
        this.Codigo = Codigo;
    }

    public String getSexo() {
        return Sexo;
    }

    public void setSexo(String Sexo) {
        this.Sexo = Sexo;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public int getEdad() {
        return Edad;
    }

    public void setEdad(int Edad) {
        this.Edad = Edad;
    }

    public String getCiudad() {
        return Ciudad;
    }

    public void setCiudad(String Ciudad) {
        this.Ciudad = Ciudad;
    }

    @Override
    public String toString() {
        return "Codigo=" + Codigo + ", Sexo=" + Sexo + ", Nombre=" + Nombre + ", Edad=" + Edad + ", Ciudad=" + Ciudad;
    }
}