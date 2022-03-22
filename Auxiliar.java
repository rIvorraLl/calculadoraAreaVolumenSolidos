package figurasGeometricas2;

import java.util.Scanner;

public class Auxiliar {
	// Atributos
	private static String nombre = new String();
	private static String apellidos = new String();
	private static final double pi = 3.14159;
	private String dato = new String();
	private static final String[] nombreSolido = { " de la pirámide", " del cilindro", " de la esfera",
			" del prisma rectangular" };
	private static final String[] caracteristicas = {
			"**************************************************************************************************************\n"
					+ "El cilindro es una de las figuras 3D básicas, el cual tiene dos bases circulares paralelas las\n"
					+ "cuales están ubicadas a una cierta distancia la una de la otra. Las dos bases circulares son unidas\n"
					+ "por una superficie curvada. El segmento de línea que une a los dos centros de los círculos es el eje\n"
					+ "del cilindro. La distancia entre las dos bases circulares es igual a la altura del cilindro.\n"
					+ "Sus dos propiedades básicas más importantes son el volumen y el área superficial.",
			"**************************************************************************************************************\n"
					+ "En geometría, una esfera es un sólido que tiene una figura completamente redonda definida en el espacio\n"
					+ "tridimensional. Matemáticamente, la esfera es definida como el conjunto de puntos que están ubicados a una\n"
					+ "distancia constante desde un punto fijo en el espacio tridimensional. Esta distancia constante es llamada el\n"
					+ "radio y el punto fijo es llamado el centro de la esfera. Un ejemplo de una esfera en la vida real es un balón.",
			"**************************************************************************************************************\n"
					+ "Un prisma rectangular es una figura tridimensional que está compuesta de dos bases rectangulares paralelas\n"
					+ "y cuatro caras rectangulares. También podemos considerar a los prismas rectangulares como cuboides o como\n"
					+ "poliedros con dos bases paralelas congruentes. Dado que el prisma rectangular es una figura 3D, sus\n"
					+ "propiedades más importantes son el volumen y el área superficial.",
			"**************************************************************************************************************\n"
					+ "Una pirámide es un cuerpo geométrica espacial, más precisamente un poliedro. Está compuesta de una base y\n"
					+ "un vértice. Su base puede ser triangular, pentagonal, cuadrada, rectangular, paralelogramo.\n"
					+ "En otros términos, la pirámide es un sólido geométrico de base poligonal que posee todos los vértices en\n"
					+ "un plano (plano de la base). Su altura corresponde a la distancia entre el vértice y su base." };

	// Constructor vacío
	public Auxiliar() {
	}

	// Métodos
	public static void imprimirCaracteristicas(int indiceFigura, double resultado, int indiceCaracteristicas,
			String ArOrVol) {
		System.out.println(
				"**************************************************************************************************************");
		System.out.println(
				"                              Calculadora de " + Auxiliar.getNombre() + " " + Auxiliar.getApellidos());
		System.out.println(" El " + ArOrVol + Auxiliar.getNombresolido()[indiceFigura]
				+ " con los datos que has introducido es de " + resultado);
		System.out.println(Auxiliar.getCaracteristicas()[indiceCaracteristicas]);
	}

	public static double comprobarValor(String item) {
		double valor = -1;
		boolean salir = false;
		while (!salir) {
			int num = 0;
			Scanner kb = new Scanner(System.in);
			System.out.println("Introduce la medida de: " + item);
			String valorStr = kb.nextLine();
			try {
				NoEsNum.comprobarNum(valorStr);
			} catch (ExcepcionInput e) {
				e.printStackTrace();
				num = -1;
			}
			if (num == 0) {
				salir = true;
				valor = Double.parseDouble(valorStr);
			}
		}
		return valor;
	}

	public static String getNombre() {
		return nombre;
	}

	public static void setNombre(String nombre) {
		Auxiliar.nombre = nombre;
	}

	public static String getApellidos() {
		return apellidos;
	}

	public static void setApellidos(String apellidos) {
		Auxiliar.apellidos = apellidos;
	}

	public String getDato() {
		return dato;
	}

	public void setDato(String dato) {
		this.dato = dato;
	}

	public static double getPi() {
		return pi;
	}

	public static String[] getNombresolido() {
		return nombreSolido;
	}

	public static String[] getCaracteristicas() {
		return caracteristicas;
	}
}
