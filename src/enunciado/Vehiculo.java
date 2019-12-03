package enunciado;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public abstract class Vehiculo {
	private String patente;
	private String apellidoTitular;
	private String nombreTitular;
	private List<Carga> cargas;
	private Integer pesoMaximo;
	
	
	
	public Vehiculo(String patente,String nombreTitular, String apellidoTitular, Integer pesoMaximo) {
		
		
	}
	
	
	
	//obtiene el peso cargado del vehiculo
	public Integer obtenerPesoCargado () {
			
			
		}
	public abstract Boolean agregarCarga(Carga carga) throws SobrepesoException;
			
	
	public String getApellidoTitular() {
		return apellidoTitular;
	}

	public void setApellidoTitular(String apellidoTitular) {
		this.apellidoTitular = apellidoTitular;
	}

	public String getNombreTitular() {
		return nombreTitular;
	}

	public void setNombreTitular(String nombreTitular) {
		this.nombreTitular = nombreTitular;
	}
	
	
	
	public String getPatente() {
		return patente;
	}
	public void setPatente(String patente) {
		this.patente = patente;
	}
	
	public Integer getPesoMaximo() {
		return pesoMaximo;
	}
	public void setPesoMaximo(Integer pesoMaximo) {
		this.pesoMaximo = pesoMaximo;
	}

	public List<Carga> getCargas() {
		return cargas;
	}

	public void setCargas(List<Carga> cargas) {
		this.cargas = cargas;
	}
	

		

	
	

}
