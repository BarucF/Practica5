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

	Maquina maquina= new Maquina();
	public float costoLlenado(float costo, int envasesXminuto) {
		float costoLlenado = 0F;
		costoLlenado=((.25F*costo)/100)/envasesXminuto;
		return costoLlenado;

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
