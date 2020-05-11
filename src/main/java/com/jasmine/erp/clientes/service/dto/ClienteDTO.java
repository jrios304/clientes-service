package com.jasmine.erp.clientes.service.dto;

import java.io.Serializable;
import java.time.LocalDate;

import javax.persistence.Id;

import com.jasmine.erp.configuracion.service.dto.ParametroDTO;

public class ClienteDTO implements Serializable{

	/**
	 * Identificador del cliente
	 */
	private Long id;
	/**
	 * Nombre del cliente
	 */
	private String nombre;
	/**
	 * Correo del cliente
	 */
	private String email;
	/**
	 * Telefono del cliente
	 */
	private String telefono;
	/**
	 * Ciudad en la que se situa el cliente
	 */
	private ParametroDTO ciudad;
	/**
	 * Fecha de creacion del cliente
	 */
	private LocalDate fechaCreacion;
	
	//--------------------GETTER Y SETTER---------------------------------------------------------------------------
	
	/**
	 * @return the id
	 */
	public Long getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * @return the nombre
	 */
	public String getNombre() {
		return nombre;
	}
	/**
	 * @param nombre the nombre to set
	 */
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	/**
	 * @return the email
	 */
	public String getEmail() {
		return email;
	}
	/**
	 * @param email the email to set
	 */
	public void setEmail(String email) {
		this.email = email;
	}
	/**
	 * @return the telefono
	 */
	public String getTelefono() {
		return telefono;
	}
	/**
	 * @param telefono the telefono to set
	 */
	public void setTelefono(String telefono) {
		this.telefono = telefono;
	}
	/**
	 * @return the ciudad
	 */
	public ParametroDTO getCiudad() {
		return ciudad;
	}
	/**
	 * @param ciudad the ciudad to set
	 */
	public void setCiudad(ParametroDTO ciudad) {
		this.ciudad = ciudad;
	}
	/**
	 * @return the fechaCreacion
	 */
	public LocalDate getFechaCreacion() {
		return fechaCreacion;
	}
	/**
	 * @param fechaCreacion the fechaCreacion to set
	 */
	public void setFechaCreacion(LocalDate fechaCreacion) {
		this.fechaCreacion = fechaCreacion;
	}
}
