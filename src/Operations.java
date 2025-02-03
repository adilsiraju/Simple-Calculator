import java.util.Scanner;

public class Operations {
	int n1, n2, res;
	Scanner sc = new Scanner(System.in);
	
	void Addition() {
		System.out.println("Enter 2 numbers: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		res = n1 + n2;
	}
	
	void Subtract() {
		System.out.println("Enter 2 numbers: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		res = n1 - n2;
	}
	
	void Multiply() {
		System.out.println("Enter 2 numbers: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		res = n1 * n2;
	}
	
	void Divide() {
		System.out.println("Enter 2 numbers: ");
		n1 = sc.nextInt();
		n2 = sc.nextInt();
		res = n1 / n2;
	}
	
	void Display() {
		System.out.println("Result: "+res);
		System.out.println("______________________");
	}
}
