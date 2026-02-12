package app;

import java.util.List;
import java.util.Scanner;

import dominio.Operacion;
//comunicación con el usuario
public class Consola {
	
	private Scanner kb = new Scanner(System.in);
	
	//enseño el promt de la consola
	public void visualConsola() {
		System.out.printf("CALCULADORA\n-----------------\n>");
	}
	
	public String leerEntrada() {
		return kb.next();
	}
	
	//imrpimir mensajes de error y resultados
	public void mostrarMensaje(String mensaje) {
		System.out.println(mensaje);
	}
	
	public void mostrarHistorial(List<Operacion> historial, double ultimoResultado) {
		
		if (historial.isEmpty()) {
			System.out.println("El historial está vacío");
		}else {
			for (int i=0;i<historial.size();i++) { //recorro la lista
				System.out.printf("%d, %s",i+1,historial.get(i));//.get devuelve el elemento en la posicion i
			}
		}
		
		System.out.println("Último resultado: "+ultimoResultado);
	}
	
	
	
	
}
