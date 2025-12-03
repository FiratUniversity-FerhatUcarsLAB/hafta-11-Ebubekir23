public class Multadd {

	public static double multadd(double a, double b, double c) {
		return a * b + c;
	}

	public static double expSum(double x) {
		double eMinusX = Math.exp(-x);
		return x * eMinusX + Math.sqrt(1 - eMinusX);
	}

	public static void main(String[] args) {

		double sinPart = Math.sin(Math.PI / 4);
		double cosPart = Math.cos(Math.PI / 4);
		double result1 = multadd(cosPart, 0.5, sinPart);
		System.out.println("sin(pi/4) + cos(pi/4)/2 = " + result1);

		double log10 = Math.log(10);
		double log20 = Math.log(20);
		double result2 = multadd(1.0, 1.0, log10 + log20);

		double result2b = multadd(log10, 1.0, log20);
		System.out.println("log(10) + log(20) = " + result2b);

		double x = 1.0;
		System.out.println("expSum(" + x + ") = " + expSum(x));
	}
}

/* Çıktı
* sin(pi/4) + cos(pi/4)/2 = 1.0606601717798212
*log(10) + log(20) = 5.298317366548037
*expSum(1.0) = 1.1629395387920924
*/
