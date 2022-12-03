package com.br.everson.open.feign.example.feignclient.api.controller;

import com.br.everson.open.feign.example.feignclient.domain.dto.output.EnderecoOutputDTO;
import com.br.everson.open.feign.example.feignclient.domain.service.EnderecoService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Objects;

@RestController
@RequestMapping("/endereco")
public class EnderecoController {

    @Autowired
    EnderecoService enderecoService;

    @GetMapping("/buscar/{cep}")
    public ResponseEntity<EnderecoOutputDTO> pesquisarEndereco(@PathVariable String cep){
        EnderecoOutputDTO endereco = enderecoService.pesquisarEndereco(cep);

        if(Objects.isNull(endereco.getLocalidade())){
            return ResponseEntity.status(HttpStatus.NO_CONTENT).build();
        }

        return ResponseEntity.ok().body(endereco);
    }

}
