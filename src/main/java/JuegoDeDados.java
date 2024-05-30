import java.util.*;

public class JuegoDeDados {

	private Dado dado1 = new Dado();
	private Dado dado2 = new Dado();
	private Calculadora calculadora = new Calculadora();

	/**
	 * Lanza dos dados y utiliza una calculadora para determinar si la suma es 7.
	 */
	public void jugar() {
		dado1.lanzar();
		dado2.lanzar();
		int suma = calculadora.sumar(dado1.getCaraSuperior(), dado2.getCaraSuperior());
		if (suma == 7) {
			System.out.println("Ganaste!!!");
		} else {
			System.out.println("Has perdido!!!");
		}
	}

}
