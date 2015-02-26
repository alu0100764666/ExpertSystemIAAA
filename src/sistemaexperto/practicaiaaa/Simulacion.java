package sistemaexperto.practicaiaaa;


/**
 * @param t
 *            Tanque a controlar.
 * @param inV
 *            Valvula de entrada
 * @param oV
 *            Valvula de salida
 */
public class Simulacion {
	private int time;
	
	public Simulacion(int t) {
		time = t;
	}
	public void simular() {
		ControlSystem sistema = new ControlSystem(new Tank(10.0, 20.0, 19.0),
				new Valve(0.4, 1), new Valve(1, 0.1));
			System.out.println("Tiempo(S), Altura(m)");
		for (int i = 0; i < time; i++) {
			sistema.control();
			System.out.println(i+ "," + sistema.getValorActual());
			sistema.nextSecond();
		}
	}
}
