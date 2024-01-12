package pruebaAnotations;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class usoAnotationes {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext.xml");
		//Description	Resource	Path	Location	Type
		//The default superclass, "jakarta.servlet.http.HttpServlet", according to the project's Dynamic Web Module facet version (5.0), was not found on the Java Build Path.	paginaEjemplo.jsp	/Spring_dos/src/main/webapp/WEB-INF/vista	line 1	JSP Problem

		
		Empleados Antonio=contexto.getBean("ComercialExperimentado", Empleados.class);
		
		System.out.println(Antonio.getTareas());
		System.out.print(Antonio.getInformes());
		contexto.close();
	}

}
