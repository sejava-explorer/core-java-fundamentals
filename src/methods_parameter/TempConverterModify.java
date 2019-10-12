package methods_parameter;

/**
 * @author - explorechoice.org
 */

class TempConverterModify {
	static double temp;
	static String convertTo = "celcius";
	static double result;

	static void farToCel(double x) {
		temp = x;
		result = (temp - 32) * (5.0 / 9);
		System.out.println(result);
	}

	static void celToFar(double y) {
		temp = y;
		result = temp * (9 / 5) + 32;
		System.out.println(result);
	}

}
