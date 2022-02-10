package es.studium.AD_Practica_Tema_5;
import java.util.List;
public class Casa 
{
	/* Declaramos los atributos de nuestro POJO */
	private String nombreCasa;
	private List<Habitacion> habitaciones;
	private Persona propietario;
	/* Creamos el constructor vacío */
	public Casa()
	{
		this.nombreCasa="";
		this.habitaciones = null;
		this.propietario = null;
	}
	/* Creamos el constructor por parámetros */
	public Casa (String nombreCasa, List<Habitacion> habitaciones, Persona propietario)
	{
		this.nombreCasa = nombreCasa;
		this.habitaciones = habitaciones;
		this.propietario = propietario;
	}	
	/* Creamos los métodos getters, setters y toString */
	public String getNombreCasa()
	{
		return nombreCasa;
	}
	public void setNombreCasa(String nombreCasa)
	{
		this.nombreCasa = nombreCasa;
	}
	public List<Habitacion> getHabitaciones()
	{
		return habitaciones;
	}
	public void setHabitaciones(List <Habitacion> habitaciones)
	{
		this.habitaciones = habitaciones;
	}
	public Persona getPropietario()
	{
		return propietario;
	}
	public void setPropietario(Persona propietario)
	{
		this.propietario = propietario;
	}
	public String toString()
	{
		return "Casa [ nombreCasa = " + nombreCasa + ", habitaciones = " + habitaciones + ", \n propietario = " + propietario + "]";
	}
	
}
