package pruebaAnotations;

import org.springframework.stereotype.Component;

@Component

public class InformefincieroTrim3 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "presentacion de informe favorable del trim 3";
	}

}
