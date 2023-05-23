package com;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Set;

public class DepartmentalStoreImpl implements DepartmentalStore{

	// key -> product   id -> Integer & value -> product instatne -> product
	Map<Integer, Product> db=new LinkedHashMap<>();
	Scanner scan=new Scanner(System.in);
	int totalBill=0;
	
	
	@Override
	public void addProduct()
	{
		db.put(1, new Product("chocalate", 10, 5));
		db.put(2, new Product("Biscuit", 20, 10));
		db.put(3, new Product("Icecream", 30, 20));
	}

	@Override
	public void displayProduct() 
	{
		Set<Integer> keys=db.keySet(); // 1 2 3
		
		for(int key : keys)
		{
			Product p= db.get(key);
			System.out.println("enter "+key+" to order "+p.getName());
			System.out.println("Available Quantity: " +p.getQuantity());
			System.out.println("Cost : Rs " +p.getCost());
			System.out.println("---------------------------------------");
		}
		
	}

	@Override
	public void buyProduct() {
		System.out.println("enter choice : ");
		int choice=scan.nextInt();
		//get() return null, when the key choice is not present
		Product p=db.get(choice);
		
		if(p!=null)
		{
			//logic for buying
			System.out.println("Buying "+p.getName());
			
			System.out.println("enter the Quantity");
			int quantity = scan.nextInt();
			
			if(quantity <= p.getQuantity())
			{
				// Calculating the current product cost
				int productCost = quantity * p.getCost();
				
				//Adding the current product cost to total bill
				totalBill=totalBill + productCost; // totalBill+=productCost
				
				//Updating the new Quantity
				p.setQuantity(p.getQuantity()- quantity);
				System.out.println("Ordered "+quantity+" "+ p.getName());
				System.out.println("Current Product cost is Rs. "+productCost);
				
				System.out.println("total Bill as of now: Rs. " + totalBill);
			}
			else
			{
				try
				{
					String message = "Invalid Quantity " + p.getName()+ " not available";
					throw new InvalidQuantityException(message);
				}
				catch(InvalidQuantityException e)
				{
					System.out.println(e.getMessage());
				}
			}
			
		}
		else
		{
			
			try
			{
				String message = "Invalid choice, kindly enter valid choice";
				throw new InvalidChoiceException(message);
			}
			catch(InvalidChoiceException e)
			{
				System.out.println(e.getMessage());
			}
		}
		
		
		
	}

	@Override
	public void checkOut() {
		System.out.println("Total Bill: Rs "+totalBill);
		System.out.println();
		
	}
	
	

}
