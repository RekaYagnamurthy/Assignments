package assignments;

public class Assignment9_SecondThirdLargest {

	public static void main(String[] args) {
	
	     int[] a = {12, 34, 11, 36, 87, 98, 93};

	     // Sort the array 
	     for (int i = 0; i < a.length; i++) {
	            for (int j = i + 1; j < a.length; j++) {

	                if (a[i] > a[j]) {
	                    int temp = a[i];
	                    a[i] = a[j];
	                    a[j] = temp;
	                }
	            }
	        }

	        // Print second and third largest
	        System.out.println("Second Largest: " + a[a.length - 2]);
	        System.out.println("Third Largest: " + a[a.length - 3]);

	}

}
