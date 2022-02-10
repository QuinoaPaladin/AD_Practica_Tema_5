package es.studium.AD_Practica_Tema_5;

public class Habitacion 
{
	/* Declaramos los atributos de nuestro POJO */
	private String nombreHabitacion;
	private int pisoHabitacion;
	private boolean tieneVentana;
	private Persona persona;
	
	/* Creamos el constructor vacío */
	public Habitacion()
	{
		this.nombreHabitacion="";
		this.pisoHabitacion = 0;
		this.tieneVentana = false;
		this.persona = null;
	}
	
	/* Creamos el constructor por parámetros */
	public Habitacion (String nombreHabitacion, int pisoHabitacion, boolean tieneVentana, Persona persona)
	{
		this.nombreHabitacion = nombreHabitacion;
		this.pisoHabitacion = pisoHabitacion;
		this.tieneVentana = tieneVentana;
		this.persona = persona;
	}
	
	/* Creamos los métodos getters, setters y toString */
	public String getNombreHabitacion()
	{
		return nombreHabitacion;
	}
	public void setNombreHabitacion(String nombreHabitacion)
	{
		this.nombreHabitacion = nombreHabitacion;
	}
	public int getPisoHabitacion()
	{
		return pisoHabitacion;
	}
	public void setPisoHabitacion(int pisoHabitacion)
	{
		this.pisoHabitacion = pisoHabitacion;
	}
	public boolean getTieneVentana()
	{
		return tieneVentana;
	}
	public void setTieneVentana(boolean tieneVentana)
	{
		this.tieneVentana = tieneVentana;
	}
	public Persona getPersona()
	{
		return persona;
	}
	public void setPersona(Persona persona)
	{
		this.persona = persona;
	}
	public String toString()
	{
		return " \n Habitacion [nombreHabitacion = " + nombreHabitacion + ", pisoHabitacion = "+ pisoHabitacion + ", tieneVentana = " + tieneVentana + ", Persona = " + persona +  "]";
	}
}
