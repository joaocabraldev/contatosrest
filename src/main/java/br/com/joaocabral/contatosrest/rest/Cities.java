package br.com.joaocabral.contatosrest.rest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.joaocabral.contatosrest.model.City;
import br.com.joaocabral.contatosrest.model.CityProjection;

@RepositoryRestResource(excerptProjection = CityProjection.class)
public interface Cities extends PagingAndSortingRepository<City, Long>{

}
