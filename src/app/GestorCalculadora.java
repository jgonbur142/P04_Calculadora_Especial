package app;

import java.util.Scanner;
import dominio.Calculadora;
import dominio.ResultadoAnalisis;

//contiene el main de la aplicación y llama al resto de clases
public class GestorCalculadora {
	
	private Calculadora calculadora = new Calculadora();
	private Analizador analizador = new Analizador();
	private Consola consola = new Consola();
	
	/**
	 * Lee los comandos introducido por el usuario y llama a los métodos correspondientes
	 * 
	 * @return void
	 */
	public void iniciar() {
		String entrada;
		ResultadoAnalisis resultado;
		boolean salirBucle = false;
		do {
			consola.visualConsola();
			entrada = consola.leerEntrada();
			resultado = analizador.analizar(entrada, calculadora.getUltimoResultado());

			if(resultado.comando() == TipoComando.ERROR) {
				consola.mostrarMensaje("ERROR: debe introducir una operación válida");
				
			}else if (resultado.comando() == TipoComando.LIST) {
				consola.mostrarHistorial(calculadora.getHistorial(), calculadora.getUltimoResultado());
				
			}else if (resultado.comando() == TipoComando.RESET) {
				calculadora.resetear();
				
			}else if(resultado.comando() == TipoComando.RESULT) {
				consola.mostrarMensaje("Último resultado: "+calculadora.getUltimoResultado());
				
			}else if (resultado.comando() == TipoComando.QUIT) {
				salirBucle = true;
				consola.mostrarMensaje("Calculadora apagada...");
			}else {
				calculadora.realizarOperacion(resultado);
			}
			
		}while(!salirBucle);
	}
	
	public static void main(String[] args) {
		new GestorCalculadora().iniciar();
		
	}
	
}


