package br.com.joaocabral.contatosrest.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

/**
 * Entidade de Estado.
 * @author João Antônio Cabral.
 */
@Entity
public class State implements Serializable {
	
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String initials;

	/**
	 * Obtém o valor de ID.
	 * @return O valor de ID.
	 */
	public Long getId() {
		return id;
	}

	/**
	 * Define um novo valor para ID.
	 * @param id Novo valor para ID.
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
	 * Define um novo valor para name.
	 * @param name O valor de name.
	 */
	public void setName(String name) {
		this.name = name;
	}
	
	/**
	 * Obtém o valor de initials.
	 * @return O valor de initials.
	 */
	public String getInitials() {
		return initials;
	}

	/**
	 * Define um novo valor para initials.
	 * @param initials Novo valor para initials.
	 */
	public void setInitials(String initials) {
		this.initials = initials;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
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
		State other = (State) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		return true;
	}

	@Override
	public String toString() {
		return name;
	}
	
}