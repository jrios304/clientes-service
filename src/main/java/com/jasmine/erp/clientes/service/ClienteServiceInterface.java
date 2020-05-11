package com.jasmine.erp.clientes.service;

import com.jasmine.erp.clientes.service.dto.ClienteDTO;

public interface ClienteServiceInterface{
	
	/**
	 * Permite crear o modificar un cliente
	 * @param cliente, cliente a actualizar
	 * @return
	 */
	ClienteDTO actualizarCliente(ClienteDTO cliente);
}
