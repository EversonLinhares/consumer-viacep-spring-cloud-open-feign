package com.br.everson.open.feign.example.feignclient.domain.service.exception;

public class CepInvalidoException extends RuntimeException{

    public CepInvalidoException(String msg) {
        super(msg);
    }
}
