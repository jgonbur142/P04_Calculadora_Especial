package app;

import java.util.List;
import java.util.Scanner;

import dominio.Operacion;
//comunicación con el usuario
public class Consola implements IEntradaSalida{
	
	private Scanner kb = new Scanner(System.in);
	
	@Override
	public void visualConsola() {
		System.out.printf("CALCULADORA\n-----------------\n>");
	}
	
	@Override
	public String leerEntrada() {
		return kb.nextLine();
	}
	
	@Override
	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	

	@Override
	public void mostrarHistorial(List<Operacion> historial, double ultimoResultado) {
		
		if (historial.isEmpty()) {
			System.out.println("El historial está vacío");
		}else {
			for (int i=0;i<historial.size();i++) { //recorro la lista
				System.out.printf("%d -> %s\n",i+1,historial.get(i));//.get devuelve el elemento en la posicion i
			}
		}
		
		System.out.printf("\nÚltimo resultado: %.2f\n\n",ultimoResultado);
	}
	
	
	
	
}
