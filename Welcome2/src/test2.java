import java.util.Scanner;
public class test2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		
		System.out.print("Enter first number: ");
		number1 = input.nextInt();
		
		System.out.print("Enter second number: ");
	    number2 = input.nextInt();
	    
	    if(number1 == number2)
	    System.out.printf("These numbers are equal %d == %d%n", number1, number2);
	    
	    if(number1 > number2)
	    System.out.printf("%d > %d%n", number1, number2);
	    System.out.println(number1+ " is larger");
	    

	}

}
