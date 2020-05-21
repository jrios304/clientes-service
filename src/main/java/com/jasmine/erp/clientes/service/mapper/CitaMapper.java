package com.jasmine.erp.clientes.service.mapper;

import java.util.List;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;

import com.jasmine.erp.clientes.service.dto.CitaDTO;
import com.jasmine.erp.configuracion.service.mapper.ParametroMapper;
import com.jasmine.erp.entities.clientes.Cita;

@Mapper(uses = {ClienteMapper.class, ParametroMapper.class})
public interface CitaMapper {

	
	@Mapping(source = "cita.id", target = "id")
	@Mapping(source = "cita.tipoServicio", target = "tipoServicio")
	@Mapping(source = "cita.codigo", target = "codigo")
	@Mapping(source = "cita.descripcion", target = "descripcion")
	@Mapping(source = "cita.fechaHora", target = "fechaHora")
	@Mapping(source = "cita.sede", target = "sede")
	@Mapping(source = "cita.cliente", target = "cliente")
	CitaDTO citaToCitaDTO(Cita cita);
	
	@Mapping(source = "citaDTO.id", target = "id")
	@Mapping(source = "citaDTO.tipoServicio", target = "tipoServicio")
	@Mapping(source = "citaDTO.codigo", target = "codigo")
	@Mapping(source = "citaDTO.descripcion", target = "descripcion")
	@Mapping(source = "citaDTO.fechaHora", target = "fechaHora")
	@Mapping(source = "citaDTO.sede", target = "sede")
	@Mapping(source = "citaDTO.cliente", target = "cliente")
	Cita citaDtoToCita(CitaDTO citaDTO);
	
	List<CitaDTO> citasToCitasDTO(List<Cita> listaCitas);
}
