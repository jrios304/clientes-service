package com.jasmine.erp.clientes.service;

import java.util.List;

import com.jasmine.erp.clientes.service.dto.ClienteBusquedaDTO;
import com.jasmine.erp.clientes.service.dto.ClienteDTO;
import com.jasmine.erp.configuracion.service.dto.ParametroDTO;

public interface ClienteServiceInterface{
	
	/**
	 * Permite crear o modificar un cliente
	 * @param cliente, cliente a actualizar
	 * @return
	 */
	ClienteDTO actualizarCliente(ClienteDTO cliente);
	
	/**
	 * Permite obtener las listas de todos los filtros
	 * @return
	 */
	List<String> obtenerNombresFiltro(String valor);
	List<String> obtenerCorreosFiltro(String valor);
	List<String> obtenerTelefonosFiltro(String valor);
	List<ParametroDTO> obtenerCiudadesFiltro();
	
	/**
	 * Permite buscar la lista de clientes de acuerdo a los filtros de busqueda
	 * @param filtro
	 * @return
	 */
	List<ClienteDTO> obtenerClientesFiltro(ClienteBusquedaDTO filtro);
	
	/**
	 * Permite buscar un cliente en base a su id
	 * @param idCliente
	 * @return
	 */
	ClienteDTO buscarCliente(Long idCliente);
	
	/**
	 * Permite eliminar un cliente de la bd
	 * @param clienteEliminar
	 */
	void eliminarCliente(ClienteDTO clienteEliminar);
}
