package com.techcamp.taller.models;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "BAN_CLIENTES")
public class Cliente {
	
	@Id
	@Column (name ="IDCLIENTE", nullable = false)
	@GeneratedValue(strategy=GenerationType.SEQUENCE, generator="SEQ_CLIENTES")
    @SequenceGenerator(name="SEQ_CLIENTES", sequenceName="SEQ_CLIENTES", allocationSize=1)
    private Long idCliente;
	
	@Column (name = "DOCUMENTO")
	private String documento;
	
	@Column (name = "TIPODOCUMENTO")
	private String tipoDocumento;
	
	@Column (name = "DIRECCION")
	private String direccion;
	
	@Column (name = "CORREO")
	private String correo;
	
	@Column (name = "CELULAR")
	private String celular;

	public Long getIdCliente() {
		return idCliente;
	}

	public void setIdCliente(Long idCliente) {
		this.idCliente = idCliente;
	}

	public String getDocumento() {
		return documento;
	}

	public void setDocumento(String documento) {
		this.documento = documento;
	}

	public String getTipoDocumento() {
		return tipoDocumento;
	}

	public void setTipoDocumento(String tipoDocumento) {
		this.tipoDocumento = tipoDocumento;
	}

	public String getDireccion() {
		return direccion;
	}

	public void setDireccion(String direccion) {
		this.direccion = direccion;
	}

	public String getCorreo() {
		return correo;
	}

	public void setCorreo(String correo) {
		this.correo = correo;
	}

	public String getCelular() {
		return celular;
	}

	public void setCelular(String celular) {
		this.celular = celular;
	}
	
	

}
