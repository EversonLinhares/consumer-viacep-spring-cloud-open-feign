package com.br.everson.open.feign.example.feignclient.api.controller;

import com.br.everson.open.feign.example.feignclient.domain.dto.output.UnidadeFederativaOutputDTO;
import com.br.everson.open.feign.example.feignclient.domain.service.UnidadeFederativaService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
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
        try {
            return ResponseEntity.ok().body(unidadeFederativaService.findAll());
        }catch (Exception e){
            return ResponseEntity.status(HttpStatus.NOT_FOUND).build();
        }
    }
}
