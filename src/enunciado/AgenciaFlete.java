package enunciado;

import java.util.Comparator;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

import enunciado.Vehiculo;
import enunciado.VehiculoNotFoundException;

public class AgenciaFlete {

	private Set <Vehiculo> flota;

	public AgenciaFlete() {
		
	}

// Agrega Un vehiculo a la flota
	public Boolean agregarVehiculo(Vehiculo vehiculo) {
		
	}

	// * Busca Un vehiculo por patente y si no lo encuentra devuelve
	// VehiculoNotFoundException
	public Vehiculo buscarVehiculo(String patente) throws VehiculoNotFoundException {
	
	
	}

	public void descargarCargasVehiculo(String patente) throws VehiculoNotFoundException {
		Vehiculo vehiculo = this.buscarVehiculo(patente);
		vehiculo.getCargas().clear();
	}

	// Transfiere todas las carga de un vehiculo
	public Boolean moverCargaDeUnVehiculoAOtro(String patenteOrigen, String patenteDestino)
			throws VehiculoNotFoundException, SobrepesoException {
		}


	public Set<Vehiculo> getFlota() {
		return flota;
	}

	public void setFlota(Set<Vehiculo> flota) {
		this.flota = flota;
	}
}
