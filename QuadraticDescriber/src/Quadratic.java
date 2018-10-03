/*This class will describe the graph of a quadratic function
 * @author Arthur Foy
 * @version 10/3/2018
 */
public class Quadratic {
	
	public static String quadrDescriber (double a, double b, double c) {
		String directionOpens;
		if(x > 0) {
			directionOpens = "up";
		} else {
			directionOpens = "down";
		}
		String vertex;
		
	}
	
	//returns the real roots, if there any, of a quadratic equation. If there are no real roots says that there are no real roots.
			//throws exception if num1 is zero
			public static String quadForm (int num1, int num2, int num3) {
				double numDiscriminant = Calculate.discriminant(num1, num2, num3);
				
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
					double firstRealRoot = ((-num2 + Calculate.sqrt(numDiscriminant))/ (2 * num1));
					double secondRealRoot = ((-num2 - Calculate.sqrt(numDiscriminant))/(2 * num1));
					if(Calculate.max(firstRealRoot, secondRealRoot) == firstRealRoot) {
						return (Calculate.round2(secondRealRoot) + " and " + Calculate.round2(firstRealRoot));
					} else {
						return (Calculate.round2(firstRealRoot) + " and " + Calculate.round2(secondRealRoot));
					}
				}
			}

}
