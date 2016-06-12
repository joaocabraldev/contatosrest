package br.com.joaocabral.contatosrest.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

/**
 * Entidade de Cidade. 
 * @author João Antônio Cabral.
 */
@Entity
public class City implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private boolean capital;
	
	@ManyToOne(targetEntity=State.class)
	private State state;

	/**
	 * Obtém o valor de id.
	 * @return O valor de id.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Define o valor de id.
	 * @param id Novo valor para id.
	 */
	public void setId(Long id) {
		this.id = id;
	}

	/**
	 * Obtém o valor de name.
	 * @return O valor de name.
	 */
	public String getName() {
		return name;
	}

	/**
	 * Define o valor de name.
	 * @param name Novo valor para name.
	 */
	public void setName(String name) {
		this.name = name;
	}

	/**
	 * Obtém o valor de capital.
	 * @return O valor de capital.
	 */
	public boolean isCapital() {
		return capital;
	}

	/**
	 * Define o valor de capital.
	 * @param capital Novo valor para capital.
	 */
	public void setCapital(boolean capital) {
		this.capital = capital;
	}

	/**
	 * Obtém o valor de state.
	 * @return O valor de state.
	 */
	public State getState() {
		return state;
	}

	/**
	 * Define o valor de state.
	 * @param state Novo valor para state.
	 */
	public void setState(State state) {
		this.state = state;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		City other = (City) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return name;
	}
	
}
