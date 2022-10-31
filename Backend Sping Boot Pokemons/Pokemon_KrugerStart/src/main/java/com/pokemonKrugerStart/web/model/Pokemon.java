package com.pokemonKrugerStart.web.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "pokemon") 
public class Pokemon {

	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Long id;
	private String nombre;
	private String descripcion;
	private String tipo;
	private String evolucion;
	private int altura;
	private int peso;
	private String imageurl;

	
	public Pokemon(String nombre, String descripcion, String tipo, String evolucion, int altura, int peso,
			String imageurl) {
		super();
		this.nombre = nombre;
		this.descripcion = descripcion;
		this.tipo = tipo;
		this.evolucion = evolucion;
		this.altura = altura;
		this.peso = peso;
		this.imageurl = imageurl;
	}


	public Pokemon() {
		
	}


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getNombre() {
		return nombre;
	}


	public void setNombre(String nombre) {
		this.nombre = nombre;
	}


	public String getDescripcion() {
		return descripcion;
	}


	public void setDescripcion(String descripcion) {
		this.descripcion = descripcion;
	}


	public String getTipo() {
		return tipo;
	}


	public void setTipo(String tipo) {
		this.tipo = tipo;
	}


	public String getEvolucion() {
		return evolucion;
	}


	public void setEvolucion(String evolucion) {
		this.evolucion = evolucion;
	}


	public int getAltura() {
		return altura;
	}


	public void setAltura(int altura) {
		this.altura = altura;
	}


	public int getPeso() {
		return peso;
	}


	public void setPeso(int peso) {
		this.peso = peso;
	}


	public String getImageurl() {
		return imageurl;
	}


	public void setImageurl(String imageurl) {
		this.imageurl = imageurl;
	}
	

	
}
