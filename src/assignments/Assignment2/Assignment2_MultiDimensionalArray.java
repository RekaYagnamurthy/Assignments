package assignments.Assignment2;

public class Assignment2_MultiDimensionalArray {

	public static void main(String[] args) {
		
		/*
		  5 Semesters (first dimension)
		  2 groups per semester (second dimension):
		    [0] = Subject Names (6 subjects)
		    [1] = Status/Marks (6 subjects)
		  6 Subjects per group (third dimension)
		*/
      String[][][] semesterData = new String[5][2][6];
      
   // Semester 1 Subject Names
      semesterData[0][0][0] = "Mathematics I";
      semesterData[0][0][1] = "Physics";
      semesterData[0][0][2] = "Chemistry";
      semesterData[0][0][3] = "Computer Programming";
      semesterData[0][0][4] = "Engineering Drawing";
      semesterData[0][0][5] = "Basic Electrical Eng.";

      // Semester 1 Status/Marks
      semesterData[0][1][0] = "Pass(78)";
      semesterData[0][1][1] = "Pass(85)";
      semesterData[0][1][2] = "Fail(21)";
      semesterData[0][1][3] = "Pass(74)";
      semesterData[0][1][4] = "Pass(88)";
      semesterData[0][1][5] = "Pass(79)";

      // Semester 2 Subject Names
      semesterData[1][0][0] = "Mathematics II";
      semesterData[1][0][1] = "Mechanics";
      semesterData[1][0][2] = "Environmental Sci.";
      semesterData[1][0][3] = "Basic Electronics";
      semesterData[1][0][4] = "Engineering Physics";
      semesterData[1][0][5] = "Engineering Graphics";

      // Semester 2 Status/Marks
      semesterData[1][1][0] = "Pass(82)";
      semesterData[1][1][1] = "Pass(77)";
      semesterData[1][1][2] = "Pass(93)";
      semesterData[1][1][3] = "Fail(19)";
      semesterData[1][1][4] = "Fail(24)";
      semesterData[1][1][5] = "Pass(90)";

      // Semester 3 Subject Names
      semesterData[2][0][0] = "Data Structures";
      semesterData[2][0][1] = "Discrete Mathematics";
      semesterData[2][0][2] = "Digital Electronics";
      semesterData[2][0][3] = "Operating Systems";
      semesterData[2][0][4] = "Signals and Systems";
      semesterData[2][0][5] = "Object-Oriented Prog.";

      // Semester 3 Status/Marks
      semesterData[2][1][0] = "Pass(88)";
      semesterData[2][1][1] = "Pass(81)";
      semesterData[2][1][2] = "Pass(76)";
      semesterData[2][1][3] = "Fail(32)";
      semesterData[2][1][4] = "Pass(85)";
      semesterData[2][1][5] = "Pass(78)";

      // Semester 4 Subject Names
      semesterData[3][0][0] = "Algorithms";
      semesterData[3][0][1] = "Computer Networks";
      semesterData[3][0][2] = "Database Systems";
      semesterData[3][0][3] = "Microprocessors";
      semesterData[3][0][4] = "Communication Eng.";
      semesterData[3][0][5] = "Software Engineering";

      // Semester 4 Status/Marks
      semesterData[3][1][0] = "Pass(91)";
      semesterData[3][1][1] = "Pass(73)";
      semesterData[3][1][2] = "Fail(19)";
      semesterData[3][1][3] = "Pass(80)";
      semesterData[3][1][4] = "Pass(76)";
      semesterData[3][1][5] = "Pass(87)";

      // Semester 5 Subject Names
      semesterData[4][0][0] = "Probability & Stats";
      semesterData[4][0][1] = "Machine Learning";
      semesterData[4][0][2] = "Compiler Design";
      semesterData[4][0][3] = "Theory of Computation";
      semesterData[4][0][4] = "Embedded Systems";
      semesterData[4][0][5] = "Computer Graphics";

      // Semester 5 Status/Marks
      semesterData[4][1][0] = "Pass(86)";
      semesterData[4][1][1] = "Pass(88)";
      semesterData[4][1][2] = "Pass(84)";
      semesterData[4][1][3] = "Pass(95)";
      semesterData[4][1][4] = "Pass(73)";
      semesterData[4][1][5] = "Pass(90)";

      // Print Semester 2 Subject 4 and 5 names
      System.out.println("Semester 2 Subject 4: " + semesterData[1][0][3]);
      System.out.println("Semester 2 Subject 5: " + semesterData[1][0][4]);

      // Print Status/Marks of Semester 4 Subject 3 and Subject 6
      System.out.println("Semester 4 Subject 3 Status/Marks: " + semesterData[3][1][2]);
      System.out.println("Semester 4 Subject 6 Status/Marks: " + semesterData[3][1][5]);
  }
}