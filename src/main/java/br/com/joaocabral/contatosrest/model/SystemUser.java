package br.com.joaocabral.contatosrest.model;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import com.fasterxml.jackson.annotation.JsonIgnore;

/**
 * Entidade de Usuário.
 * @author João Antônio Cabral.
 */
@Entity
public class SystemUser implements Serializable {

	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String name;
	private String login;
	@JsonIgnore
	private String password;

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
	 * Obtém o valor de login.
	 * @return O valor de login.
	 */
	public String getLogin() {
		return login;
	}

	/**
	 * Define o valor de login.
	 * @param login Novo valor para login.
	 */
	public void setLogin(String login) {
		this.login = login;
	}

	/**
	 * Obtém o valor de password.
	 * @return O valor de password.
	 */
	public String getPassword() {
		return password;
	}

	/**
	 * Define o valor de password.
	 * @param password Novo valor para password.
	 */
	public void setPassword(String password) {
		this.password = password;
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
		SystemUser other = (SystemUser) obj;
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
