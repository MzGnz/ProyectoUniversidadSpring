package com.ibm.academia.apirest;

import static org.assertj.core.api.Assertions.assertThat;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class SpringBootProyectApplicationTests 
{
	Calculadora calculadora = new Calculadora();
	
	@Test
	@DisplayName("Test: Suma de Valores")
	void sumarValores() 
	{
		//Given: Define el contexto o las precondiciones
		Integer valorA = 1;
		Integer valorB = 2;
		
		//When Ejecutar la acción a probar
		Integer expected = calculadora.sumar(valorA, valorB);
		
		//Then: Validar aque la prueba funcione
		Integer resultadoEsperado = 3;
		assertThat(expected).isEqualTo(resultadoEsperado);
	}

	class Calculadora
	{
		Integer sumar(Integer a, Integer b)
		{
			return a + b;
		}
	}
}