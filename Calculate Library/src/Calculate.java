/* This class contains the methods to do various math related topics
 * @author Arthur Foy
 * @version 9/6/2018
 */
public class Calculate {

	public static int square(int number) {
		return number * number;
	}
	
	public static int cube(int number) {
		return number * number * number;
	}
	
	public static double average(double number1, double number2) {
		return (number1 + number2)/2;
	}
	
	public static double average(double number1, double number2, double number3) {
		return (number1 + number2 + number3)/3;
	}
	
	public static double toDegrees(double radians) {
		return (radians/3.14159 * 180);
	}
	
	public static double toRadians(double degrees){
		return degrees/180 * 3.14159;
	}
	
	public static double discriminant(double numberA, double numberB, double numberC) {
		return numberB * numberB - 4 * numberA * numberC;
	}
	
	public static String toImproperFrac(int num1, int num2, int num3) {
		int numerator = num1 * num3 + num2;
		return numerator + "/" + num3;
	}
	
	public static String toMixedNum(int num1, int num2) {
		int wholeNum = num1 / num2;
		int remainder = num1 - wholeNum * num2;
		return wholeNum + " " + remainder + "/" + num2;
	}
	
	public static String foil(int num1, int num2, int num3, int num4, String var) {
		int firstFoil = num1 * num3;
		int secondFoil = num3 - num1;
		int thirdFoil = num2 * num4;
		return firstFoil + var + "^2 + " + secondFoil + var + " + " + thirdFoil;
	}
	
	public static boolean isDivisibleBy(int num1, int num2) {
		if(num1 % num2 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public static double absValue(double number) {
		if(number < 0) {
			return number * -1;
		}else {
			return number;
		}
	}
	
	public static double max(double num1, double num2) {
		if(num1 >= num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
}
