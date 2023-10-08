import java.util.Scanner;

public class NestedIf {

	public static void main(String[] args) {
	Scanner scan=new Scanner(System.in);
	int a=scan.nextInt();
	if (a>=10) 
	{
		System.out.println(" If Body ");
	 if (a>15)
	{
		System.out.println("Inner if body");
	}else {
		System.out.println("Inner Else body");
	}
	}
	else
	{
		System.out.println("Else body");
		if (a>5) {
			System.out.println("Nested if body");
		}else {
			System.out.println("nested else body");
		}
	
	}
	System.out.println("The END");
	}
}
