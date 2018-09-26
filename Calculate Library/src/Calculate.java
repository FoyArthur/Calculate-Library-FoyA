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
	public static double toDegrees(double numRadians) {
		return (numRadians/3.14159 * 180);
	}
	
	//Converts angle measure given in degrees into radians.
	public static double toRadians(double numDegrees){
		return numDegrees/180 * 3.14159;
	}
	
	//returns value of discriminant based off the coeeficients of a quadratic equation
	public static double discriminant(double numberA, double numberB, double numberC) {
		return numberB * numberB - 4 * numberA * numberC;
	}
	
	//converts mixed number into improper fraction
	public static String toImproperFrac(int wholeNum, int numerator, int denominator) {
		int newNumerator =  wholeNum * denominator + numerator;
		return newNumerator + "/" + denominator;
	}

	//converts improper fraction into mixed number	
	public static String toMixedNum(int numerator, int denominator) {
		int wholeNum = numerator / denominator;
		int newNumerator = numerator - wholeNum * denominator;
		return wholeNum + "_" + newNumerator + "/" + denominator;
	}
	
	//converts binomial multiplication into a quadratic equation
	public static String foil(int a, int b, int c, int d, String varLetter) {
		int firstFoil = a * c;
		int secondFoil = a * d + b * c;
		int thirdFoil = b * d;
		return firstFoil + varLetter + "^2 + " + secondFoil + varLetter + " + " + thirdFoil;
	}
	
	//determines whether or not one integer is divisible by another.
	public static boolean isDivisibleBy(int num1, int num2) {
		if(num2 == 0) throw new IllegalArgumentException ("The second number cannot be negative");
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
		double rounded = number * 100;
		if(rounded % 1 >= 0.5){
			int roundedNum = (int) rounded + 1;
			double finalNum = (double) roundedNum/100.0;
			return finalNum;
		} else if(rounded % 1 <= -0.5){
			int roundedNum = (int) rounded - 1;
			double finalNum = (double) roundedNum/100.0;
			return finalNum;
		} else {
			int roundedNum = (int) rounded;
			double finalNum = (double) roundedNum/100.0;
			return finalNum;
			
		}
	}
	// END OF PART 2	
	
	
	//raises a double to a positive integer power
	public static double exponent(double base,int numExponent) {
		if(numExponent < 0) throw new IllegalArgumentException ("The exponent can't be negative");
		double result = base;
		for(int i = 1; i < numExponent; i++){
			result = result * base;
		}
		if(numExponent == 0) {
			return 1;
		}else {
			return result;
		}
	}
	
	//returns factorial of integer passed
	public static int factorial(int number){
		if(number < 0) throw new IllegalArgumentException("The number can't be negative.");
		int result = 1;
		for(int i = number; i > 0; i--){
			result = result * i;
		}
		return result;
	}
	
	//determines whether integer is prime or not.
		public static boolean isPrime(int number){
			int factor = 2;
			while(Calculate.isDivisibleBy(number, factor) != true){
				factor++;
			}
			if(number == 1) {
				return false;
			}else if(factor < number){
				return false;
			} else{
				return true;
			}
		}
		
		//returns greatest common factor of two integers
		public static int gcf(int num1, int num2){
			int gcFactor = 2;
			for(int i = 2; i <= num1; i++) {
				if(Calculate.isDivisibleBy(num1, i) == true && Calculate.isDivisibleBy(num2, i) == true){
					gcFactor = i;
				}
			}
			return gcFactor;
		}
	
		
		//returns an approximation of the square root of a double
		public static double sqrt(double radicand){
			if(radicand < 0) throw new IllegalArgumentException ("The radicand cannot be negative.");
			double squareRoot = radicand;
			while(Calculate.absValue(radicand - (squareRoot * squareRoot)) >= 0.005){
				squareRoot = (0.5 * (radicand/squareRoot + squareRoot));
			}
			return Calculate.round2(squareRoot);
		}
		
		public static String quadForm(int num1, int num2, int num3) {
			if(Calculate.discriminant(num1,num2,num3) < 0) {
				return ("no real roots");
			}
		}
}