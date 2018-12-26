import java.util.Scanner;
public class mileage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int total = 0;
		int milesPerGallonCounter = 0;
		
		System.out.print("Enter Miles driven or -1 to quit : ");
		int milesDriven = input.nextInt();
		System.out.print("Enter Gallon used : ");
		int gallonUsed = input.nextInt();
				

		while(milesDriven!= -1) {
			int milePerGallon = milesDriven / gallonUsed;
			System.out.printf("%n milespergallon is: %d%n", milePerGallon);
			total +=milePerGallon;
			milesPerGallonCounter++;
			
			System.out.print("Enter Miles driven or -1 to quit : ");
			 milesDriven = input.nextInt();
			System.out.print("Enter Gallon used : ");
			gallonUsed = input.nextInt();	
			
		}
		if(milesPerGallonCounter != 0) {
			double average = total / milesPerGallonCounter;
			
			System.out.printf("%n Total of the %d milespergallon entered are %d%n",milesPerGallonCounter, total);
			
			 System.out.printf("Milespergallon average is : ", average);// Still having issues with the average
		}
		else
		{
			System.out.println("No miles driven entered");
		}
		
		
		

	}

}
