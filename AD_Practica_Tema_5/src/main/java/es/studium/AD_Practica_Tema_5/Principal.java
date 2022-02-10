package es.studium.AD_Practica_Tema_5;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Principal 
{
	public static void main(String[] args) 
	{				
		
		/*Abrimos el contenedor de IoC indicando la ruta exacta de	donde se encuentra el fichero beans.xml*/
		ApplicationContext appContext = new	ClassPathXmlApplicationContext("es/studium/xml/beans.xml");
		
		
		/*Obtenemos un bean Casa*/
		Casa casa1 = appContext.getBean("casa1", Casa.class);
		
		
		/*Lo mostramos por consola con el método toString() que detallamos en su POJO*/
		System.out.println(casa1.toString());
				
		
		/*Cerramos el contexto*/
		((ClassPathXmlApplicationContext) appContext).close();
	}
}



