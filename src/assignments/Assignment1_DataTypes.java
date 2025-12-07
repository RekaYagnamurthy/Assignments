package assignments;

public class Assignment1_DataTypes {

	public static void main(String[] args) {
	
		double temperature = 25.5;
		boolean hasOrderPlaced = true;
		String phoneNumber = "123-456-7890";
		double moneyInAccount = 1000.50;
		String emailAddress = "john.doe@example.com";
		double latitude = 37.7749;
		double longitude = -122.4194;
		boolean isMarried = false;
		String occupation = "Software Engineer";
		String favouriteColour = "Blue";
	    int currentYear = 2023;
		int numberOfFollowers = 1000000;
		double movieRating = 7.5;
		char bloodType = 'A';
		String bookTitle = "To Kill a Mockingbird";
		int numberOfEmployees = 500;
		String timeOfEvent = "2:30 PM";
		String nameOfCountry = "United States";
		String colorOfEye = "Brown";
		String placeOfBirth = "New York City";
		double distanceBetweenCities = 200.5;
		
		System.out.println("""
				temperature: %s
				hasOrderPlaced: %s
				phoneNumber: %s
				moneyInAccount: %s
				emailAddress: %s
				latitude: %s
				longitude: %s
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
		
				
				
