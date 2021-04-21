package clases.poo.ito;

import java.time.LocalDate;

public class Llenado extends Maquina {

	
	private int envasesXminuto = 0;


	private String regulacionMililitros= "";
	

	public Llenado(String descripcion, LocalDate fechaAdquisicion, float costo,int envasesXminuto, String regulacionMililitros) {
		super(costo,fechaAdquisicion,descripcion);
		this.envasesXminuto = envasesXminuto;
		this.regulacionMililitros = regulacionMililitros;
	}
	public float costoLlenado() {
		float costoLlenado = 0F;
		return costoLlenado=((.25F*super.getCosto())/100)/this.envasesXminuto;

	}


	public int getEnvasesXminuto() {
		return this.envasesXminuto;
	}


	public void setEnvasesXminuto(int newEnvasesXminuto) {
		this.envasesXminuto = newEnvasesXminuto;
	}


	public String getRegulacionMililitros() {
		return this.regulacionMililitros;
	}
	public void setRegulacionMililitros(String newRegulacionMililitros) {
		this.regulacionMililitros = newRegulacionMililitros;
	}


	@Override
	public String toString() {
		return "Llenado y envasado [envasesXminuto=" + envasesXminuto + ", regulacionMililitros=" + regulacionMililitros +" "+ super.toString()+"]";
	}

}
