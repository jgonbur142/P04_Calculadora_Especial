package dominio;

import java.util.List;

//realiza las operaciones y guarda los resultados en el historial
public class Calculadora {
	
	private double ultimoResultado;
	private List<Operacion> historial;
	
	//recorrer la lista del analizador y acumular el resultado con un for
	public double realizarOperacion(ResultadoAnalisis resultado) {
		
	}
	
	//reinicia el ultimo resultado poniéndolo a 0
	public void resetear() {
		this.ultimoResultado=0;
	}
	
	public List<Operacion> getHistorial(){
		return this.historial;
	}
	
	public double getUltimoResultado() {
		return this.ultimoResultado;
	}
	
	
	
}
