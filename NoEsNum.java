package figurasGeometricas2;

import java.util.regex.Pattern;

public class NoEsNum {
	static boolean comprobarNum(String num) throws ExcepcionInput {
		boolean result = true;
		Pattern checkNum = Pattern.compile("[1-9]+(\\.[1-9]+)?");

		if (num == null || !(checkNum.matcher(num).matches())) {
			result = false;
			throw new ExcepcionInput("No has introducido un número válido.");
		}
		return result;
	}
}