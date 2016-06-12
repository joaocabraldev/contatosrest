package br.com.joaocabral.contatosrest.config;

import org.springframework.boot.context.embedded.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.rest.core.config.RepositoryRestConfiguration;
import org.springframework.data.rest.webmvc.config.RepositoryRestMvcConfiguration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

import br.com.joaocabral.contatosrest.model.City;
import br.com.joaocabral.contatosrest.model.State;
import br.com.joaocabral.contatosrest.model.User;

/**
 * Configurações personalizadas da aplicação.
 * @author João Antônio Cabral.
 */
@Configuration
public class MainConfig extends RepositoryRestMvcConfiguration {

	/**
	 * Bean de configuração de CORS.
	 * @return Configurações de CORS.
	 */
	@Bean
	public FilterRegistrationBean corsFilter() {
		UrlBasedCorsConfigurationSource source = new UrlBasedCorsConfigurationSource();
		
		CorsConfiguration config = new CorsConfiguration();
		config.setAllowCredentials(true);
		config.addAllowedOrigin("*");
		config.addAllowedHeader("*");
		config.addAllowedMethod("OPTIONS");
	    config.addAllowedMethod("HEAD");
	    config.addAllowedMethod("GET");
	    config.addAllowedMethod("PUT");
	    config.addAllowedMethod("POST");
	    config.addAllowedMethod("DELETE");
	    config.addAllowedMethod("PATCH");
	    
	    source.registerCorsConfiguration("/**", config);
	    final FilterRegistrationBean bean = new FilterRegistrationBean(new CorsFilter(source));
	    bean.setOrder(0);
	    return bean;
	}
	
	/**
	 * Método de configuração REST.
	 */
	@Override
    protected void configureRepositoryRestConfiguration(RepositoryRestConfiguration config) {
		config.setBasePath("/rest");
		config.exposeIdsFor(State.class, City.class, User.class);
    }
	
}