package inversionOfControl;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class usoDemoSingletonProttotype {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext contexto=new ClassPathXmlApplicationContext("applicationContext2.xml");
			//peticion de beans al contenedor
		SecretarioEmpleado Pedro=contexto.getBean("miSecretario",SecretarioEmpleado.class);
		
		SecretarioEmpleado Maria=contexto.getBean("miSecretario",SecretarioEmpleado.class);
		
		SecretarioEmpleado manolo=contexto.getBean("miSecretario",SecretarioEmpleado.class);
		
		SecretarioEmpleado juan=contexto.getBean("miSecretario",SecretarioEmpleado.class);
		
		SecretarioEmpleado ana=contexto.getBean("miSecretario",SecretarioEmpleado.class);
		System.out.println(ana);
		System.out.println(juan);
		System.out.println(manolo);
			System.out.println(Maria);
			System.out.print(Pedro);
			/*	if(Maria==Pedro){
					System.out.println("Apuntan al mismo objeto");
					}else {
						System.out.println("No se trata del mismo objetos");
					}*/
			
	}

}
