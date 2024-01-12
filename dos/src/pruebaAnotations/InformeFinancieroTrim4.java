package pruebaAnotations;

import org.springframework.stereotype.Component;

@Component

public class InformeFinancieroTrim4 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "un año solo tiene cuatro trimestres?";
	}

}
