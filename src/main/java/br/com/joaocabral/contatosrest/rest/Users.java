package br.com.joaocabral.contatosrest.rest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.joaocabral.contatosrest.model.SystemUser;

/**
 * Repositório de Usuários.
 * Ofereçe opções de Paginação e Ordenação automaticamente.
 */
@RepositoryRestResource
public interface Users extends PagingAndSortingRepository<SystemUser, Long> {

	/**
	 * Busca um Usuário por Login.
	 * @param login Login a ser pesquisado.
	 */
	SystemUser findOneByLogin(@Param("login") String login);
	
}
