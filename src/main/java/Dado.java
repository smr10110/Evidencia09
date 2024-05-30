import java.util.Random;

public class Dado {

	private int caraSuperior;

	/**
	 * Lanza el dado y actualiza caraSuperior con un valor aleatorio entre 1 y 6.
	 */
	public void lanzar() {
		Random rand = new Random();
		caraSuperior = rand.nextInt(6) + 1;
	}

	/**
	 * Devuelve el valor de la cara superior del dado.
	 *
	 * @return El valor de la cara superior.
	 */
	public int getCaraSuperior() {
		return caraSuperior;
	}

}
