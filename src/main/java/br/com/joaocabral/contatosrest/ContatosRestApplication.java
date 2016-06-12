package br.com.joaocabral.contatosrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import br.com.joaocabral.contatosrest.config.MainConfig;

/**
 * Classe principal da aplicação spring boot.
 * Utiliza as configurações padrão e importa as configurações personalizadas de MainConfig.
 * @author João Antônio Cabral.
 */
@SpringBootApplication
@Import(MainConfig.class)
public class ContatosRestApplication {

	/**
	 * Classe principal da aplicação. 
	 * @param args Argumentos da aplicação principal. 
	 */
	public static void main(String[] args) {
		SpringApplication.run(ContatosRestApplication.class, args);
	}
}
