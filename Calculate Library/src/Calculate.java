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
}
