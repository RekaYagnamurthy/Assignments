package assignments;

public class Assignment6_Arrays_Datatypes_Operators {
	
	
	  public static void main(String[] args) {
			
			//Store student names and marks using 2 arrays
			
			 String[] studentNames = {"Suresh","Mahesh","Naresh"};
			 int[] studentMarks = {75,80,82};
			 
			 	
			// Array to store updated marks after adding 10
		     int[] updatedMarks = new int[studentMarks.length];

		    // Add 10 marks to each student and store in updatedMarks
		     updatedMarks[0] = studentMarks[0] + 10;
		     updatedMarks[1] = studentMarks[1] + 10;
		     updatedMarks[2] = studentMarks[2] + 10;
		     
		     // Print updated marks
		     System.out.println("Updated Marks:");
		     System.out.println(studentNames[0] + ": " + updatedMarks[0]);
		     System.out.println(studentNames[1] + ": " + updatedMarks[1]);
		     System.out.println(studentNames[2] + ": " + updatedMarks[2]);
		     
		     
		    // Calculate the sum of updated marks
		     
		     double averageMarks = ((updatedMarks[0] + updatedMarks[1] + updatedMarks[2]) *1.0 
		    		                /updatedMarks.length);
		     
			
		     System.out.println("Average Marks : " + averageMarks);
		     
	  }
}
