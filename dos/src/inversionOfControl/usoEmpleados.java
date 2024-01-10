package inversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class usoEmpleados {

	public static void main(String[] args) {
				
		//Empleados Empleado1=new DirectorEmpleado();
		
		//System.out.println(Empleado1.getTareas());
		
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
			//DirectorEmpleado Juan=contexto.getBean("miEmpleado", DierctorEmpleado.class);
		
		    DirectorEmpleado Juan=contexto.getBean("miEmpleado",DirectorEmpleado.class);
			System.out.println(Juan.getTareas());
			System.out.println(Juan.getInformes());
			System.out.println(Juan.getEmail());
			System.out.println(Juan.getNomEmpresa());
		
		/*SecretarioEmpleado Maria=contexto.getBean("miSecretario",SecretarioEmpleado.class);
		SecretarioEmpleado Pedro=contexto.getBean("miSecretario",SecretarioEmpleado.class);
		System.out.println(Maria.getTareas());
		System.out.println(Maria.getInformes());
		System.out.println("Email: "+Maria.getEmail());
		System.out.println(Maria.getNomEmpresa());
		System.out.println("Email de Pedro: "+Pedro.getEmail());
			*/contexto.close();
		
		
	
	}

}
