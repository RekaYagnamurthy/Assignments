package assignments.Assignment3;

public class EmpGroups {

	public static void main(String[] args) {
		
	// Creating object for Employees class
		    
		Employees empDetails = new Employees ();
		
    
	// Arrays to store employee names and IDs
		
		String [] empNames = {empDetails.empName1,empDetails.empName2,empDetails.empName3};
		int [] empIDs = {empDetails.empId1,empDetails.empId2,empDetails.empId3};
		
		
    // print each employee's name along with their corresponding ID.
		
		System.out.println("Employee Name:" + empNames[0] + "," + "Employee ID:" + empIDs[0]);
		System.out.println("Employee Name:" + empNames[1] + "," + "Employee ID:" + empIDs[1] );
		System.out.println("Employee Name:" + empNames[2] + "," + "Employee ID:" + empIDs[2]);
		
		

	}

}
