package br.com.joaocabral.contatosrest.model;

import org.springframework.data.rest.core.config.Projection;

@Projection(name = "fullCity", types = { City.class })
public interface CityProjection {

	Long getId();
	String getName();
	boolean getCapital();
	State getState();
	
}
