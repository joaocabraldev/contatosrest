package br.com.joaocabral.contatosrest.rest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.joaocabral.contatosrest.model.SystemUser;

@RepositoryRestResource
public interface Users extends PagingAndSortingRepository<SystemUser, Long> {

	
	
}
