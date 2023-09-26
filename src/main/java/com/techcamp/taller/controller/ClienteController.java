package com.techcamp.taller.controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.techcamp.taller.models.Cliente;
import com.techcamp.taller.services.IClienteService;

@RestController
@CrossOrigin("*")
@RequestMapping("/")
public class ClienteController {
	
	private final IClienteService iClienteService;
		
	
	public ClienteController ( IClienteService iClienteService) {
		this.iClienteService = iClienteService;
	
		
	}
	
	
	@PostMapping("/crear")
    public Cliente crearCliente(@RequestBody Cliente cliente) {		
        return this.iClienteService.crearCliente(cliente);
	}    
	
	@GetMapping("/{idCliente}")
    public Cliente obtenerClientePorId(@PathVariable Long idCliente) {		
        return this.iClienteService.obtenerClientePorId(idCliente);
    }
	
		
	@GetMapping("/clientes")
	public ResponseEntity<List<Cliente>> obtenerCliente (){
		List<Cliente> clientes = iClienteService.obtenerCliente();
        return new ResponseEntity<>(clientes, HttpStatus.OK);
	}
        
    @PutMapping("/actualizar/{idCliente}")
    public Cliente actualizarCliente(@RequestBody Cliente cliente, @PathVariable Long idCliente) {		
        return this.iClienteService.actualizarCliente(cliente, idCliente);	
		
		
	}
	
}
