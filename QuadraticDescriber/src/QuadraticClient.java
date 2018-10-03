import java.util.Scanner;

/*
 * @author Arthur Foy
 * @version 10/3/2018
 */
public class QuadraticClient {
	
	public static void main(String[] args) {
		Scanner userInput = new Scanner (System.in);
			System.out.println("What is a");
			int a = userInput.nextInt();	
			System.out.println("What is b");
			int b = userInput.nextInt();
			System.out.println("What is c");
			int c = userInput.nextInt();
			System.out.println(Quadratic.quadrDescriber(a,b,c));
		
	}

}
