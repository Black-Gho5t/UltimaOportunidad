package pruebaAnotations;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@ComponentScan("pruebaAnotations")
@PropertySource("classpath:datosEmpresa.propiedades")
public class EmpleadosConfig {

	@Bean
	public CreacionInformeFinanciero informeFinancieroDtoCompras() {
		return new informeFinancieroDtoCompras();
		
}
	@Bean
	public Empleados directorFinanciero() {
		return new DirectorFinanciero(informeFinancieroDtoCompras());
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
}
