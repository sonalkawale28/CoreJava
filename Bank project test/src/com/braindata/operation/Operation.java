package com.braindata.operation;

import java.util.Scanner;

import com.braindata.model.Account;

public class Operation {

	Account a=new Account();
	Scanner sc=new Scanner(System.in);
	
	public void createaccount()
	{
		System.out.println("Enter your account number:");
		String ac=sc.next();
		a.setAccountNo(ac);
		System.out.println("Enter your name:");
		String nm=sc.next();
		a.setName(nm);
		System.out.println("Enter your address:");
		String adr=sc.next();
		a.setAddress(adr);
		System.out.println("Enter your mobile number:");
		long mbl=sc.nextLong();
		a.setMobileNo(mbl);
		
		while(true)
		{
		System.out.println("Enter your age:");
		int ag=sc.nextInt();
		if(ag>=18)
		{
			a.setAge(ag);
		     break;	
		}
		else
		{
			System.out.println("sorry!!Invalid age");
			System.out.println("Age should be more than or equal to 18 years");
			
		}
		
		}
		
		while(true)
		{
			System.out.println("Enter your gender:");
			String gen=sc.next();
			String male="M";
			String female="F";
			if(male.equals(gen))
			{
				a.setGender(gen);
				break;
			}
			else if(female.equals(gen))
			{
				a.setGender(gen);
				break;
			}
			else
			{
				System.out.println("Sorry!!Invalid Gender");
			}
		}
		
		while(true)
		{
			System.out.println("Enter the amount you want to deposite:");
			double dp=sc.nextDouble();
			if(dp>=500)
			{
				a.setBalance(dp);
				break;
			}
			else
			{
				System.out.println("You have to deposite more or equal to Rs.500");
				
			}
		}
		
	}
	public void displaybalance()
	{
		System.out.println("Enter the account number:");
		String ac=sc.next();
		String acn=a.getAccountNo();
		if(ac.equals(acn))
		{
			System.out.println("your account balance is:"+a.getBalance());
			System.out.println("Thank you!!");
			System.out.println("================================================");
			
		}
		else
		{
			System.out.println("Sorry!!your account not found");
			System.out.println("First create your account");
		}
		
	}
	public void addmoney()
	{
		while(true)
		{
		System.out.println("Enter your account number:");
		String ac=sc.next();
		String acn=a.getAccountNo();
		if(ac.equals(acn))
		{   
			double oldamt=a.getBalance();
			System.out.println("'Enter the amount you want to add:");
			double amt=sc.nextDouble();
			double newamt=oldamt+amt;
			a.setBalance(newamt);
			System.out.println("your current balance is:"+a.getBalance());
			System.out.println("Thank you!!");
			System.out.println("================================================");
			break;
			
		}
		else
		{
			
			System.out.println("sorry!!account not found");
			
		}
		
	}
	}
	public void withdrawlmoney()
	{
		while(true)
		{
		System.out.println("Enter your account number:");
		String ac=sc.next();
		String acn=a.getAccountNo();
		if(ac.equals(acn))
		{ 
			while(true)
		{
			System.out.println("Enter the amount you want to wthdrawl:");
			double wd=sc.nextDouble();
			double bal=a.getBalance()-wd;
			if(bal>=500)
			{
				a.setBalance(bal);
				System.out.println("your current balance is:"+a.getBalance());
				System.out.println("thank you!!");
				System.out.println("===============================================");
				break;
			}
			else
			{
			System.out.println("sorry!!you have insufficient balance");
			System.out.println("you have to keep atleast rs 500 in your account");
			
			}
		}
			break;
		}else
		{
			System.out.println("Invalid account number");
			
		}	
		}
		
	}
	public void displayAccountDetails()
	{
		System.out.println("Your account number is:"+a.getAccountNo());
		System.out.println("Your name is:"+a.getName());
		System.out.println("Your address is:"+a.getAddress());
		System.out.println("Your mobile no is:"+a.getMobileNo());
		System.out.println("Your age is:"+a.getAge());
		System.out.println("Your gender is:"+a.getGender());
		System.out.println("Your balance is:"+a.getBalance());
		System.out.println("Thank you!!");
		System.out.println("=============================================");
		
		
	}
}
