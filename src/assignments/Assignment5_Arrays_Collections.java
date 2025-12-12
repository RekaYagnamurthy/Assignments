package assignments;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Assignment5_Arrays_Collections {

	public static void main(String[] args) {
	

	/*1.Create Lists with area of top 5 largest cities. Print the total area of the 3rd and 4th
		cities combined.*/		
		
	  //  Create Lists with area of top 5 largest cities.
			
	   List<Double> citiAreas = new ArrayList<Double> ();
	   
	   citiAreas.add(8500.23);
	   citiAreas.add(555389.21);
	   citiAreas.add(105389.05);
	   citiAreas.add(3900.0);
	   citiAreas.add(12865.55);
	   
	   //Total area of 3rd and 4th cities
	   
	   double thirdCity = citiAreas.get(2);
	   double fourthCity = citiAreas.get(3);
	     
	  System.out.println("1.Total area of 3rd & 4th citis:"+ (thirdCity+fourthCity));
	  
	  
	  
	  System.out.println("                    "); 
	  System.out.println("**********************************************************");
	  
	  
	/*2. Create a set of the top 10 most visited tourist attractions in the world and print out all
	  of them and its size.*/
	  
	  Set<String> touristAttractions = new HashSet<String>();
	  
	  touristAttractions.add("Statue of Liberty");
	  touristAttractions.add("Taj Mahal");
	  touristAttractions.add("Charminar");
	  touristAttractions.add("Eiffel Tower");
	  touristAttractions.add("Great Wall of China");
	  touristAttractions.add("Las Vegas");
	  touristAttractions.add("Disneyland");
	  touristAttractions.add("Grand Canyon");
	  touristAttractions.add("Niagara Falls");
	  touristAttractions.add("Machu Picchu");
	  
	  System.out.println("                    "); 
	  System.out.println("2.Top most visited tourist attractions in the world: "+ touristAttractions.size());
	  System.out.println("                    "); 
	  System.out.println("**********************************************************");
	   
	  
	/* 3. Create an array of 10 numbers (any 10 numbers) and print out the Average of 5th and
	      6th Value.*/
	  
	  // Create an array of 10 numbers
	  
	  int[] numbers = {10, 25, 33, 48, 52, 67, 74, 80, 88, 92};
	  
	  double average = ((numbers[4] + numbers[5]) /2.0);
	  
	  System.out.println("                    "); 
	  System.out.println("3.Average of 5th and 6th Value : " + average);
	  System.out.println("                    "); 
	  System.out.println("**********************************************************");
	  
	/* 4. Create a list of the top 5 highest-grossing movies of all time and print out the third
	     movie on the list..*/
	  
	  List<String> movies = new ArrayList<String>();
	  
	  movies.add("Avengers:Endgame");
	  movies.add("Avatar");
	  movies.add("Bahubali");
	  movies.add("Titanic");
	  movies.add("Star Wars");
	  
	  System.out.println("                    "); 
	  System.out.println("4.The third highest-grossing movie is : " + movies.get(3));
	  System.out.println("                    "); 
	  System.out.println("**********************************************************");
	  
	}

}
