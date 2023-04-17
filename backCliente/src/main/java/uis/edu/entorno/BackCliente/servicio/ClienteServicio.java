/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package uis.edu.entorno.BackCliente.servicio;

import jakarta.transaction.Transactional;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uis.edu.entorno.BackCliente.modelo.Cliente;
import uis.edu.entorno.BackCliente.repositorio.ClienteRepositorio;

/**
 *
 * @author Daniel Perez
 */
@Service
@Transactional
public class ClienteServicio implements IClienteServicio {

    @Autowired
    private ClienteRepositorio clienteRepo;

    @Override
    public List<Cliente> getClientes() {
        return clienteRepo.findAll();
    }

    @Override
    public Cliente getCliente(Integer id) {
        return clienteRepo.findById(id).orElse(null);
    }

    @Override
    public Cliente grabarCliente(Cliente cliente) {
        return clienteRepo.save(cliente);
    }

    @Override
    public void delte(Integer id) {
        clienteRepo.deleteById(id);
    }

}
