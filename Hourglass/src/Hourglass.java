//This program creates an hourglass
//@author Arthur Foy
//@version 10/24/18
public class Hourglass {
	public static void main(String[] args) {
		base();
		topHalf();
		System.out.println("     ||");
		bottomHalf();
		base();
	}	
	
	public static void base(){
		System.out.println("|\"\"\"\"\"\"\"\"\"\"|");
	}
	
	public static void topHalf(){
		for(int i = 8; i >= 2; i-=2){
			for(int j = 8; j >= i; j-=2){
				System.out.print(" ");
			}
			System.out.print("\\");
			for(int x = 1 ; x != i +1; x++){
				System.out.print(":");
			}
			System.out.println("/");
		
		}
	}
	
	public static void bottomHalf(){
		for(int i = 2; i <= 8; i+=2){
			for(int j = 8; j >= i; j-=2){
				System.out.print(" ");
			}
			System.out.print("/");
			for(int x = 1 ; x != i + 1; x++){
				System.out.print(":");
			}
			System.out.println("\\");
		
		}
	}
}
