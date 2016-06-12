package br.com.joaocabral.contatosrest.rest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.joaocabral.contatosrest.model.User;

@RepositoryRestResource
public interface Users extends PagingAndSortingRepository<User, Long> {

	/**
	 * Busca Usuário por usuário e senha.
	 * @param login Login a ser pesquisado.
	 * @param password Senha a ser pesquisada.
	 * @return Usuário com login e senha especificados.
	 */
	public User findOneByLoginandPassword(String login, String password);
	
}
