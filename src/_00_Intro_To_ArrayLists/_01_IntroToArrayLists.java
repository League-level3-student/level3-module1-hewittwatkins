package _00_Intro_To_ArrayLists;

import java.util.ArrayList;

public class _01_IntroToArrayLists {
    public static void main(String[] args) {
        // 1. Create an array list of Strings
        //    Don't forget to import the ArrayList class
    	
    	ArrayList<String> people = new ArrayList<String>();
    	

        // 2. Add five Strings to your list
    	for (int i = 0; i < 5; i++) {
    		System.out.println("" + i);
    		people.add("Bob" + i);
    		System.out.println(people.get(i));
    	}

        // 3. Print all the Strings using a standard for-loop
    	
    	// ^^^

        // 4. Print all the Strings using a for-each loop
    	
    	for (String person: people) {
    		System.out.println(person);
    	}

        // 5. Print only the even numbered elements in the list.
    	
    	for (int i = 0; i < 5; i+=2) {
    		System.out.println(people.get(i));
    	}

        // 6. Print all the Strings in reverse order.
    	
    	for (int i = 4; i >= 0; i--) {
    		System.out.println(people.get(i));
    	}
    	people.add("Albert");

        // 7. Print only the Strings that have the letter 'e' in them.
    	for (int i = 0; i < people.size(); i++) {
    		if (people.get(i).contains("e")) {
    			System.out.println(people.get(i));
    		}
    	}
        
    }
}
