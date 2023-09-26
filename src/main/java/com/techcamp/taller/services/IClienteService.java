package com.techcamp.taller.services;

import java.util.List;

import com.techcamp.taller.models.Cliente;

public interface IClienteService {
	
	Cliente obtenerClientePorId(Long idCliente);
	
	Cliente crearCliente(Cliente cliente);	
	
	List<Cliente> obtenerCliente();
	
	Cliente actualizarCliente(Cliente cliente, Long idCliente);	

}
