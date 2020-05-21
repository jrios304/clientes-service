package com.jasmine.erp.clientes.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.jasmine.erp.clientes.service.dto.CitaBusquedaDTO;
import com.jasmine.erp.clientes.service.dto.CitaDTO;
import com.jasmine.erp.clientes.service.mapper.CitaMapper;
import com.jasmine.erp.configuracion.service.dto.ParametroDTO;
import com.jasmine.erp.configuracion.service.mapper.ParametroMapper;
import com.jasmine.erp.entities.clientes.Cita;
import com.jasmine.erp.repositories.clientes.CitaRepository;

/**
 * Servicio con la logica del negocio para la entidad Cita
 * @author jrios
 *
 */
@Transactional
@Service
public class CitaService implements CitaServiceInterface{
	
	@Autowired
	CitaMapper citaMapper;
	@Autowired
	ParametroMapper parametroMapper;
	@Autowired
	CitaRepository citaRepository;

	@Override
	public CitaDTO actualizarCita(CitaDTO cita) {
		Cita citaEntity = citaMapper.citaDtoToCita(cita);
		return citaMapper.citaToCitaDTO(citaRepository.saveAndFlush(citaEntity));
	}

	@Override
	public List<String> obtenerListaCodigoFiltro(String valor) {
		return citaRepository.obtenerListaCodigoFiltro(valor);
	}

	@Override
	public List<ParametroDTO> obtenerListaTipoServicioFiltro() {
		return parametroMapper.parametrosToParametrosDTO(citaRepository.obtenerListaTipoServicioFiltro());
	}

	@Override
	public List<ParametroDTO> obtenerListaSedeFiltro() {
		return parametroMapper.parametrosToParametrosDTO(citaRepository.obtenerListaSedeFiltro());
	}

	@Override
	public List<String> obtenerListaClienteFiltro(String valor) {
		return citaRepository.obtenerListaClienteFiltro(valor);
	}

	@Override
	public List<CitaDTO> obtenerCitasFiltro(CitaBusquedaDTO filtro) {
		return citaMapper.citasToCitasDTO(citaRepository.obtenerCitasFiltro
				(filtro.getCodigo(), filtro.getTipoServicio(), filtro.getFecha(), filtro.getSede(), filtro.getCliente()));
	}

	@Override
	public CitaDTO buscarCita(Long idCita) {
		Optional<Cita> cita = citaRepository.findById(idCita);
		if(cita.isPresent()) {
			return citaMapper.citaToCitaDTO(cita.get());
		}
		return null;
	}

	@Override
	public void eliminarCita(CitaDTO citaEliminar) {
		Cita citaEntity = citaMapper.citaDtoToCita(citaEliminar);
		citaRepository.delete(citaEntity);
	}
}
