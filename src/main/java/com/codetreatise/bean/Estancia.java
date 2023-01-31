package com.codetreatise.bean;

import java.time.LocalDate;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
public class Estancia {

	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name = "id", updatable = false, nullable = false)
	private long id_estancia;
	
	private LocalDate fecha;
	
	private boolean esvip;
	
	//campo peregrino de la relacion estancia peregrino
	@ManyToOne(optional = false ) // no configuro el nombre y dejo el por defecto que crea hibernate
	private Peregrino peregrino;
}
