package figurasGeometricas2;

import java.util.Scanner;

public class Principal {

	public static void main(String[] args) throws ExcepcionInput {
		Scanner kb = new Scanner(System.in);
		System.out.println("Introduce tu nombre");
		Auxiliar.setNombre(kb.nextLine());
		System.out.println("Introduce tus apellidos");
		Auxiliar.setApellidos(kb.nextLine());
		Esfera e1 = new Esfera();
		Piramide pir1 = new Piramide();
		Cilindro cil = new Cilindro();
		PrismaRectangular p1 = new PrismaRectangular();
		boolean salir = false;
		while (!salir) {
			Scanner kba = new Scanner(System.in);
			System.out.println(
					"**************************************************************************************************************");
			System.out.println(
					"**            1. Calcular el área de un prisma rectangular                                                  **");
			System.out.println(
					"**            2. Calcular el volumen de un prisma rectangular                                               **");
			System.out.println(
					"**            3. Calcular el área de una esfera                                                             **");
			System.out.println(
					"**            4. Calcular el volumen de una esfera                                                          **");
			System.out.println(
					"**            5. Calcular el área de una pirámide cuadrada                                                  **");
			System.out.println(
					"**            6. Calcular el volumen de una pirámide                                                        **");
			System.out.println(
					"**            7. Calcular el área de un cilindro                                                            **");
			System.out.println(
					"**            8. Calcular el volumen de un cilindro                                                         **");
			System.out.println(
					"**            s. Salir                                                                                      **");
			System.out.println(
					"**************************************************************************************************************");
			switch (kba.nextLine()) {
			case "1":
				p1.calcularArea();
				break;
			case "2":
				p1.calcularVolumen();
				break;
			case "3":
				e1.calcularArea();
				break;
			case "4":
				e1.calcularVolumen();
				break;
			case "5":
				pir1.calcularArea();
				break;
			case "6":
				pir1.calcularVolumen();
				break;
			case "7":
				cil.calcularArea();
				break;
			case "8":
				cil.calcularVolumen();
				break;
			case "s":
				salir = true;
				break;
			default:
				System.out.println("No has introducido una opción válida.\nInténtalo de nuevo.");
			}
		}
	}
}
