package com.ibm.academia.apirest;

public class Comandos 
{
	
}

/*@Component
public class Comandos implements CommandLineRunner
{	
	@Autowired
	private CarreraDAO carreraDAO;
	
	@Autowired
	private PersonaDAO personaDAO;
	
	@Override
	public void run(String... args) throws Exception
	{
		/*Carrera finanzas = new Carrera(null, "Ingenieria en finanzas",20,3);
		Carrera carreraGuardada = carreraDAO.guardar(finanzas);
		System.out.println(carreraGuardada.toString());
		
		/*Optional<Carrera> oCarrera = carreraDAO.buscarPorId(1);
		System.out.println(oCarrera.toString());*/
		
		/*Carrera carrera = null;
		
		Optional<Carrera> oCarrera = carreraDAO.buscarPorId(55);
		if(oCarrera.isPresent())
		{
			carrera = oCarrera.get();
			System.out.println(carrera.toString());
		}
		else
		{
			System.out.println("Carrera no encontrada");
		}
		carrera.setCantidadAnios(7);
		carrera.setCantidadMaterias(33);
		carreraDAO.guardar(carrera);
		
		System.out.println(carreraDAO.buscarPorId(7).orElse(new Carrera()).toString());
	
		carreraDAO.eliminarPorId(3);
		System.out.println(carreraDAO.buscarPorId(3).orElse(new Carrera()).toString());*/
		
		
		/*Carrera ingSistemas= new Carrera(null,"Ingenieria en Sistemas",60,5);
		Carrera ingIndustrial= new Carrera(null,"Ingenieria Industrial ",55,5);
		Carrera ingAlimentos= new Carrera(null,"Ingenieria en Alimentos ",53,5);
		Carrera ingElectronica= new Carrera(null,"Ingenieria en Electronica",45,5);
		Carrera licSistemas= new Carrera(null,"Licenciatura en Sistemas",40,4);
		Carrera licTurismo= new Carrera(null,"Licenciatura en Turismo",42,4);
		Carrera licYoga= new Carrera(null,"Licenciatura en Yoga",25,3);
		Carrera licRecursos= new Carrera(null,"Licenciatura en Recursos Humanos",33,3);
		
		carreraDAO.guardar(ingSistemas);
		carreraDAO.guardar(ingIndustrial);
		carreraDAO.guardar(ingAlimentos);
		carreraDAO.guardar(ingElectronica);
		carreraDAO.guardar(licSistemas);
		carreraDAO.guardar(licTurismo);
		carreraDAO.guardar(licYoga);
		carreraDAO.guardar(licRecursos);*/
		
		/*Optional<Carrera> ingSistemas = carreraDAO.buscarPorId(2);
		
		Iterable<Persona> alumnos = personaDAO.buscarTodos();
		alumnos.forEach(alumno -> ((Alumno) alumno).setCarrera(ingSistemas.get()));
		alumnos.forEach(alumno -> personaDAO.guardar(alumno));*/
		
		/*Optional<Carrera> ingSistemas = carreraDAO.buscarPorId(2);
		Iterable<Persona> alumnosCarrera = ((AlumnoDAO) personaDAO).buscarAlumnoPorNombreCarrera(ingSistemas.get().getNombre());
		alumnosCarrera.forEach(System.out::println);*/
		
		/*List<Carrera> carreras = (List<Carrera>)carreraDAO.findCarrerasByNombreContains("Sistemas");
		carreras.forEach(System.out::println);*/
		
		/*List<Carrera> carrerasIgnoreCase1 = (List<Carrera>) carreraDAO.findCarrerasByNombreContainsIgnoreCase("SISTEMAS");
		List<Carrera> carrerasIgnoreCase2 = (List<Carrera>) carreraDAO.findCarrerasByNombreContainsIgnoreCase("sistemas");
		carrerasIgnoreCase1.forEach(System.out::println);
		carrerasIgnoreCase2.forEach(System.out::println);*/
		
		/*List<Carrera> carrerasPorAnio = (List<Carrera>) carreraDAO.findCarrerasByCantidadAniosAfter(3);
		carrerasPorAnio.forEach(System.out::println);*/
		
		/*Optional<Persona> persona = personaDAO.buscarPorId(2);
		System.out.println(persona.toString());
		
	}}*/