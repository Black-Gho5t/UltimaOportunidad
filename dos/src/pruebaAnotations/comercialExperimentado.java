package pruebaAnotations;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ComercialExperimentado")
//@Scope("prototype")

public class comercialExperimentado implements Empleados {

	
	
	
	
	@PostConstruct
	
	public void ejecutaDespuesCreacion() {
		System.out.print("ejecuta despues de la creacion");
		}
	
	
	
	@PreDestroy
	public void ejecutaAntesDestruccion() {
		System.out.print("\n"+"ejecutando antes de la destruccion");
		
		
	}
	
	
	
	
	
	
	
	
	
	
	
	

	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "vender, vender y vender mas";
	}


	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		//return "informe generado por el comercial";
	return nuevoInf.getInformeFinanciero();
	
	
	}
	@Autowired
	@Qualifier("informeFinancieroTrim4")
	private CreacionInformeFinanciero nuevoInf;
	
}
