package com.jasmine.erp.clientes.service.mapper;

import com.jasmine.erp.clientes.service.dto.ClienteDTO;
import com.jasmine.erp.configuracion.service.mapper.ParametroMapper;
import com.jasmine.erp.entities.clientes.Cliente;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-19T20:53:38-0500",
    comments = "version: 1.1.0.Final, compiler: Eclipse JDT (IDE) 3.20.0.v20191203-2131, environment: Java 1.8.0_151 (Oracle Corporation)"
)
@Component
public class ClienteMapperImpl implements ClienteMapper {

    @Autowired
    private ParametroMapper parametroMapper;

    @Override
    public ClienteDTO clienteToClienteDTO(Cliente cliente) {
        if ( cliente == null ) {
            return null;
        }

        ClienteDTO clienteDTO = new ClienteDTO();

        clienteDTO.setCiudad( parametroMapper.parametroToParametroDTO( cliente.getCiudad() ) );
        clienteDTO.setFechaCreacion( cliente.getFechaCreacion() );
        clienteDTO.setId( cliente.getId() );
        clienteDTO.setTelefono( cliente.getTelefono() );
        clienteDTO.setNombre( cliente.getNombre() );
        clienteDTO.setEmail( cliente.getEmail() );

        return clienteDTO;
    }

    @Override
    public Cliente clienteDTOToCliente(ClienteDTO clienteDTO) {
        if ( clienteDTO == null ) {
            return null;
        }

        Cliente cliente = new Cliente();

        cliente.setCiudad( parametroMapper.parametroDTOToParametro( clienteDTO.getCiudad() ) );
        cliente.setFechaCreacion( clienteDTO.getFechaCreacion() );
        cliente.setId( clienteDTO.getId() );
        cliente.setTelefono( clienteDTO.getTelefono() );
        cliente.setNombre( clienteDTO.getNombre() );
        cliente.setEmail( clienteDTO.getEmail() );

        return cliente;
    }

    @Override
    public List<ClienteDTO> clientesToClientesDTO(List<Cliente> clientes) {
        if ( clientes == null ) {
            return null;
        }

        List<ClienteDTO> list = new ArrayList<ClienteDTO>();
        for ( Cliente cliente : clientes ) {
            list.add( clienteToClienteDTO( cliente ) );
        }

        return list;
    }
}
