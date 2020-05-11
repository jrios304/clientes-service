package com.jasmine.erp.clientes.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jasmine.erp.clientes.service.dto.ClienteDTO;
import com.jasmine.erp.clientes.service.mapper.ClienteMapper;
import com.jasmine.erp.entities.clientes.Cliente;
import com.jasmine.erp.repositories.clientes.ClienteRepository;

@Transactional
@Service
public class ClienteService implements ClienteServiceInterface{
	
	 @Autowired
	 ClienteRepository clienteRepository;
	 @Autowired
	 ClienteMapper clienteMapper;

	@Override
	public ClienteDTO actualizarCliente(ClienteDTO cliente) {
		Cliente entity = clienteMapper.clienteDTOToCliente(cliente);
		return clienteMapper.clienteToClienteDTO(clienteRepository.saveAndFlush(entity));
	}
}
