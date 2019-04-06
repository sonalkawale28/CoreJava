
public class Pattern {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Program for 54321");
		
		  int i, j,k, n=5; 
		  
	        // outer loop to handle number of rows 
	        //  n in this case 
	        for(i=0; i<n; i++) 
		  	//  for (i=4;i>=1; i--)
	        { 
	        	for (k=4;k>=i; k--)
	        	{
	        		
	            //  inner loop to handle number of columns 
	            //  values changing acc. to outer loop     
	            for(j=0; j<i; j++) 
	            { 
	                // printing stars 
	            	 System.out.print(" "); 
	                System.out.print(i); 
	            } 
	  
	            // ending line after each row 
	            System.out.println(); 
	        } }
	   } 
	}