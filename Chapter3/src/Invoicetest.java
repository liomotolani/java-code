import java.util.Scanner;
public class Invoicetest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			Invoice invoice1 = new Invoice("1111","A dynamic keyword",1,1000,1000);
			
          System.out.printf("The product details are:%n Part number: %s%n Product description: %s%n Quantity: %d%n Price: N%.2f%n ", invoice1.getPartNumber(),invoice1.getPartDescription(),invoice1.getQuantity(),invoice1.getPricePerItem(),invoice1.getInvoiceAmount());
          
          
          Scanner input = new Scanner(System.in);
          
          System.out.print("Enter Part Number : ");
          String partNumber = input.next();
          
          System.out.printf("%nProduct Part Number is : %s%n", partNumber);
          
          
          
          System.out.print("Enter Part Description : ");
          String partDescription = input.next();
          System.out.printf("%nProduct Part Description is : %s%n", partDescription);
          
          
          
          System.out.print("Enter Quantity : ");
          int quantity = input.nextInt();
          
          System.out.printf("%nProduct quantity is : %d%n", quantity);
          
          
         System.out.print("Enter Price : ");
         double pricePerItem = input.nextDouble();
         
         System.out.printf("%nProduct Price is : %.2f%n", pricePerItem);
         
         System.out.printf("The product details are:%n Part number: %s%n Product description: %s%n Quantity: %d%n Price: N%.2f%n Total: N%.2f%n ", invoice1.getPartNumber(),invoice1.getPartDescription(),invoice1.getQuantity(),invoice1.getPricePerItem(),invoice1.getInvoiceAmount(),invoice1.getInvoiceAmount());
        
         
         
	}
}
