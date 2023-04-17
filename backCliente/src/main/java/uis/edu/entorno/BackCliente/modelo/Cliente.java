/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uis.edu.entorno.BackCliente.modelo;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


/**
 *
 * @author Daniel Perez
 */

@Entity
@Table(name= Cliente.TABLE_NAME)
public class Cliente {
    public static final String TABLE_NAME = "cliente";
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int idcliente;
    private String documento;
    private String tipdoc;
    private String nombres;
    private String apellidos;
    private String direccion;
    private String email;

    public Cliente() {
    }

    public Cliente(int idcliente, String documento, String tipdoc, String nombres, String apellidos, String direccion, String email) {
        this.idcliente = idcliente;
        this.documento = documento;
        this.tipdoc = tipdoc;
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.direccion = direccion;
        this.email = email;
    }

    public int getIdcliente() {
        return idcliente;
    }

    public String getDocumento() {
        return documento;
    }

    public String getTipdoc() {
        return tipdoc;
    }

    public String getNombres() {
        return nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getEmail() {
        return email;
    }

    public void setIdcliente(int idcliente) {
        this.idcliente = idcliente;
    }

    public void setDocumento(String documento) {
        this.documento = documento;
    }

    public void setTipdoc(String tipdoc) {
        this.tipdoc = tipdoc;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
    @Override
    public String toString(){
        return "Cliente [idcliente="+idcliente+",documento="+documento
                +",tipdoc"+tipdoc+",nombres="+nombres+",apellidos"+apellidos
                +",direccion="+direccion+",email="+email+"]";
    }
}
