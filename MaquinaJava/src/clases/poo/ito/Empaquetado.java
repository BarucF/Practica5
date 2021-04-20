package clases.poo.ito;

import java.time.LocalDate;

public class Empaquetado extends Maquina {

	private int tipoEmpaque = 0;


	private int cantidadXminuto = 0;


	public Empaquetado(float costo,LocalDate fechaAdquisicion,String descripcion,int tipoEmpaque,int cantidadXminuto) {
		super(costo,fechaAdquisicion,descripcion);
		this.tipoEmpaque=tipoEmpaque;
		this.cantidadXminuto=cantidadXminuto;

	}


	public float costoEmpaquetado(float costo, int tipoEmpaque, int cantidadXminuto) {
		float costoEmpaquetado = 0F;
		costoEmpaquetado=((.06F*costo)/100)/(cantidadXminuto*tipoEmpaque);
		return costoEmpaquetado;

	}


	public int getTipoEmpaque() {
		return this.tipoEmpaque;
	}


	public void setTipoEmpaque(int newTipoEmpaque) {
		this.tipoEmpaque = newTipoEmpaque;
	}


	public int getCantidadXminuto() {
		return this.cantidadXminuto;
	}


	public void setCantidadXminuto(int newCantidadXminuto) {
		this.cantidadXminuto = newCantidadXminuto;
	}


	@Override
	public String toString() {
		return "Empaquetado [tipoEmpaque=" + tipoEmpaque + ", cantidadXminuto=" + cantidadXminuto +" "+super.toString()+ "]";
	}

}
