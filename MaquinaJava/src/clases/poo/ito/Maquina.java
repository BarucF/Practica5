package clases.poo.ito;
import java.time.LocalDate;

public class Maquina {
	private String descripcion = "";
	private LocalDate fechaAdquisicion = null;
	private float costo = 0F;

	public Maquina() {
		super();
	}
	
	public Maquina(float costo,LocalDate fechaAdquisicion, String descripcion) {
		super();
		this.costo = costo;
		this.fechaAdquisicion = fechaAdquisicion;
		this.descripcion = descripcion;	
	}

	public String getDescripcion() {
		return this.descripcion;
	}

	public void setDescripcion(String newDescripcion) {
		this.descripcion = newDescripcion;
	}

	public LocalDate getFechaAdquisicion() {
		return this.fechaAdquisicion;
	}

	public void setFechaAdquisicion(LocalDate newFechaAdquisicion) {
		this.fechaAdquisicion = newFechaAdquisicion;
	}

	public float getCosto() {
		return this.costo;
	}

	public void setCosto(float newCosto) {
		this.costo = newCosto;
	}
	
	@Override
	public String toString() {
		return "Maquina [costo=" + costo + ", fechaAdquisicion=" + fechaAdquisicion + ", descripcion=" + descripcion
				+ "]";
	}
	
}
