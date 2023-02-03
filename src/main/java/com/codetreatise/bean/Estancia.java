package com.codetreatise.bean;

import java.time.LocalDate;

import javax.persistence.*;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;


@Entity
@Getter
@Setter
@Data
public class Estancia {

	@Id
	@SequenceGenerator(name="Estanciasequence",sequenceName= "EstanciaSQL")
	@GeneratedValue(strategy=GenerationType.SEQUENCE,generator= "Estanciasequence")
	@Column(name = "id_estancia", updatable = false, nullable = false)
	private long id_estancia;
	
	private LocalDate fecha;
	
	private boolean esvip = false;
	
	//campo de relacion con la clase parada
	@OneToOne(optional = false) //deberia estar bien de esta manera , sin necesidad de poner otra anotacion en la clase parada
	private Parada parada;
	
	//campo peregrino de la relacion estancia peregrino
	 // no configuro el nombre y dejo el por defecto que crea hibernate
	//ahora no me da error pero quite la anotacin de many to one del lado del peregrino 
	@ManyToOne()
	@JoinColumn()
	//parece que funciona, no volver a tocar hasta el viernes 
	private Peregrino per;
	
	


	
	
}
