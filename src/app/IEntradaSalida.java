package app;

import java.util.List;

import dominio.Operacion;
/**
 * 
 */
public interface IEntradaSalida {
	
	/**
	 * 
	 */
	public void visualConsola();
	
	/**
	 * 
	 * @return
	 */	
	public String leerEntrada();
	
	/**
	 * 
	 * @param mensaje
	 */
	public void mostrarMensaje(String mensaje);
	
	/**
	 * 
	 * @param historial
	 * @param ultimoResultado
	 */
	public void mostrarHistorial(List<Operacion> historial, double ultimoResultado);
	
	
}
