package com.codetreatise.bean;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;

//importante, al implementar la secuencia el objeto no se guarda hasta usar el metodo flush 

//objeto parada a implementar en la base de datosde spring 
@Entity
@Getter
@Setter
public class Parada {

	@Id
	//asi creo una secuencia que es la quefenira el id de la clase en la base de datos(queda comentado de momento)
	//implementar las secuencias en todas las clases
	@SequenceGenerator(name="Paradasequence",sequenceName= "ParadaSQL")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator= "Paradasequence")
	@Column(name = "id", updatable = false, nullable = false)
	long id_parada;
	
	String nombreparada;
	
	char region;

	
	public Parada() {
		
	}
}
