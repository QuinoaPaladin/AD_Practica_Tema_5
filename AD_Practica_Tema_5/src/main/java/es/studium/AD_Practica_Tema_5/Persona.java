package es.studium.AD_Practica_Tema_5;

public class Persona 
{
	
	/* Declaramos los atributos de nuestro POJO */
	
	private String nombre;

	/* Creamos el constructor vac�o */
	
	public Persona()
	{
		this.nombre="";
	}
	
	/* Creamos el constructor por par�metros */
	
	public Persona (String nombre)
	{
		this.nombre = nombre;
	}
	
	/* Creamos los m�todos getters, setters y toString */
	
	public String getNombre()
	{
		return nombre;
	}

	public void setNombre(String nombre)
	{
		this.nombre = nombre;
	}

	public String toString()
	{
		return "Persona [nombre = " + nombre + "]";
	}
}
