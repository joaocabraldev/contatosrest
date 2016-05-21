package br.com.joaocabral.contatosrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.joaocabral.contatosrest.model.City;
import br.com.joaocabral.contatosrest.rest.Cities;

@RestController
@RequestMapping("/api")
public class CitiesController {

	@Autowired
	private Cities cities;
	
	@RequestMapping("/cities")
	public Iterable<City> listAll() {
		Iterable<City> citiesList = cities.findAll();
		return citiesList;
	}
	
}
