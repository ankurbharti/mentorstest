package mentorstest;


import java.util.*;

public class arraylist {
	
	    public static void main(String args[])
	    {
	  
	        // Get the ArrayList
	        ArrayList<String>
	            list = new ArrayList<String>();
	  
	        // Populate the ArrayList
	        list.add("30");
	        list.add("20");
	        list.add("50");
	        list.add("10");
	       
	  
	        // Print the unsorted ArrayList
	        System.out.println("Unsorted ArrayList: "
	                           + list);
	  
	        // Sorting ArrayList in descending Order
	        // using Collection.sort() method
	        // by passing Collections.reverseOrder() as comparator
	        Collections.sort(list, Collections.reverseOrder());
	  
	        // Print the sorted ArrayList
	        System.out.println("Sorted ArrayList "
	                           + "in Descending order : "
	                           + list);
	    }
	}

