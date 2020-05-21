package com.jasmine.erp.clientes.service.dto;

import java.util.Date;

/**
 * Dto que representa la busqueda en los filtros
 * @author jrios
 *
 */
public class CitaBusquedaDTO {
	
	private Long tipoServicio;
	private String codigo;
	private Date fecha;
	private Long sede;
	private String cliente;
	
	//------------------------GETTER Y SETTER------------------------------------------------------------------------
	
	/**
	 * @return the tipoServicio
	 */
	public Long getTipoServicio() {
		return tipoServicio;
	}
	/**
	 * @param tipoServicio the tipoServicio to set
	 */
	public void setTipoServicio(Long tipoServicio) {
		this.tipoServicio = tipoServicio;
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
	 * @return the fecha
	 */
	public Date getFecha() {
		return fecha;
	}
	/**
	 * @param fecha the fecha to set
	 */
	public void setFecha(Date fecha) {
		this.fecha = fecha;
	}
	/**
	 * @return the sede
	 */
	public Long getSede() {
		return sede;
	}
	/**
	 * @param sede the sede to set
	 */
	public void setSede(Long sede) {
		this.sede = sede;
	}
	/**
	 * @return the cliente
	 */
	public String getCliente() {
		return cliente;
	}
	/**
	 * @param cliente the cliente to set
	 */
	public void setCliente(String cliente) {
		this.cliente = cliente;
	}	
}