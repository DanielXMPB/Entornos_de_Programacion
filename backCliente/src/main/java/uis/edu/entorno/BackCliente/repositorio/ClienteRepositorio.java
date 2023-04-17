/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uis.edu.entorno.BackCliente.repositorio;

import org.springframework.data.jpa.repository.JpaRepository;
import uis.edu.entorno.BackCliente.modelo.Cliente;

/**
 *
 * @author Daniel Perez
 */
public interface ClienteRepositorio extends JpaRepository<Cliente, Integer>{
    
}
