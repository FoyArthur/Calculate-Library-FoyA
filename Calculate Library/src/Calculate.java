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
	
	public static double average(double num, double num2) {
		return (num + num2)/2;
	}
	
	public static double average(double num, double num2, double num3) {
		return (num + num2 + num3)/3;
	}
	
	public static double toDegrees(double radians) {
		return radians/3.14159 * 180;
	}
	
	public static double toRadians(double degrees){
		return degrees/180 * 3.14159
	}
	
	public static double discriminant(double numberA, double numberB, double numberC) {
		return numberB * numberB - 4 * numberA * numberC;
	}
	
	public static int toImproperFrac(int number, int number2, int number3) {
		return;
	}
}
