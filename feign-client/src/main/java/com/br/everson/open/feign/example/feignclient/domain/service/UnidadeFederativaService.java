package com.br.everson.open.feign.example.feignclient.domain.service;

import com.br.everson.open.feign.example.feignclient.api.consumer.GlobalConsumerFeign;
import com.br.everson.open.feign.example.feignclient.domain.dto.output.UnidadeFederativaOutputDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UnidadeFederativaService {

    @Autowired
    GlobalConsumerFeign globalConsumerFeign;

    public List<UnidadeFederativaOutputDTO> findAll(){
        return globalConsumerFeign.findAll();
    }
}
