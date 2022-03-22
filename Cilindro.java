package figurasGeometricas2;

public class Cilindro {
	public void calcularArea() throws ExcepcionInput {
		double r = Auxiliar.comprobarValor("radio");
		double h = Auxiliar.comprobarValor("altura");
		double area = 2 * Math.sqrt(Auxiliar.getPi()) + (2 * Auxiliar.getPi() * r * h);
		Auxiliar.imprimirCaracteristicas(1, area, 0, "área");
	}

	public void calcularVolumen() throws ExcepcionInput {
		double r = Auxiliar.comprobarValor("radio");
		double h = Auxiliar.comprobarValor("altura");
		double volumen = Auxiliar.getPi() * r * h;
		Auxiliar.imprimirCaracteristicas(1, volumen, 0, "volumen");
	}
}
