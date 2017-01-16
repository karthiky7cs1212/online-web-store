package com.unoopen.store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ConsoleItemReader implements ItemReader {

	public List<Item> read() {
		Scanner sc = new Scanner(System.in);

		// get the input for number of Items:
		System.out.println("Enter The number of Items:");
		int noOfItems = Integer.parseInt(sc.nextLine());

		// Reading The Items
		List<Item> list = new ArrayList<Item>();

		for (int i = 0; i < noOfItems; i++) {
			System.out.println("Item Name:");
			String itemName = sc.nextLine();
			System.out.println("Item Description:");
			String description = sc.nextLine();
			System.out.println("Item Price:");
			int price = Integer.parseInt(sc.nextLine());
			Item Item = new Item(itemName, description, price);
			list.add(Item);
		}
		
		return list;
	}
}
