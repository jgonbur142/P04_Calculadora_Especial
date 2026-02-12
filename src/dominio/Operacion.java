package dominio;

public class Operacion {
	//guardo -> List<int>, List<TipoOperando>, List<TipoOperador>
	//o guardo -> entrada:String, resultado:int
	
	private String entrada;
	private double resultado;
	
	public Operacion(String entrada, double resultado) {
		this.entrada = entrada;
		this.resultado = resultado;
	}
	
	@Override
	public String toString() {
		return String.format("%s = %d",entrada,resultado);
	}
	
	
	
}
