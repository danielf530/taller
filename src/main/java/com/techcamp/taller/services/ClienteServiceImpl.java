package com.techcamp.taller.services;

import org.springframework.stereotype.Service;

import com.techcamp.taller.models.Cliente;
import com.techcamp.taller.repository.ClienteRepository;

import java.util.List;


@Service
public class ClienteServiceImpl implements IClienteService {
	
	
	private final ClienteRepository clienteRepository;
	
	public ClienteServiceImpl ( ClienteRepository clienteRepository) {
		this.clienteRepository = clienteRepository;
	}
	
	@Override
	public Cliente obtenerClientePorId(Long idCliente) {
		Cliente cliente = this.clienteRepository.findById(idCliente).orElse(null);
		return cliente;
	}
	
	
	@Override
	public List<Cliente> obtenerCliente(){
		return this.clienteRepository.findAll();
	}

	@Override
	public Cliente crearCliente(Cliente cliente) {		
		return this.clienteRepository.save(cliente);
	}

	@Override
	public Cliente actualizarCliente(Cliente cliente, Long idCliente) {
		Cliente clienteBuscado = this.clienteRepository.findById(idCliente).orElse(null);
		if (clienteBuscado != null) {
			clienteBuscado.setCelular(cliente.getCelular());
			clienteBuscado.setCorreo(cliente.getCorreo());
			clienteBuscado.setDireccion(cliente.getDireccion());
			clienteBuscado.setDocumento(cliente.getDocumento());
			clienteBuscado.setTipoDocumento(cliente.getTipoDocumento());
			
			return this.clienteRepository.save(clienteBuscado);
		} else {
			throw new  NullPointerException("No existe el cliente");
		}
		
	}
}
