package assignments;

import java.util.HashMap;
import java.util.Map;

public class Assignment10_EmployeeHikeCalculation {

	public static void main(String[] args) {
		
		 // Employee data
        String[] names = {"Alice Johnson", "Bob Smith", "Carol Davis", "David Brown", "Eva Green"};
        double[] salaries = {75000.0, 68000.0, 82000.0, 90000.0, 60000.0};
        double[] experience = {5.1, 3.2, 7.1, 10.2, 2.4};
        double[] ratings = {4.2, 3.8, 4.5, 2.5, 3.5};

        // Map to store output
        Map<String, Double> output = new HashMap<String, Double>();

        // Loop through employees
        for (int i = 0; i < names.length; i++) {

            double variablePayPercent = 0;
            double bonus = 0;
            double reward = 0;

            // Rating based conditions
            if (ratings[i] >= 4.0) {
                variablePayPercent = 15.0;
                bonus = 1500;
            } else if (ratings[i] >= 3.0 && ratings[i] < 4.0) {
                variablePayPercent = 10.0;
                bonus = 1200;
            } else {
                variablePayPercent = 3.0;
                bonus = 300;
            }

            // Experience based reward
            if (experience[i] >= 5) {
                reward = 5000;
            }

            // Hike calculation
            double hike = (salaries[i] * variablePayPercent / 100) + bonus + reward;
            double hikePercentage = hike / salaries[i];

            // Store in map
            output.put(names[i], hikePercentage);
        }

        // Print results
        System.out.println("Employee Hike Percentage:");
        System.out.println("*************************");
        for (String name : output.keySet()) {
            System.out.println(name + " : " + output.get(name));
        }

	}

}
