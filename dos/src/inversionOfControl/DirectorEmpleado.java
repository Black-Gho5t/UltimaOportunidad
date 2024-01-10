package inversionOfControl;

public class DirectorEmpleado implements Empleados {

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

	private CreacionInformes informeNuevo;
	
	public DirectorEmpleado(CreacionInformes InformeNuevo) {
		this.informeNuevo=InformeNuevo;
		
		
	}
	
	
	@Override
	public String getTareas() {
		// TODO Auto-generated method stub
		return "Gestionar la plantilla de la empresa";
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Informe creado por el director: "+ informeNuevo.getInforme();
	}

}
