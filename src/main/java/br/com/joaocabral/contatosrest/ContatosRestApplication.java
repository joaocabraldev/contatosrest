package br.com.joaocabral.contatosrest;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Import;

import br.com.joaocabral.contatosrest.config.MainConfig;

@SpringBootApplication
@Import(MainConfig.class)
public class ContatosRestApplication {

	public static void main(String[] args) {
		SpringApplication.run(ContatosRestApplication.class, args);
	}
}
