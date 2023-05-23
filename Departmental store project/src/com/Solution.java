package com;

import java.util.Scanner;

public class Solution {
	public static void main(String[] args) {
		System.out.println("welcome to the XYZ Departmental sstore");
		System.out.println("=========================================");
		
		Scanner scan =new Scanner(System.in);
		// Upcastin to achive Abstraction
		DepartmentalStore store=new DepartmentalStoreImpl();
		
		store.addProduct(); //add only once
		
		int choice=1;
		while(choice==1) {
		store.displayProduct();
		store. buyProduct();
		System.out.println("press 1 to continue or any other num to checkout");
		choice = scan.nextInt();
		}
		store.checkOut(); // checkOut only once
		
		
	}
}
