package com.br.everson.open.feign.example.feignclient.api.consumer;

import com.br.everson.open.feign.example.feignclient.domain.dto.output.EnderecoOutputDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient(value = "viacep-consumer", url = "${feign.client.url.viacep}")
public interface ViaCepConsumerFeign {

    @RequestMapping(method = RequestMethod.GET, value = "/{cep}/json")
    EnderecoOutputDTO pesquisarCep(@PathVariable String cep);
}
