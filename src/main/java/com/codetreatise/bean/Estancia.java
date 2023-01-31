package com.codetreatise.bean;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Estancia {

	@Id
	@SequenceGenerator(name="Estanciasequence",sequenceName= "EstanciaSQL")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator= "Estanciasequence")
	@Column(name = "id_estancia", updatable = false, nullable = false)
	private long id_estancia;
	
	private LocalDate fecha;
	
	private boolean esvip;
	
	//campo peregrino de la relacion estancia peregrino
	@ManyToOne(optional = false ) // no configuro el nombre y dejo el por defecto que crea hibernate
	private Peregrino peregrino;
	
	//campo de relacion con la clase parada
	@OneToOne(optional = false)
	private Parada parada;

	@Override
	public String toString() {
		return "Estancia [id_estancia=" + id_estancia + ", fecha=" + fecha + ", esvip=" + esvip + ", peregrino="
				+ peregrino + ", parada=" + parada + "]";
	}
	
	
}
