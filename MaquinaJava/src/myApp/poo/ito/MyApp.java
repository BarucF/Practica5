package myApp.poo.ito;


import java.time.LocalDate;
import clases.poo.ito.Empaquetado;
import clases.poo.ito.Llenado;
import clases.poo.ito.Lavado;
public class MyApp {
	public static void run() {
		Lavado lavado= new Lavado(15000F,LocalDate.of(2012,02,27),"Maquina de lavado",150F,20);
		System.out.println(lavado);
		System.out.println("Costo de lavado por botella:"+lavado.costoLavado()+"$");
		Llenado llenado=new Llenado("Maquina de llenado",LocalDate.of(2011,01,23),5000F,15,"100ml,500ml");
		System.out.println(llenado);
		System.out.println("Costo de llenado por botella:"+llenado.costoLlenado()+"$");
		Empaquetado empaquetado=new Empaquetado(8500F,LocalDate.of(2014,06,15),"Maquina de empaquetado",9,3);
		System.out.println(empaquetado);
		System.out.println("Costo de empaquetado por botella:"+empaquetado.costoEmpaquetado()+"$");
		
		
	}
	public static void main(String[] Args) {
		run();
	}

}
