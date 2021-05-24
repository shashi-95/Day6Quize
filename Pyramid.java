import java.util.*;
public class Pyramid {
	
	public static void main(String args[]) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Size");
		int size = sc.nextInt();
		 for (int i=0; i<size; i++)
	        {
	           for (int j=size-i; j>1; j--)
	            {
	                
	                System.out.print(" ");
	            }
	  
	            
	            for (int j=0; j<=i; j++ )
	            {
	                
	                System.out.print(" "+ (i+1));
	                
	            }
	  
	      
	            System.out.println();
	        }
	    }
	     
		
		
	}


