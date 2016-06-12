package br.com.joaocabral.contatosrest.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Controlador padrão da aplicação.
 * Utilizado somente para a página inicial Index.
 * @author João Antônio Cabral.
 */
@Controller
public class IndexController {

	/**
	 * Método de navegação para index.
	 * @return Retorna para a página index.
	 */
	@RequestMapping("/")
	public String index() {
		return "index";
	}
	
}
