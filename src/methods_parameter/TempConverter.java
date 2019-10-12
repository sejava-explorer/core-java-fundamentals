package methods_parameter;

/**
 * @author - explorechoice.org
 */

class TempConverter {
	static double temp = 456.89;
	static String convertTo = "celcius";
	static double result;

	public static void main(String args[]) {
		result = (temp - 32) * (5.0 / 9);
		System.out.println(result);
		// float f = 34536.89; // This line of code will throw error since Java default
		// considers any decimal value as double and hence we try to save float we need
		// to specify explicitly
		float f = 34536.89F; // This is how we should specify the float value

	}

}
