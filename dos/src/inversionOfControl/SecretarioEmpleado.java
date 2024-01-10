package inversionOfControl;

public class SecretarioEmpleado implements Empleados {

	@Override
	
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la agenda de los jefes";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Informe generado por el secretario: "+informeNuevo.getInforme();
	}

	private CreacionInformes informeNuevo;
	private String email;
	private String nomEmpresa;

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getNomEmpresa() {
		return nomEmpresa;
	}

	public void setNomEmpresa(String nomEmpresa) {
		this.nomEmpresa = nomEmpresa;
	}

	public void setInformeNuevo(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}
	
}
