import java.util.Scanner;

/*
 * @author Arthur Foy
 * @version 10/3/2018
 */
public class QuadraticClient {
	
	public static void main(String[] args) {
		String keepGoing = true;
		
			Scanner userInput = new Scanner (System.in);
			while(keepGoing == true) {
			System.out.print("a:");
			int a = userInput.nextInt();	
			System.out.print("b:");
			int b = userInput.nextInt();
			System.out.print("c:");
			int c = userInput.nextInt();
			System.out.print(Quadratic.quadrDescriber(a,b,c));
			System.out.print("\nDo you want to keep going? Type \"quit\" to end");
			String keepGoing = userInput.nextLine();
			if(keepGoing == "quit") {
				keepGoing = false;
			}
		
		}
	}

}
