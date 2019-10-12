package methods_parameter;

import java.util.Scanner;

/**
 * @author explorechoice.org
 */

public class TempConverterScanner {
	double temp;
	String convertTo = "celcius";
	double result;

	void farToCel() {
		Scanner scn = new Scanner(System.in);
		System.out.println("Please enter temperature -");
		temp = scn.nextDouble();
		result = (temp - 32) * (5.0 / 9);
		System.out.println(result);
	}

	void celToFar() {
		result = temp * (9 / 5) + 32;
		System.out.println(result);
	}

}
