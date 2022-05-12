package com.ibm.academia.apirest;

public class AlumnosComandos
{
	
}
/*
@Component
public class AlumnosComandos implements CommandLineRunner
{
	@Autowired
	@Qualifier("alumnoDAOImpl")
	private PersonaDAO personaDAO;
	
	@Autowired
	private CarreraDAO carreraDAO;
	
	@Autowired
	private AlumnoDAO alumnoDAO;
	
	@Override
	public void run(String... args) throws Exception
	{
		/*Optional<Carrera> ingSistemas = carreraDAO.buscarPorId(1);
		
		Iterable<Persona> alumnos = personaDAO.buscarTodos();
		alumnos.forEach(alumno -> ((Alumno)alumno).setCarrera(ingSistemas.get()));
		alumnos.forEach(alumno -> personaDAO.guardar(alumno));
		
		Optional<Persona> alumno = alumnoDAO.buscarPorId(1);
		
		Optional<Persona> personaDni = personaDAO.buscarPorDni(alumno.get().getDni());
		System.out.println("DNI: " + personaDni.toString());
	}
	
}*/