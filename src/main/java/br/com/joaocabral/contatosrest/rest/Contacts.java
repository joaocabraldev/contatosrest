package br.com.joaocabral.contatosrest.rest;

import org.springframework.data.repository.PagingAndSortingRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import br.com.joaocabral.contatosrest.model.Contact;

@RepositoryRestResource
public interface Contacts extends PagingAndSortingRepository<Contact, Long>{

}
