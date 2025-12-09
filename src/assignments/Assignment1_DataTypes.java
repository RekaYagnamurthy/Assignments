package assignments;

public class Assignment1_DataTypes {

	public static void main(String[] args) {
		
		//Temperature of a city in degrees Celsius: 25.5
		double temperature = 25.5;
		
		//Whether a customer has placed an order: true		
		boolean hasOrderPlaced = true;
	
		//Person's phone number: "123-456-7890"	
		String phoneNumber = "123-456-7890";
		
		//Amount of money in a customer's bank account: 1000.50
		double moneyInAccount = 1000.50;
		
		//Person's email address: "john.doe@example.com"
		String emailAddress = "john.doe@example.com";
		
		//Coordinates of a location (latitude, longitude): 37.7749, -122.4194
		double latitude = 37.7749;
		double longitude = -122.4194;
		
		//Person's marital status: true or false
		boolean isMarried = false;
		
		//Person's occupation: "Software Engineer"
		String occupation = "Software Engineer";
		
		//Person's favourite colour: "Blue"
		String favouriteColour = "Blue";
	    
		//Current year: 2023
		int currentYear = 2023;
		
		//Number of followers on a social media platform: 1,000,000
		String numberOfFollowers = "1,000,000";
		
		//Rating of a movie: 7.5
		double movieRating = 7.5;
		
		//Person's blood type: 'A'
		char bloodType = 'A';
		
		//Title of a book: "To Kill a Mockingbird"
		String bookTitle = "To Kill a Mockingbird";
		
		//Number of employees in a company: 500
		int numberOfEmployees = 500;
		
		//Time of an event: 2:30 PM
		String timeOfEvent = "2:30 PM";
		
		//Name of a country: "United States"
		String nameOfCountry = "United States";
		
		//Person's eye color: "Brown"
		String colorOfEye = "Brown";
		
		//Person's birthplace: "New York City"
		String placeOfBirth = "New York City";
		
		//Distance between two cities: 200.5
		double distanceBetweenCities = 200.5;
		
		//Print 
		System.out.println("""
				temperature: %s
				hasOrderPlaced: %s
				phoneNumber: %s
				moneyInAccount: %s
				emailAddress: %s
				latitude & longitude: %s, %s
				isMarried: %s
				occupation: %s
				favouriteColour: %s
				currentYear: %s
				numberOfFollowers: %s
				movieRating: %s
				bloodType: %s
				bookTitle: %s
				numberOfEmployees: %s
				timeOfEvent: %s
				nameOfCountry: %s
				colorOfEye: %s
				placeOfBirth: %s
				distanceBetweenCities: %s  """.formatted(temperature,hasOrderPlaced,phoneNumber
				,moneyInAccount,emailAddress,latitude,longitude,isMarried,occupation,
				favouriteColour,currentYear,numberOfFollowers,movieRating,bloodType,
				bookTitle,numberOfEmployees,timeOfEvent,nameOfCountry,colorOfEye,
				placeOfBirth,distanceBetweenCities));
	}}
		
				
				
