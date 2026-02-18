package dominio;

public interface ICalculos {
	
	/**
	 * Recorre la lista del analizador y acumular el resultado con un for
	 * 
	 * @param ResultadoAnalisis
	 * @return double
	 */
	public double realizarOperacion(ResultadoAnalisis resultado);
	
	/**
	 * Reinicia el ultimo resultado poniéndolo a 0
	 * 
	 * @return void
	 */
	public void resetear();
	
}
