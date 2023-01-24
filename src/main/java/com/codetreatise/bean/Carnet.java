package com.codetreatise.bean;

import java.time.LocalDate;

import javax.persistence.Entity;

@Entity
public class Carnet {

	//valores de la clase
	long idperegrino;
	LocalDate fechaexp;
	double distanciaRecorrida;
	int n_vips;

	//constructor por defecto
	public Carnet() {
		
	}
}
