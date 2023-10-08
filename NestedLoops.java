
public class NestedLoops {

	public static void main(String[] args) {
		System.out.println("Enter into the loop");
    for (int i=1;i<=3;i++) {
    	System.out.println("i="+i);
    	int j=1;
    	do
    	{
    		System.out.println("j="+j);
    		j++;
    	}
    	while(j<=2);
    	System.out.println("Out of inner loop");
    }
System.out.println("Outer of outer loop");
	}
}
