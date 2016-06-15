/**
 * 
 */
package br.com.joaocabral.contatosrest.model;

import org.springframework.data.rest.core.config.Projection;

/**
 * Projeção de Usuário.
 * Define os campos exibidos no JSON da Entidade SystemUser.
 * @author João Antônio Cabral.
 */
@Projection(name = "fullUser", types = { SystemUser.class })
public interface SystemUserProjection {

	Long getId();
	String getName();
	String getLogin();
	String getPassword();
	
}
