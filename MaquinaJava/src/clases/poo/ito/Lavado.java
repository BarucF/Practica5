
package clases.poo.ito;

import java.time.LocalDate;

public class Lavado extends Maquina {

	


	private float capacidad = 0F;


	private int tiempoCicloLavado = 0;


	public Lavado(float costo,LocalDate fechaAdquisicion,String descripcion,float capacidad, int tiempoCicloLavado) {
		super(costo,fechaAdquisicion,descripcion);
		this.capacidad = capacidad;
		this.tiempoCicloLavado = tiempoCicloLavado;
	}


	public float costoLavado(float costo, int tiempoCicloLavado) {
		float costoLavado = 0F;
		int botellasXminuto;
		botellasXminuto=60/tiempoCicloLavado;
		costoLavado=((.05F*costo)/100)/botellasXminuto;
		return costoLavado;

	}


	public float getCapacidad() {
		return this.capacidad;
	}


	public void setCapacidad(float newCapacidad) {
		this.capacidad = newCapacidad;
	}


	public int getTiempoCicloLavado() {
		return this.tiempoCicloLavado;
	}


	public void setTiempoCicloLavado(int newTiempoCicloLavado) {
		this.tiempoCicloLavado = newTiempoCicloLavado;
	}


	@Override
	public String toString() {
		return "Lavado [capacidad=" + capacidad + ", tiempoCicloLavado=" + tiempoCicloLavado+" "+super.toString()+ "]";
	}

}
