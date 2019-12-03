package enunciado;

public class Camioneta extends Vehiculo {

	private Integer modelo ;
	public Camioneta (String patente,String nombreTitular, String apellidoTitular,  Integer pesoMaximo,Integer modelo) {

	}


	/*Las camionetas soportan cagargas hasta su  pesoMaximo
	 * 
	 */
	
	
	public Integer getModelo() {
		return modelo;
	}

	public void setModelo(Integer modelo) {
		this.modelo = modelo;
	}
	
	

}
