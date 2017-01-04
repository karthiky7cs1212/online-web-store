package tutorial.store;

import java.util.*;

public class Store {

	private String[] items;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// get the input for number of Items:
		System.out.println("Enter The number of Items:");
		int no_of_items = sc.nextInt();

		// TODO Modify the following code to read item name, description and price and store details in a class called Item.
		
		// TODO Store item in a list of type Item instead of array
		
		// store into String array
		String items[] = new String[no_of_items];
		System.out.println("Enter Item Names: ");

		for (int i = 0; i < items.length; i++) {
			items[i] = sc.next();
		}

		for (String item : items) {
			System.out.println(item);
		}
	}
}
