import java.util.Scanner;

public class JumpingStatements {

	public static void main(String[] args) {
    System.out.println("Enter a number for the range =");
     Scanner scan=new Scanner(System.in);
     int range=scan.nextInt();
     for (int i=1;i<=range;i++)
     {
    	 if (i%3==0) {
    		 System.out.println("Divisible by 3");
    		 break;
    	 }else {
    		 System.out.println("Not divisible by 3");
    	 }
    	 System.out.println("Within the body of for loop");
     }
     System.out.println("--- The End---");
	}
}
