package assignments;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class Assignment4_Collections {

	public static void main(String[] args) {
		

    // ------------------ TestCase1 : Student Details ------------------
		
	Map<String,String>studentDetails_row1= new LinkedHashMap<String,String>();
	
	studentDetails_row1.put("Name", "John Doe");
	studentDetails_row1.put("Age", "Twenty");
	studentDetails_row1.put("Gender", "Male");
	studentDetails_row1.put("Roll Number", "SBA12345");
	studentDetails_row1.put("Grade", "A++");
	studentDetails_row1.put("Major", "Computer Science");
	studentDetails_row1.put("GPA", "3.8");
	studentDetails_row1.put("Email", "john@example.com");
	studentDetails_row1.put("PAN Number", "SDF6543210");
	studentDetails_row1.put("Address", "123 Elm St");
	
		
	Map<String,String> studentDetails_row2 = new LinkedHashMap<String,String>();
	
	studentDetails_row2.put("Name", "Jane Smith");
	studentDetails_row2.put("Age", "Twenty One");
	studentDetails_row2.put("Gender", "Female");
	studentDetails_row2.put("Roll Number", "SBA12346");
	studentDetails_row2.put("Grade", "B++");
	studentDetails_row2.put("Major", "Mathematics");
	studentDetails_row2.put("GPA", "3.5");
	studentDetails_row2.put("Email", "jane@example.com");
	studentDetails_row2.put("PAN Number", "REW6543211");
	studentDetails_row2.put("Address", "456 Oak St");

	
	Map<String,String> studentDetails_row3 = new LinkedHashMap<String,String>();
	
	studentDetails_row3.put("Name", "Mike Brown");
	studentDetails_row3.put("Age", "Twenty Two");
	studentDetails_row3.put("Gender", "Male");
	studentDetails_row3.put("Roll Number", "SBA12347");
	studentDetails_row3.put("Grade", "A+");
	studentDetails_row3.put("Major", "Physics");
	studentDetails_row3.put("GPA", "3.9");
	studentDetails_row3.put("Email", "mike@example.com");
	studentDetails_row3.put("PAN Number", "SDF6543212");
	studentDetails_row3.put("Address", "789 Pine St");

	
		
	// ------------------ TestCase2 : Employee Details ------------------
	
	Map<String,String> employeeDetails_row1= new LinkedHashMap<String,String>();
    
	employeeDetails_row1.put("Employee ID", "E001");
    employeeDetails_row1.put("Name", "Alice Green");
    employeeDetails_row1.put("Age", "Thirty");
    employeeDetails_row1.put("Gender", "Female");
    employeeDetails_row1.put("Department", "Engineering");
    employeeDetails_row1.put("Position", "Software Engineer");
    employeeDetails_row1.put("Salary", "75K Pounds");
    employeeDetails_row1.put("Email", "alice@example.com");
    employeeDetails_row1.put("PAN Number", "SDF6543210");  


    Map<String,String> employeeDetails_row2= new LinkedHashMap<String,String>();
    
    employeeDetails_row2.put("Employee ID", "E002");
    employeeDetails_row2.put("Name", "Bob Johnson");
    employeeDetails_row2.put("Age", "Thirty Five");
    employeeDetails_row2.put("Gender", "Male");
    employeeDetails_row2.put("Department", "Marketing");
    employeeDetails_row2.put("Position", "Marketing Manager");
    employeeDetails_row2.put("Salary", "85K Pounds");
    employeeDetails_row2.put("Email", "bob@example.com");
    employeeDetails_row2.put("PAN Number", "REW6543211");
   

    Map<String,String> employeeDetails_row3= new LinkedHashMap<String,String>();
    
    employeeDetails_row3.put("Employee ID", "E003");
    employeeDetails_row3.put("Name", "Carol White");
    employeeDetails_row3.put("Age", "Twenty Eight");
    employeeDetails_row3.put("Gender", "Female");
    employeeDetails_row3.put("Department", "Sales");
    employeeDetails_row3.put("Position", "Sales Executive");
    employeeDetails_row3.put("Salary", "65K Pounds");
    employeeDetails_row3.put("Email", "carol@example.com");
    employeeDetails_row3.put("PAN Number", "TYR6543212");
   
   
    // ------------------ TestCase3 : Product Details ------------------
    
    Map<String, String> productDetails_row1 = new LinkedHashMap<String,String>();
    
    productDetails_row1.put("Product ID", "P001");
    productDetails_row1.put("Name", "Laptop");
    productDetails_row1.put("Category", "Electronics");
    productDetails_row1.put("Price", "12K Pounds");
    productDetails_row1.put("Stock Quantity", "Not Available");
    productDetails_row1.put("Supplier Name", "Tech Supplies");
    productDetails_row1.put("Warranty", "2 years");
    productDetails_row1.put("Rating", "4.5 Stars");
    productDetails_row1.put("Manufacturing Date", "Aug 2023");
    productDetails_row1.put("Expiry Date", "Aug 2028");
   

    Map<String, String> productDetails_row2 = new LinkedHashMap<String,String>();
    
    productDetails_row2.put("Product ID", "P002");
    productDetails_row2.put("Name", "Desk Chair");
    productDetails_row2.put("Category", "Furniture");
    productDetails_row2.put("Price", "150K Pounds");
    productDetails_row2.put("Stock Quantity", "Two");
    productDetails_row2.put("Supplier Name", "Office Depot");   
    productDetails_row2.put("Warranty", "1 year");
    productDetails_row2.put("Rating", "4 Stars");
    productDetails_row2.put("Manufacturing Date", "Sep 2024");
    productDetails_row2.put("Expiry Date", "N/A");
  
    
    Map<String, String> productDetails_row3 = new LinkedHashMap<String,String>();
    
    productDetails_row3.put("Product ID", "P003");
    productDetails_row3.put("Name", "Coffee Maker");
    productDetails_row3.put("Category", "Kitchen");
    productDetails_row3.put("Price", "75 Pounds");
    productDetails_row3.put("Stock Quantity", "Two Hundred");
    productDetails_row3.put("Supplier Name", "KitchenWorld");
    productDetails_row3.put("Warranty", "6 months");
    productDetails_row3.put("Rating", "4.2 Stars");
    productDetails_row3.put("Manufacturing Date", "Jan 2025");
    productDetails_row3.put("Expiry Date", "Jan 2027");
  
    
	//------------   Store all test data in Map -------------------
    
    Map<String, Map<String, String>> testData = new LinkedHashMap<>();
    testData.put("StudentDetails_Row1", studentDetails_row1);
    testData.put("StudentDetails_Row2", studentDetails_row2);
    testData.put("StudentDetails_Row3", studentDetails_row3);

    testData.put("EmployeeDetails_Row1", employeeDetails_row1);
    testData.put("EmployeeDetails_Row2", employeeDetails_row2);
    testData.put("EmployeeDetails_Row3", employeeDetails_row3);

    testData.put("ProductDetails_Row1", productDetails_row1);
    testData.put("ProductDetails_Row2", productDetails_row2);
    testData.put("ProductDetails_Row3", productDetails_row3); 

    
  //---------Store all maps in a List----------------
	  
  	List<Map<String, String>> allData = new ArrayList<Map<String, String>>();
       allData.add(studentDetails_row1);
       allData.add(studentDetails_row2);
       allData.add(studentDetails_row3);
       
       allData.add(employeeDetails_row1);
       allData.add(employeeDetails_row2);
       allData.add(employeeDetails_row3);
       
       allData.add(productDetails_row1);
       allData.add(productDetails_row2);
       allData.add(productDetails_row3);


  // ------------------ Print ALL DATA ------------------
       
       System.out.println("===== STUDENT DETAILS =====");
       System.out.println(allData.get(0));
       System.out.println(allData.get(1));
       System.out.println(allData.get(2));

       System.out.println("\n===== EMPLOYEE DETAILS =====");
       System.out.println(allData.get(3));
       System.out.println(allData.get(4));
       System.out.println(allData.get(5));

       System.out.println("\n===== PRODUCT DETAILS =====");
       System.out.println(allData.get(6));
       System.out.println(allData.get(7));
       System.out.println(allData.get(8));
    
  
  //Print the data from Product Details > Supplier Name > Office Depot
   
   System.out.println("\n=======PRODUCT DETAILS - SUPPLIER Office Depot =========");
   System.out.println(productDetails_row2.get("Supplier Name"));
	
		
	}

} 
