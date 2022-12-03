package com.br.everson.open.feign.example.feignclient.api.consumer;

import com.br.everson.open.feign.example.feignclient.domain.dto.output.UnidadeFederativaOutputDTO;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.List;

@FeignClient(value = "global-consumer", url = "${feign.client.url.global}")
public interface GlobalConsumerFeign {

    @RequestMapping(method = RequestMethod.GET, value = "/unidade-federativa")
    List<UnidadeFederativaOutputDTO> findAll();
}
