package br.com.joaocabral.contatosrest.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class City {

	@Id
	@GeneratedValue
	private Long id;
	private String name;
	private boolean capital;
	@ManyToOne
	@JoinColumn(name = "id")
	private State state;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean isCapital() {
		return capital;
	}

	public void setCapital(boolean capital) {
		this.capital = capital;
	}

	public State getState() {
		return state;
	}

	public void setState(State state) {
		this.state = state;
	}

}
