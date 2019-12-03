package enunciado;

public class Camion extends Vehiculo {
	private Boolean tieneAcoplado;

	
	public Camion(String patente, String nombreTitular, String apellidoTitular, Integer pesoMaximo,
			Boolean tieneAcoplado) {
		super(patente, nombreTitular, apellidoTitular, pesoMaximo);
		this.tieneAcoplado=tieneAcoplado;
	}

	/* Los camiones con acoplados soportan el doble de su pesoMaximo y si no tienen acoplados soportan
	 * hasta el pesoMaximo
	 */

	public Boolean getTieneAcoplado() {
		return tieneAcoplado;
	}


	public void setTieneAcoplado(Boolean tieneAcoplado) {
		this.tieneAcoplado = tieneAcoplado;
	}


	



}
