import java.util.Scanner;

/*
 * @author Arthur Foy
 * @version 10/3/2018
 */
public class QuadraticClient {
	
	public static void main(String[] args) {
		String keepGoing = "y";
		System.out.println("Welcome to the Quadratic Describer \nProvide values for coefficients for a, b, and c\n");
		
		Scanner userInput = new Scanner (System.in);
		while(!(keepGoing.equals("quit"))) {
			System.out.print("a: ");
			int a = userInput.nextInt();	
			System.out.print("b: ");
			int b = userInput.nextInt();
			System.out.print("c: ");
			int c = userInput.nextInt();
			System.out.println("\nDescription of the graph of:\ny = " + a +" x^2 + " + b + " x + " + c + "\n");
			System.out.print(Quadratic.quadrDescriber(a,b,c));
			System.out.println("\nDo you want to keep going? Type \"quit\" to end");
			keepGoing = userInput.next().toLowerCase();
			System.out.println();
				
			}
		
		}
	}


