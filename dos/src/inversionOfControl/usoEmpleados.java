package inversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class usoEmpleados {

	public static void main(String[] args) {
				
		//Empleados Empleado1=new DirectorEmpleado();
		
		//System.out.println(Empleado1.getTareas());
		
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
			Empleados Juan=contexto.getBean("miEmpleado",Empleados.class);
			System.out.println(Juan.getTareas());
			contexto.close();
	
	}

}
