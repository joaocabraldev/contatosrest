package br.com.joaocabral.contatosrest.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.joaocabral.contatosrest.model.City;
import br.com.joaocabral.contatosrest.rest.Cities;

@RestController
@RequestMapping("/api")
public class CitiesController {

	@Autowired
	private Cities cities;
	
	@RequestMapping(name = "/cities", method = RequestMethod.GET)
	public Iterable<City> listAll() {
		Iterable<City> citiesList = cities.findAll();
		return citiesList;
	}
	
	@RequestMapping("/cities/{id}")
	public City getById(@PathVariable Long id) {
		return cities.findOne(id);
	}
	
	@RequestMapping(name = "/cities/save", method = RequestMethod.POST)
	public void save(@RequestBody City city) {
		cities.save(city);
	}
	
}
