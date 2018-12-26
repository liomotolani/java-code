import java.util.Scanner;
public class Classaverage {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner input = new Scanner(System.in);
		
		int total=0;
		int gradeCounter=0;
		
		System.out.print("Enter grade or -1 to quit:");
		int grade = input.nextInt();
		
		 while(grade!= -1) {
			
			 total=total+grade;
			 gradeCounter = gradeCounter + 1;
			 
			 System.out.print("Enter grade or -1 to quit : ");
			 grade =input.nextInt();
		 }
		 if(gradeCounter!=0) {
			 double average = total / gradeCounter;
			 
			 System.out.printf("%n Total of the %d grades entered are %d%n",gradeCounter, total);  
			 
			 System.out.printf("Class average is : ", average);//My average isn't calculating,why?
		 }
		 
		 else
			 System.out.println("No grade were entered");
		 
	}

}
