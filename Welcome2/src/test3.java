import java.util.Scanner;
public class test3 {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		int number1;
		int number2;
		int  number3;
		int   sum;
		int  product;
		int  average;
		System.out.print("Enter first number: ");
		number1 = input.nextInt();
		System.out.print("Enter second number: ");
		number2 = input.nextInt();
		System.out.print("Enter second number: ");
		number3 = input.nextInt();

		if((number1 > number2 && number1 > number3)) {
			System.out.printf("(%d>%d%n && %d>%d%n)", number1, number2, number3 );
		};
		if(number3 < number1) {
			System.out.printf("%d<%d%n", number3, number1);
		};
		
		
		sum = number1 + number2 + number3;
		product = number1 * number2 * number3;
		average = sum/3;
		
		
		System.out.printf(" Sum is %d%n", sum);
		System.out.printf(" Product is %d%n", product);
		System.out.printf(" Average is %d%n", average);
		System.out.println(number1+ " is larger");
		System.out.println(number3+ " is smallest");
		
	};
	
	
	
	
}
