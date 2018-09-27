/* program does math
 * @author Arthur Foy
 * @version 9/12/2018
 */

public class DoMath {
	//Returns the square of an integer
	public static void main(String[] args) {
		System.out.println(Calculate.square(5));
		System.out.println(Calculate.cube(3));
		System.out.println(Calculate.average(3.0 , 7.0));
		System.out.println(Calculate.average(3.0, 5.0, 7.0));
		System.out.println(Calculate.toRadians(180.0));
		System.out.println(Calculate.toDegrees(5));
		System.out.println(Calculate.discriminant(1, 2, 3));
		System.out.println(Calculate.toImproperFrac(3, 1, 2));
		System.out.println(Calculate.toMixedNum(7, 2));
		System.out.println(Calculate.foil(2, 3, 6, -7, "n"));
		System.out.println(Calculate.isDivisibleBy(10, 2));
		System.out.println(Calculate.absValue(-7));
		System.out.println(Calculate.max(3, 5));
		System.out.println(Calculate.round2(-5.356));
		System.out.println(Calculate.exponent(2,3));
		System.out.println(Calculate.factorial(4));
		System.out.println(Calculate.isPrime(1));
		System.out.println(Calculate.gcf(100,15));
		System.out.println(Calculate.sqrt(1));
		System.out.println(Calculate.quadForm(1, 12, 32));
	}

}