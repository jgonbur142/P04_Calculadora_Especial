package app;

import java.util.List;

import dominio.Operacion;
/**
 * Controla la entrada de datos que introduzca el usuario y la salida por consola
 */
public interface IEntradaSalida {
	
	/**
	 * Dibuja por consola una pequeña interfaz
	 */
	public void visualConsola();
	
	/**
	 * Lee la siguiente línea que se introduzca por teclado
	 * @return String
	 */	
	public String leerEntrada();
	
	/**
	 * Muestra por consola el mensaje que se le pase por parámetro
	 * @param mensaje
	 */
	public void mostrarMensaje(String mensaje);
	
	/**
	 * Muestra por consola la lista de operaciones junto al último resultado
	 * @param historial
	 * @param ultimoResultado
	 */
	public void mostrarHistorial(List<Operacion> historial, double ultimoResultado);
	
	
}
