package com.br.everson.provider.example.feignprovider.api.controller;

import com.br.everson.provider.example.feignprovider.domain.dto.output.UnidadeFederativaOutputDTO;
import com.br.everson.provider.example.feignprovider.domain.service.UnidadeFederativaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/unidade-federativa")
public class UnidadeFederativaController {

    @Autowired
    UnidadeFederativaService unidadeFederativaService;

    @GetMapping
    public ResponseEntity<List<UnidadeFederativaOutputDTO>> findAll(){
        return ResponseEntity.ok().body(unidadeFederativaService.findAll());
    }
}
