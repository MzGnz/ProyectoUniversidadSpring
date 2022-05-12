package com.ibm.academia.apirest.models.dto;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Positive;
import javax.validation.constraints.Size;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class CarreraDTO 
{
	private Integer id;
	
	@NotNull(message = "No puede ser nulo")
	@NotBlank(message = "No puede ser vacio")
	@Size(min = 5, max = 80)
	private String nombre;
	
	@Positive(message = "Debe ser mayor a cero")
	private Integer cantidadMaterias;
	
	@Positive(message = "Debe ser mayor a cero")
	private Integer cantidadAnios;
}