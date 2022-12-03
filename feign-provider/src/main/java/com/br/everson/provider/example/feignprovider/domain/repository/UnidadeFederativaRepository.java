package com.br.everson.provider.example.feignprovider.domain.repository;

import com.br.everson.provider.example.feignprovider.domain.model.UnidadeFederativa;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UnidadeFederativaRepository extends JpaRepository<UnidadeFederativa,Long> {
}
