package corejava;

//import java.util.ArrayList;

public class java { // Class name should start with an uppercase letter

    public static void main(String[] args) {
        // TODO Auto-generated method stub
 //ARRAY-----------------------------------------------------------------------
    	
    	
       //String[] arr = new String[4]; // Declare and initialize a String array

       /*arr[1] = "abc"; // Assigning a string to index 1 of the array
        arr[2] = "class";  // Assigning a string to index 2 of the array
        arr[3] = "now"; // Assigning a string to index 3 of the array
        arr[0] = "0";   // Assigning a string to index 0 of the array
        */
    	
        //for( int i=0; i< arr.length; i++)
        //System.out.println(arr[i]); // Printing the element at index 2 of the array
        //...ENHANCED WAY...//
       /* for (String A: arr)
        {
        	System.out.println(A);
        }*/
 //Arraylist------------------------------------------------------------       
    	/* ArrayList<String> AL = new ArrayList<>(); // Declare and initialize ArrayList
         
         // Adding elements to the ArrayList
         AL.add("as");
         AL.add("asa");
         AL.add("asasa");
         AL.add("asakmk");
         
         // Iterating through the ArrayList and printing each element
         /* for (int i = 0; i < AL.size(); i++) {
             System.out.println(AL.get(i));
         }
        /*	for(String ALL: AL)
         {
        	 System.out.println(ALL);
         }*/

    	String S = " R ah ul Run s Fast er";
    	String[] Splitspring = S.split(" ");
    	for(String Sp : Splitspring)
    	{
    		System.out.println(Sp);
    	}
    	
    
    
    
    }

}
