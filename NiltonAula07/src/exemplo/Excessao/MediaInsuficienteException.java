package exemplo.Excessao;

public class MediaInsuficienteException extends Exception {
	public MediaInsuficienteException() {
		super("Exception criada para media menor que 6.0");
	}
}