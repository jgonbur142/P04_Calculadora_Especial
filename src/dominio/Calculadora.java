package dominio;

import static app.TipoOperador.MULTIPLICACION;
import static app.TipoOperador.RESTA;
import static app.TipoOperador.SUMA;

import java.util.ArrayList;
import java.util.List;
import app.TipoOperador;

//realiza las operaciones y guarda los resultados en el historial
public class Calculadora implements ICalculos{
	
	private double ultimoResultado;
	private List<Operacion> historial = new ArrayList<>();
	

	@Override
	public double realizarOperacion(ResultadoAnalisis resultado) {
		List<Double> numeros = resultado.numeros();
		List<TipoOperador> operadores = resultado.operadores();
		
		TipoOperador actual;
		double numeroSiguiente;
		double total = numeros.get(0);
		String operacionCadena = String.valueOf(total);
		
		for (int i=0;i<operadores.size();i++) {
			actual = operadores.get(i);
			numeroSiguiente = numeros.get(i+1);
			
			total = calcular(total,numeroSiguiente,actual);
			operacionCadena = String.format(" %s %s %.2f",operacionCadena,distinguirSimbolo(actual),numeroSiguiente);
		}
		
		this.ultimoResultado = total;
		historial.add(new Operacion(operacionCadena,total)); //no sabía de qué forma añadir una operación al historial, así debería funcionar
		
		return total;
		
	}
	
	/**
	 * Método privado que consulta realizarOperacion(ResultadoAnalisis resultado) para hacer las operaciones correspondientes
	 * 
	 * @param num1
	 * @param num2
	 * @param operador
	 * @return
	 */
	private double calcular(double num1, double num2, TipoOperador operador) {
		if (operador==SUMA) {
			return num1 + num2;
		}else if (operador==RESTA) {
			return num1 - num2;
		}else if (operador==MULTIPLICACION) {
			return num1 * num2;
		}else{
			return num1 / num2;
		}
	}
	/**
	 * Método privado que consulta realizarOperacion(ResultadoAnalisis resultado) para guardar el carácter correcto según el operador introducido
	 * 
	 * @param operador
	 * @return String
	 */
	private String distinguirSimbolo(TipoOperador operador) {
		if (operador==SUMA) {
			return "+";
		}else if (operador==RESTA) {
			return "-";
		}else if (operador==MULTIPLICACION) {
			return "*";
		}else {
			return "/";
		}
	}
	

	@Override
	public void resetear() {
		this.ultimoResultado=0;
	}
	
	/**
	 * Devuelve el historial actual
	 * 
	 * @return List<Operacion>
	 */
	public List<Operacion> getHistorial(){
		return this.historial;
	}
	/**
	 * Devuelve el último resultado guardado
	 * 
	 * @return double
	 */
	public double getUltimoResultado() {
		return this.ultimoResultado;
	}
	
	
	
}
