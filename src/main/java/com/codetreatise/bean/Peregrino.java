package com.codetreatise.bean;

import java.time.LocalDate;
import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.MapsId;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;
import javax.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Peregrino {
	
	@Id
	@SequenceGenerator(name="Peregrinosequence",sequenceName= "PeregrinoSQL")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator= "Peregrinosequence")
	@Column(name = "id", updatable = false, nullable = false)
	private long id;
	
	private String nombre;
	
	private String nacionalidad;
	
	//arraylist de la relacion con estancias
	ArrayList<Estancia> estancias = new ArrayList<Estancia>();


	
	//esto indica que esta en una relacion de uno con uno con carnet 
	@OneToOne(optional = false)
	@MapsId //mapea el id del peregrino y va a coincidir con id del carnet
	private Carnet carnet;
	
	
	//constructor por defecto
	public Peregrino() {
		
	}
	
	
}
