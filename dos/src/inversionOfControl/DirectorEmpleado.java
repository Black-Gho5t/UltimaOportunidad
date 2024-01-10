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

	
	public void metodoInicial(){
		System.out.println("dentro del metodo init. Aqui irian las tareas a ejecutar antes de que el bean este listo");
		}
	
	
	public void metodoFinal(){
		System.out.println("dentro del metodo destroy. Aqui irian las tareas a ejecutar antes de que el bean muera");
		}
	
	
	
	
	
	
	
	
}
