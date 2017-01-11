package com.unoopen.store;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Store {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		// get the input for number of Items:
		System.out.println("Enter The number of Items:");
		int no_of_items = Integer.parseInt(sc.nextLine());

		// Reading The Items
		List<Item> list = new ArrayList<Item>();

		for (int i = 0; i < no_of_items; i++) {
			String itemName = sc.nextLine();
			String description = sc.nextLine();
			int price = Integer.parseInt(sc.nextLine());
			Item Ite = new Item(itemName, description, price);
			list.add(Ite);
		}

		for (Item it : list) {
			System.out.println(it.toString());
		}
	}
}
