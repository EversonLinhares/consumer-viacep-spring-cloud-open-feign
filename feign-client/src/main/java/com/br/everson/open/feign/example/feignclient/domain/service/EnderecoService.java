package com.br.everson.open.feign.example.feignclient.domain.service;

import com.br.everson.open.feign.example.feignclient.api.consumer.ViaCepConsumerFeign;
import com.br.everson.open.feign.example.feignclient.domain.dto.output.EnderecoOutputDTO;
import com.br.everson.open.feign.example.feignclient.domain.service.exception.CepInvalidoException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EnderecoService {
    @Autowired
    ViaCepConsumerFeign viacep;
    public EnderecoOutputDTO pesquisarEndereco(String cep) {
        if (cep.length() != 8) throw new CepInvalidoException("O CEP informado não é válido.");

        EnderecoOutputDTO endereco = viacep.pesquisarCep(cep);

        return endereco;
    }
}
