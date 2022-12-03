package com.br.everson.open.feign.example.feignclient.domain.dto.output;

import lombok.Data;

@Data
public class EnderecoOutputDTO {
    private String cep;
    private String logradouro;
    private String complemento;
    private String bairro;
    private String localidade;
    private String uf;
}
