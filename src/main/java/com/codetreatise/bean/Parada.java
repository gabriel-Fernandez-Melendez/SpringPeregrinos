package com.codetreatise.bean;

import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
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
	@Column(name = "id_parada", updatable = false, nullable = false)
	long id_parada;
	
	String nombreparada;
	
	char region;

	@ManyToMany(mappedBy = "paradas")
	ArrayList<Peregrino> Peregrinos = new ArrayList<Peregrino>();
	
	public Parada() {
		
	}


	//importante !! volver a generar todos los strings
	@Override
	public String toString() {
		return "Parada [id_parada=" + id_parada + ", nombreparada=" + nombreparada + ", region=" + region + "]";
	}
	
	
}
