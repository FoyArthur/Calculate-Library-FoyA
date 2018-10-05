/*This class will describe the graph of a quadratic function
 * @author Arthur Foy
 * @version 10/3/2018
 */
public class Quadratic {
	
	public static String quadrDescriber (double a, double b, double c) {
		String directionOpens;
		if(a > 0) {
			directionOpens = "up";
		} else {
			directionOpens = "down";
		}
		String intercepts;
		intercepts = quadForm(a,b,c);
		double x = round2(-b / (2 * a));
		double y = round2(a * x * x + b * x + c);
		String vertex = x + "and " + y;
		return ("Opens:" + directionOpens + "\nVertex: " + x + ", " +  y + "\nIntercepts: " + intercepts);
				
	}
	
	//returns the real roots, if there any, of a quadratic equation. If there are no real roots says that there are no real roots.
			//throws exception if num1 is zero
			public static String quadForm (double num1, double num2, double num3) {
				double numDiscriminant = discriminant(num1, num2, num3);
				
				//no roots
				if(numDiscriminant < 0) {
					return("no real roots");
				}
			
				//if num1 is zero, code will not work
				if(num1 == 0) throw new IllegalArgumentException ("The first number cannot be negative.");
				
				//only one root
				if(numDiscriminant == 0) { 
					return ((num2 * -1.0)/(2 * num1) + "");
				} else {
					//two roots
					double firstRealRoot = ((-num2 + sqrt(numDiscriminant))/ (2 * num1));
					double secondRealRoot = ((-num2 - sqrt(numDiscriminant))/(2 * num1));
					if(max(firstRealRoot, secondRealRoot) == firstRealRoot) {
						return (round2(secondRealRoot) + " and " + round2(firstRealRoot));
					} else {
						return (round2(firstRealRoot) + " and " + round2(secondRealRoot));
					}
				}
			}
	
			public static double max(double num1, double num2) {
				if(num1 >= num2) {
					return num1;
				} else {
					return num2;
				}
			}
			
			//returns value of discriminant based off the coeeficients of a quadratic equation
			public static double discriminant(double numberA, double numberB, double numberC) {
				return (numberB * numberB) - (4 * numberA * numberC);
			}
			
			//returns an approximation of the square root of a double. Throws exception if radicand is less than zero.
			public static double sqrt(double radicand){
				if(radicand < 0) throw new IllegalArgumentException ("The radicand cannot be negative.");
					double squareRoot = radicand;
				while(absValue(radicand - (squareRoot * squareRoot)) >= 0.005){
					squareRoot = (0.5 * (radicand/squareRoot + squareRoot));
				}
				return round2(squareRoot);
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
			
			public static double absValue(double number) {
				if(number < 0) {
					return number * -1;
				}else {
					return number;
				}
			}

}
