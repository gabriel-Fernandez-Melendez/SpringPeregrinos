package com.codetreatise.bean;


import java.util.*;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.*;
import javax.persistence.SequenceGenerator;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import java.util.List;

@Entity
@Getter
@Setter
@Data
public class Peregrino {
	
	@Id
	@SequenceGenerator(name="Peregrinosequence",sequenceName= "PeregrinoSQL")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator= "Peregrinosequence")
	private long id_p;
	
	private String nombre;
	
	private String nacionalidad;
	
	//arraylist de la relacion con estancias(no le he puesto de este lado one to many pero no parece ser un problema ahora)
	@OneToMany(mappedBy = "per", fetch = FetchType.EAGER)
	private List<Estancia> estancias;

	//arraylist de la relacion con paradas manytomany
	@ManyToMany
	private List<Parada> paradas;

	
	//esto indica que esta en una relacion de uno con uno con carnet 
	@OneToOne(optional = false)
	private Carnet carnet;
	
	
	//constructor por defecto
	public Peregrino() {
		
	}

	

	
	
	
	
	
}
