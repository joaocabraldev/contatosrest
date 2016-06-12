package br.com.joaocabral.contatosrest.model;

import org.springframework.data.rest.core.config.Projection;

/**
 * Projeção de Cidade.
 * Define os campos exibidos no JSON da Entidade City. 
 * @author João Antônio Cabral.
 */
@Projection(name = "fullCity", types = { City.class })
public interface CityProjection {

	Long getId();
	String getName();
	boolean getCapital();
	State getState();
	
}
