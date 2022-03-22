package figurasGeometricas2;

public class Esfera implements MetodosFiguras {
	public void calcularArea() throws ExcepcionInput {
		double radio = Auxiliar.comprobarValor("radio");
		double area = 4 * Auxiliar.getPi() * (radio * radio);
		Auxiliar.imprimirCaracteristicas(2, area, 1, "área");
	}

	public void calcularVolumen() throws ExcepcionInput {
		double radio = Auxiliar.comprobarValor("radio");
		double volumen = 4.0 / 3.0 * Auxiliar.getPi() * radio * radio * radio;
		Auxiliar.imprimirCaracteristicas(2, volumen, 1, "volumen");
	}
}
