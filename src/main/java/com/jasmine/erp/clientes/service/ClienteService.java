package com.jasmine.erp.clientes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jasmine.erp.clientes.service.dto.ClienteBusquedaDTO;
import com.jasmine.erp.clientes.service.dto.ClienteDTO;
import com.jasmine.erp.clientes.service.mapper.ClienteMapper;
import com.jasmine.erp.configuracion.service.dto.ParametroDTO;
import com.jasmine.erp.configuracion.service.mapper.ParametroMapper;
import com.jasmine.erp.entities.clientes.Cliente;
import com.jasmine.erp.repositories.clientes.ClienteRepository;
import com.mysql.cj.xdevapi.Client;

@Transactional
@Service
public class ClienteService implements ClienteServiceInterface{
	
	 @Autowired
	 ClienteRepository clienteRepository;
	 @Autowired
	 ClienteMapper clienteMapper;
	 @Autowired
	 ParametroMapper parametroMapper;

	@Override
	public ClienteDTO actualizarCliente(ClienteDTO cliente) {
		Cliente entity = clienteMapper.clienteDTOToCliente(cliente);
		return clienteMapper.clienteToClienteDTO(clienteRepository.saveAndFlush(entity));
	}

	/**
	 * Metodos para las listas de los filtros
	 */
	@Override
	public List<String> obtenerNombresFiltro(String valor) {
		return clienteRepository.obtenerListaNombresFiltro(valor);
	}
	@Override
	public List<String> obtenerCorreosFiltro(String valor) {
		return clienteRepository.obtenerListaCorreosFiltro(valor);
	}
	@Override
	public List<String> obtenerTelefonosFiltro(String valor) {
		return clienteRepository.obtenerListaTelefonosFiltro(valor);
	}
	@Override
	public List<ParametroDTO> obtenerCiudadesFiltro() {
		return parametroMapper.parametrosToParametrosDTO
				(clienteRepository.obtenerListaCiudadesFiltro());
	}

	@Override
	public List<ClienteDTO> obtenerClientesFiltro(ClienteBusquedaDTO filtro) {
		List<Cliente> listaEntity = clienteRepository.
				obtenerClientesFiltro(filtro.getNombre(), filtro.getCorreo(), filtro.getCelular(),
						filtro.getCiudad(), filtro.getFechaCreacion());
		return clienteMapper.clientesToClientesDTO(listaEntity);
	}

	@Override
	public ClienteDTO buscarCliente(Long idCliente) {
		Optional<Cliente> cliente = clienteRepository.findById(idCliente);
		if (cliente.isPresent()) {
			return clienteMapper.clienteToClienteDTO(cliente.get());
		}
		return null;
	}

	@Override
	public void eliminarCliente(ClienteDTO clienteEliminar) {
		Cliente clienteEntity = clienteMapper.clienteDTOToCliente(clienteEliminar);
		clienteRepository.delete(clienteEntity);
	}
}