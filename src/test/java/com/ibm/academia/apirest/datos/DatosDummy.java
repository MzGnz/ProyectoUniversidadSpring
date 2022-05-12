package com.ibm.academia.apirest.datos;

import java.math.BigDecimal;

import com.ibm.academia.apirest.enums.TipoEmpleado;
import com.ibm.academia.apirest.models.entities.Alumno;
import com.ibm.academia.apirest.models.entities.Carrera;
import com.ibm.academia.apirest.models.entities.Direccion;
import com.ibm.academia.apirest.models.entities.Empleado;
import com.ibm.academia.apirest.models.entities.Persona;
import com.ibm.academia.apirest.models.entities.Profesor;

public class DatosDummy 
{
	public static Carrera carrera01()
	{
		return new Carrera(null, "Ingenieria en Sistemas",50,5);
	}
	
	public static Carrera carrera02()
	{
		return new Carrera(null, "Licenciatura en Sistemas",45,4);
	}
	
	public static Carrera carrera03()
	{
		return new Carrera(null, "Ingenieria en Sistemas",60,5);
	}
	
	public static Persona empleado01()
	{
		return new Empleado(null, "Lauro", "Lopez", "21212121", new Direccion(), new BigDecimal("46750.70"), TipoEmpleado.ADMINISTRATIVO);
	}
	
	public static Persona empleado02()
	{
		return new Empleado(null, "Leonardo", "Perez", "32323232", new Direccion(), new BigDecimal("56950.70"), TipoEmpleado.MANTENIMIENTO);
	}
	
	public static Persona profesor01()
	{
		return new Profesor(null, "Martin", "Camacho", "84756328", new Direccion(), new BigDecimal("60321.55"));
	}
	
	public static Persona alumno01()
	{
		return new Alumno(null, "Juan", "Benitez", "49756328", new Direccion());
	}	
	
	public static Persona alumno02()
	{
		return new Alumno(null, "Andres", "Benitez", "47456328", new Direccion());
	}
	
	public static Persona alumno03()
	{
		return new Alumno(null, "Joaquin", "Leon", "49794328", new Direccion());
	}
	
}