package figurasGeometricas2;

public class PrismaRectangular implements MetodosFiguras {
	public void calcularArea() throws ExcepcionInput {
		double a = Auxiliar.comprobarValor("lado 'a'");
		double b = Auxiliar.comprobarValor("lado 'b'");
		double c = Auxiliar.comprobarValor("lado 'c'");
		double area = 2 * (a * b) + 2 * (b * c) + 2 * (a * c);
		Auxiliar.imprimirCaracteristicas(3, area, 2, "área");
	}

	public void calcularVolumen() throws ExcepcionInput {
		double a = Auxiliar.comprobarValor("lado 'a'");
		double b = Auxiliar.comprobarValor("lado 'b'");
		double c = Auxiliar.comprobarValor("lado 'c'");
		double volumen = a * b * c;
		Auxiliar.imprimirCaracteristicas(3, volumen, 2, "volumen");
	}
}
