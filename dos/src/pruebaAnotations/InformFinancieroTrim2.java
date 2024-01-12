package pruebaAnotations;

import org.springframework.stereotype.Component;

@Component

public class InformFinancieroTrim2 implements CreacionInformeFinanciero {

	@Override
	public String getInformeFinanciero() {
		// TODO Auto-generated method stub
		return "Presentacion de informe catastrofico del trmestre 2";
	}

}
