package com.braindata.test;

import java.util.Scanner;

import com.braindata.operation.Operation;

public class Test {
public static void main(String[] args) {
	
	Operation o=new Operation();
	Scanner sc=new Scanner(System.in);
	while(true)
	{
	System.out.println("1.Create account\n2.Display balance\n3.Add money\n4.Withdrawl money\n5.Display Account Details\n ");
	System.out.println("Enter your choice:");
	int choice=sc.nextInt();
	switch(choice)
	{
	case 1:
		o.createaccount();
		System.out.println("your account created successfully");
		System.out.println("Thank you!!");
		System.out.println("===========================================");
		break;
		
	case 2:
		o.displaybalance();
		break;
		
	case 3:
		o.addmoney();
		break;
		
	case 4:
		o.withdrawlmoney();
		break;
		
	case 5:
		o.displayAccountDetails();
		break;
	
	default:
		System.out.println("wrong choice selected");
		
		
	
	}
	}
}
}
