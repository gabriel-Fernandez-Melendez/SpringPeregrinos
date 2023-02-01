package com.codetreatise.bean;


import java.util.ArrayList;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.SequenceGenerator;

import lombok.Getter;
import lombok.Setter;
import java.util.List;

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
	@OneToMany(mappedBy = "peregrino")
	List<Estancia> estancias = new ArrayList<Estancia>();

	//arraylist de la relacion con paradas manytomany
	@ManyToMany
	List<Parada> paradas = new ArrayList<Parada>();

	
	//esto indica que esta en una relacion de uno con uno con carnet 
	@OneToOne(optional = false)
	private Carnet carnet;
	
	
	//constructor por defecto
	public Peregrino() {
		
	}


	@Override
	public String toString() {
		return "Peregrino [id=" + id + ", nombre=" + nombre + ", nacionalidad=" + nacionalidad + ", estancias="
				+ estancias + ", carnet=" + carnet + "]";
	}
	
	
	
	
}
