package com.jasmine.erp.clientes.service.mapper;

import com.jasmine.erp.clientes.service.dto.CitaDTO;
import com.jasmine.erp.configuracion.service.mapper.ParametroMapper;
import com.jasmine.erp.entities.clientes.Cita;
import java.util.ArrayList;
import java.util.List;
import javax.annotation.Generated;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Generated(
    value = "org.mapstruct.ap.MappingProcessor",
    date = "2020-05-19T21:33:15-0500",
    comments = "version: 1.1.0.Final, compiler: Eclipse JDT (IDE) 3.20.0.v20191203-2131, environment: Java 1.8.0_151 (Oracle Corporation)"
)
@Component
public class CitaMapperImpl implements CitaMapper {

    @Autowired
    private ClienteMapper clienteMapper;
    @Autowired
    private ParametroMapper parametroMapper;

    @Override
    public CitaDTO citaToCitaDTO(Cita cita) {
        if ( cita == null ) {
            return null;
        }

        CitaDTO citaDTO = new CitaDTO();

        citaDTO.setDescripcion( cita.getDescripcion() );
        citaDTO.setCliente( clienteMapper.clienteToClienteDTO( cita.getCliente() ) );
        citaDTO.setCodigo( cita.getCodigo() );
        citaDTO.setTipoServicio( parametroMapper.parametroToParametroDTO( cita.getTipoServicio() ) );
        citaDTO.setFechaHora( cita.getFechaHora() );
        citaDTO.setSede( parametroMapper.parametroToParametroDTO( cita.getSede() ) );
        citaDTO.setId( cita.getId() );

        return citaDTO;
    }

    @Override
    public Cita citaDtoToCita(CitaDTO citaDTO) {
        if ( citaDTO == null ) {
            return null;
        }

        Cita cita = new Cita();

        cita.setDescripcion( citaDTO.getDescripcion() );
        cita.setCliente( clienteMapper.clienteDTOToCliente( citaDTO.getCliente() ) );
        cita.setCodigo( citaDTO.getCodigo() );
        cita.setTipoServicio( parametroMapper.parametroDTOToParametro( citaDTO.getTipoServicio() ) );
        cita.setFechaHora( citaDTO.getFechaHora() );
        cita.setSede( parametroMapper.parametroDTOToParametro( citaDTO.getSede() ) );
        cita.setId( citaDTO.getId() );

        return cita;
    }

    @Override
    public List<CitaDTO> citasToCitasDTO(List<Cita> listaCitas) {
        if ( listaCitas == null ) {
            return null;
        }

        List<CitaDTO> list = new ArrayList<CitaDTO>();
        for ( Cita cita : listaCitas ) {
            list.add( citaToCitaDTO( cita ) );
        }

        return list;
    }
}
