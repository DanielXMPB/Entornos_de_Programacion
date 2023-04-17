/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package uis.edu.entorno.BackCliente.servicio;

import java.util.List;
import uis.edu.entorno.BackCliente.modelo.Cliente;

/**
 *
 * @author Daniel Perez
 */
public interface IClienteServicio {
    
    public List<Cliente> getClientes();
    public Cliente getCliente(Integer id);
    public Cliente grabarCliente(Cliente cliente);
    public void delte(Integer id);
}
