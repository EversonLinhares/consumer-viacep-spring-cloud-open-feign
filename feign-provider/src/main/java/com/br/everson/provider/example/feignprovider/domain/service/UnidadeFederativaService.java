package com.br.everson.provider.example.feignprovider.domain.service;

import com.br.everson.provider.example.feignprovider.domain.dto.output.UnidadeFederativaOutputDTO;
import com.br.everson.provider.example.feignprovider.domain.model.UnidadeFederativa;
import com.br.everson.provider.example.feignprovider.domain.repository.UnidadeFederativaRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class UnidadeFederativaService {
    @Autowired
    ModelMapper modelMapper;
    @Autowired
    UnidadeFederativaRepository unidadeFederativaRepository;

    public List<UnidadeFederativaOutputDTO> findAll(){
        return unidadeFederativaRepository.findAll().stream().map(uf -> modelMapper.map(uf, UnidadeFederativaOutputDTO.class)).collect(Collectors.toList());
    }
}
