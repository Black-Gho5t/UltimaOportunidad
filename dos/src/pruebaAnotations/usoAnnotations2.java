package pruebaAnotations;

import javax.swing.JOptionPane;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class usoAnnotations2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		//ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
		
		AnnotationConfigApplicationContext contexto=new AnnotationConfigApplicationContext(EmpleadosConfig.class);
		
		//Empleados empleado=contexto.getBean("directorFinanciero",Empleados.class);
		
		DirectorFinanciero empleado=contexto.getBean("directorFinanciero",DirectorFinanciero.class);
		
		System.out.println("\n"+"Email del director: "+empleado.getEmail());
		System.out.println("Nombre de la empresa: "+empleado.getNombreEmpresa()); 
		
						contexto.close();

		
		
	}

}
