package com.jasmine.erp.clientes.service;

import java.util.List;

import com.jasmine.erp.clientes.service.dto.CitaBusquedaDTO;
import com.jasmine.erp.clientes.service.dto.CitaDTO;
import com.jasmine.erp.configuracion.service.dto.ParametroDTO;

public interface CitaServiceInterface {

	/**
	 * Permite actualizar o crear una cita
	 * @param cita
	 * @return
	 */
	CitaDTO actualizarCita(CitaDTO cita);
	
	/**
	 * Metodos para obtener las listas de filtros
	 * @param valor
	 * @return
	 */
	List<String> obtenerListaCodigoFiltro(String valor);
	List<ParametroDTO> obtenerListaTipoServicioFiltro();
	List<ParametroDTO> obtenerListaSedeFiltro();
	List<String> obtenerListaClienteFiltro(String valor);
	
	/**
	 * Permite obtener el listado de citas de acuerdo a los criterios de busqueda
	 * @param filtro
	 * @return
	 */
	List<CitaDTO> obtenerCitasFiltro(CitaBusquedaDTO filtro);
	
	/**
	 * Permite obtener una cita en base a su id
	 * @param idCita
	 * @return
	 */
	CitaDTO buscarCita(Long idCita);
	
	/**
	 * Permite eliminar una cita de la BD
	 * @param citaEliminar
	 */
	void eliminarCita(CitaDTO citaEliminar);
}
