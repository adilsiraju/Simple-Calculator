import java.util.Scanner;

public class MainCalculator {

	public static void main(String[] args) {
		
		System.out.println("Welcome to simple calculator !");
		Scanner sc = new Scanner(System.in);
		
		Operations op = new Operations();
		
		int opt = 0;
		do {
			
			System.out.print("What would you like to do: \n1. Add\t2. Subtract\t3. Multiply\t4. Divide\t5. Exit\n");
			opt = sc.nextInt();
			
			switch(opt) {
				case 1: 
					op.Addition();
					op.Display();
					break;
				case 2: 
					op.Subtract();
					op.Display();
					break;
				case 3: 
					op.Multiply();
					op.Display();
					break;
				case 4: 
					op.Divide();
					op.Display();
					break;
				case 5:
					break;
				default:
					System.out.println("Invalid");
					break;
			}
		} while (opt != 5);
		System.out.println("Thank you for using ABC Calculator");

		sc.close();
	}

}
