
/* Create java application for the following
   Accept 2 numbers from user & operation to perform
	1. Add 2.Subtract 3. Multiply 4.Divide 5.Exit 
	Display the result of the operation. 
	Java app must continue to run till user chooses exit option.
*/

import java.util.Scanner ;

class JavaCalci {
	
	public static void main (String [] args ){
		
		Scanner sc = new Scanner (System.in);
		
		boolean shouldContinue = true ;
		
		while( shouldContinue == true) {
			System.out.print("Enter the 1st value : ");
			double n1 = sc.nextDouble();
			System.out.print("Enter the 2nd value : ");
			double n2 = sc.nextDouble();
			
			System.out.println("Choose Option to Perform :");
			System.out.println("1. Add");
			System.out.println("2. Sub");
			System.out.println("3. Mul");
			System.out.println("4. Div");
			System.out.println("5. Exit");
			
			int choice = sc.nextInt();
			System.out.println("You Choice : " + choice);
			
			switch (choice) {
				case 1 : System.out.println("Addition is : " + (n1+n2));
						 break;
				case 2 : System.out.println("Difference is : " + (n1-n2));
						 break;
				case 3 : System.out.println("Multiplication is : " + (n1*n2));
						 break;
				case 4 : System.out.println("Division is : " + (n1/n2));
						 break;
				case 5 : System.out.println("Java Calculator Closed");
						 shouldContinue = false ;
						 break;
				default :System.out.println("Please Enter Valid Input");
						 break;
			}
		}

		sc.close();
	}
}
