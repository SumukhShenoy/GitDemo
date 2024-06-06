import java.util.Scanner;

public class Scannerlearning {

	@SuppressWarnings("resource")
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scanner = new Scanner (System.in);
		
		System.out.println("Enter a number: ");
		int number = scanner.nextInt();
		System.out.println("The number you entered is: "+ number);
		
		System.out.println("Enter a Name: ");
		String name = scanner.next();
		System.out.println("You have entered: "+ name);
				
				
	}

}
