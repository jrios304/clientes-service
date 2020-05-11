package com.jasmine.erp.clientes.service.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.jasmine.erp.clientes.service.dto.ClienteDTO;
import com.jasmine.erp.configuracion.service.mapper.ParametroMapper;
import com.jasmine.erp.entities.clientes.Cliente;

@Mapper(uses = ParametroMapper.class)
public interface ClienteMapper {

	@Mapping(source = "cliente.id", target = "id")
	@Mapping(source = "cliente.nombre", target = "nombre")
	@Mapping(source = "cliente.email", target = "email")
	@Mapping(source = "cliente.telefono", target = "telefono")
	@Mapping(source = "cliente.ciudad", target = "ciudad")
	@Mapping(source = "cliente.fechaCreacion", target = "fechaCreacion")
	ClienteDTO clienteToClienteDTO(Cliente cliente);
	
	@Mapping(source = "clienteDTO.id", target = "id")
	@Mapping(source = "clienteDTO.nombre", target = "nombre")
	@Mapping(source = "clienteDTO.email", target = "email")
	@Mapping(source = "clienteDTO.telefono", target = "telefono")
	@Mapping(source = "clienteDTO.ciudad", target = "ciudad")
	@Mapping(source = "clienteDTO.fechaCreacion", target = "fechaCreacion")
	Cliente clienteDTOToCliente(ClienteDTO clienteDTO);
	
	List<ClienteDTO> clientesToClientesDTO(List<Cliente> clientes);
}
