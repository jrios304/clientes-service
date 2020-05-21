package com.jasmine.erp.clientes.service.dto;

import java.io.Serializable;
import java.util.Date;


import com.jasmine.erp.configuracion.service.dto.ParametroDTO;
import com.jasmine.erp.entities.clientes.Cliente;

public class CitaDTO implements Serializable{
	
	/**
	 * Identificador de la cita
	 */
	private Long id;
	/**
	 * Tipo de servicio a prestar
	 */
	private ParametroDTO tipoServicio;
	/**
	 * Codigo que se genera para identificar la cita
	 */
	private String codigo;
	/**
	 * Descripcion del servicio a prestar
	 */
	private String descripcion;
	/**
	 * Fecha y hora del servicio
	 */
	private Date fechaHora;
	/**
	 * Sede de la cita
	 */
	private ParametroDTO sede;
	/**
	 * Cliente que solicita la cita
	 */
	private ClienteDTO cliente;
	
	//--------------------GETTER Y SETTER----------------------------------------------------------------
	
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
	 * @return the codigo
	 */
	public String getCodigo() {
		return codigo;
	}
	/**
	 * @param codigo the codigo to set
	 */
	public void setCodigo(String codigo) {
		this.codigo = codigo;
	}
	/**
	 * @return the descripcion
	 */
	public String getDescripcion() {
		return descripcion;
	}
	/**
	 * @param descripcion the descripcion to set
	 */
	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}
	/**
	 * @return the fechaHora
	 */
	public Date getFechaHora() {
		return fechaHora;
	}
	/**
	 * @param fechaHora the fechaHora to set
	 */
	public void setFechaHora(Date fechaHora) {
		this.fechaHora = fechaHora;
	}
	/**
	 * @return the sede
	 */
	public ParametroDTO getSede() {
		return sede;
	}
	/**
	 * @param sede the sede to set
	 */
	public void setSede(ParametroDTO sede) {
		this.sede = sede;
	}
	/**
	 * @return the cliente
	 */
	public ClienteDTO getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(ClienteDTO cliente) {
		this.cliente = cliente;
	}
	/**
	 * @return the tipoServicio
	 */
	public ParametroDTO getTipoServicio() {
		return tipoServicio;
	}
	/**
	 * @param tipoServicio the tipoServicio to set
	 */
	public void setTipoServicio(ParametroDTO tipoServicio) {
		this.tipoServicio = tipoServicio;
	}
}