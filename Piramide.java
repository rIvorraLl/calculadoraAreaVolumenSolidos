package figurasGeometricas2;

public class Piramide implements MetodosFiguras {
	public void calcularArea() throws ExcepcionInput {
		double b = Auxiliar.comprobarValor("lado de la base");
		double h = Auxiliar.comprobarValor("altura desde el centro de la base al vértice superior");
		double s1 = Math.sqrt((b / 2) * (b / 2) + h * h);
		double area = 2 * b * s1 + b * b;
		Auxiliar.imprimirCaracteristicas(0, area, 3, "área");
	}

	public void calcularVolumen() throws ExcepcionInput {
		double b = Auxiliar.comprobarValor("lado de la base");
		double h = Auxiliar.comprobarValor("altura de uno de los triángulos");
		double volumen = (1.0 / 3.0) * b * b * h;
		Auxiliar.imprimirCaracteristicas(0, volumen, 3, "volumen");
	}
}
