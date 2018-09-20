/* This class contains the methods to do various math related topics
 * @author Arthur Foy
 * @version 9/6/2018
 */
public class Calculate {

	//This returns an integer squared.
	public static int square(int number) {
		return number * number;
	}
	
	//This returns the integer cubed.
	public static int cube(int number) {
		return number * number * number;
	}
	
	// returns average of two doubles
	public static double average(double number1, double number2) {
		return (number1 + number2)/2;
	}
	
	//returns average of 3 doubles.
	public static double average(double number1, double number2, double number3) {
		return (number1 + number2 + number3)/3;
	}
	
	// Converts angle measure given in radians into degrees.
	public static double toDegrees(double radians) {
		return (radians/3.14159 * 180);
	}
	
	//Converts angle measure given in degrees into radians.
	public static double toRadians(double degrees){
		return degrees/180 * 3.14159;
	}
	
	//returns value of discriminant based off the coeeficients of a quadratic equation
	public static double discriminant(double numberA, double numberB, double numberC) {
		return numberB * numberB - 4 * numberA * numberC;
	}
	
	//converts mixed number into improper fraction
	public static String toImproperFrac(int num1, int num2, int num3) {
		int numerator = num1 * num3 + num2;
		return numerator + "/" + num3;
	}

	//converts improper fraction into mixed number	
	public static String toMixedNum(int num1, int num2) {
		int wholeNum = num1 / num2;
		int remainder = num1 - wholeNum * num2;
		return wholeNum + " " + remainder + "/" + num2;
	}
	
	//converts binomial multiplication into a quadratic equation
	public static String foil(int num1, int num2, int num3, int num4, String var) {
		int firstFoil = num1 * num3;
		int secondFoil = num3 - num1;
		int thirdFoil = num2 * num4;
		return firstFoil + var + "^2 + " + secondFoil + var + " + " + thirdFoil;
	}
	
	//determines whether or not one integer is divisible by another.
	public static boolean isDivisibleBy(int num1, int num2) {
		if(num1 % num2 == 0 || num2 % num1 == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	//returns absolute value of double
	public static double absValue(double number) {
		if(number < 0) {
			return number * -1;
		}else {
			return number;
		}
	}
	
	//returns the larger of two doubles
	public static double max(double num1, double num2) {
		if(num1 >= num2) {
			return num1;
		} else {
			return num2;
		}
	}
	
	//returns the larger of three doubles
	public static double max(double num1, double num2, double num3){
		if(num1 >= num2 && num1 >= num3){
			return num1;
		} else if(num2 >= num1 && num2 >= num3){
			return num2;
		} else {
			return num3;
		}	
	}
	
	//returns the smaller of two integers.	
	public static int min(int num1, int num2){
		if(num1 <= num2){
			return num1;
		} else{
			return num2;
		}
	}
	
	//rounds a double correctly to 2 decimal places
	public static double round2(double number){
<<<<<<< HEAD
<<<<<<< HEAD
		if(number % 100 >= .05 || number % 100 <= -.05){
			return number + 1;
=======
		double rounded = number * 100;
		if(rounded % 1 >= 0.5){
			int roundedNum = (int) rounded + 1;
			double finalNum = (double) roundedNum/100.0;
			return finalNum;
		} else if(rounded % 1 <= -0.5){
			int roundedNum = (int) rounded - 1;
			double finalNum = (double) roundedNum/100.0;
			return finalNum;
>>>>>>> 0f5e03e2ed58624a49720a5729adc32fe4f9a2b7
=======
		double rounded = number * 100;
		if(rounded % 1 >= 0.5){
			int roundedNum = (int) rounded + 1;
			double finalNum = (double) roundedNum/100.0;
			return finalNum;
		} else if(rounded % 1 <= -0.5){
			int roundedNum = (int) rounded - 1;
			double finalNum = (double) roundedNum/100.0;
			return finalNum;
>>>>>>> 0f5e03e2ed58624a49720a5729adc32fe4f9a2b7
		} else {
			int roundedNum = (int) rounded;
			double finalNum = (double) roundedNum/100.0;
			return finalNum;
			
		}
	}
	// END OF PART 2	
	
	
	
	public static double exponent(double number,int number2) {
		double result = number;
		for(int i = 1; i < number2; i++){
			result = result * number;
		}
		return result;
	}
	
	public static int factorial(int number){
		int result = 1;
		for(int i = number; i > 0; i--){
			result = result * i;
		}
		return result;
	}
	
	public static boolean isPrime(int number){
		if(Calculate.isDivisibleBy(number, 2) == false || number == 2){
			return true;
		} else {
			return false;
		}
	}
	
}