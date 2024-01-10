package inversionOfControl;

public class jefeEmpleado implements Empleados{
	public jefeEmpleado(CreacionInformes informeNuevo) {
		this.informeNuevo = informeNuevo;
	}

	private CreacionInformes informeNuevo;
	public String getTareas(){
		
		return "Gestiono las cuestiones relativas a mis empleados de seccion";
		
	}

	@Override
	public String getInformes() {
		// TODO Auto-generated method stub
		return "Informe presentado por el jefe: " + informeNuevo.getInforme();
	}

}
