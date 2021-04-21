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


	public float costoEmpaquetado() {
		return ((.06F*super.getCosto())/100)/(this.cantidadXminuto*this.tipoEmpaque);

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
