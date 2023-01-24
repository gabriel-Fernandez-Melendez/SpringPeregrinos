package com.codetreatise.bean;

import java.time.LocalDate;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Getter;
import lombok.Setter;

@Entity
//estas anotaciones me permiten no tener que declarar en los getters y setter en los pojos de clase
@Getter
@Setter
public class Carnet {

	//valores de la clase
	
	@Id  //el id que ira a base de datos del programa
	@Column(updatable = true , nullable = false)//aqui decimos que el id se puede insertar pero no actualizar(en principio esta anitacion ira en todas las columnas)
	//tambien podria ir aqui la anotacion @Inmutable y hara lo mismo de excluir el atrubuto de los updates!
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	long idperegrino;
	
	LocalDate fechaexp;
	
	double distanciaRecorrida;
	
	int n_vips;
	
	

	//constructor por defecto
	public Carnet() {
		
	}
	
	
	
	
}
