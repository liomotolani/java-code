import java.util.Scanner;
public class BMI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int weight;
		int height;
		int bmi;
		
		System.out.print("Enter your weight: ");
		weight = input.nextInt();
		
		System.out.print("Enter your height: ");
		height = input.nextInt();
		
		bmi = (weight*703 / (height * height));
		
		System.out.printf("Your result is %d%n", bmi);
		System.out.println("VALUES");
		System.out.println("Underweight: less than 18.5");
		System.out.println("Normal: between 18.5 and 24.9");
		System.out.println("Overweight: between 25 and 29.9");
		System.out.println("Obese: 30 or greater");
		
		
		

	}

}
