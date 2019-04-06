package com.braindata.operation;

import java.util.Scanner;

import com.braindata.model.Account;

public class Operation {

Scanner sc=new Scanner(System.in);
Account a=new Account();
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
	int age=sc.nextInt();
	if(age>=18)
	{
		a.setAge(age);
		break;
		
	}
	else
	{
		System.out.println("You are not eligible to create account");
		System.out.println("age should be more than or equal to 18 years");
		
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
	{ System.out.println("Invalid gender");
	}
	}
	while(true)
	{
	System.out.println("enter the amount you want to deposite:");
	double dp=sc.nextDouble();
	if(dp>=500)
	{
		a.setBalance(dp);
		break;
	}
	else
	{
		System.out.println("Amount should be more than or equal to 500Rs");
		System.out.println("Enter sufficient amount");
	}
	}
	
}

public void displaybalance()
{
	
	System.out.println("Enter the account number:");
	String acn=sc.next();
	String ac=a.getAccountNo();
	if(acn.equals(ac))
	{
		System.out.println("Your account balance is:"+a.getBalance());
		System.out.println("Thank you!!");
		System.out.println("==================================");
		
	}
	else
	{
		System.out.println("sorry!! your account not found");
		System.out.println("Please enter correct account no:");
		System.out.println("Thank you!!");
		System.out.println("==================================");
	}
}
public void addmoney()
{
	while(true)
	{
System.out.println("Enter your account number:");
String acn=sc.next();
String ac=a.getAccountNo();
if(acn.equals(ac))
{
	double oldamt=a.getBalance();
	System.out.println("Enter the amount you want to add:");
	double userin=sc.nextDouble();
	double newamt=oldamt+userin;
	a.setBalance(newamt);
	System.out.println("your updated account balance is:"+a.getBalance() );
	System.out.println("Thank you!!");
	System.out.println("==================================");
	break;	
}
else
{
	System.out.println("Sorry!!your account not found");
}
	}
}
public void withdrawlmoney()
{
	while(true)
	{
System.out.println("Enter your account number:");
String acn=sc.next();
String ac=a.getAccountNo();


if(acn.equals(ac))
{
	while(true)
	{
	System.out.println("Enter the amount you want to withdrawl:");
	double amt=sc.nextDouble();
	double newamt=a.getBalance()-amt;
	if(newamt>=500)
	{
		a.setBalance(newamt);
		System.out.println("Amount withdrawn successfully");
		System.out.println("your current balance is:"+a.getBalance());
		System.out.println("Thank you!!");
		System.out.println("==========================================");
		break;
	}
	else
	{
	
	System.out.println("you have insufficient amount");
	System.out.println("Please enter correct amount");
	}
}
break;
}
	else
	{
		System.out.println("incorrect account number");
	}

	}
}
public void displayaccountdetails()
{
System.out.println("your account number is:"+a.getAccountNo());
System.out.println("your account name is:"+a.getName());
System.out.println("your address is:"+a.getAddress());
System.out.println("your age is:"+a.getAge());
System.out.println("your mobile number is:"+a.getMobileNo());
System.out.println("your gender is:"+a.getGender());
System.out.println("your balance is:"+a.getBalance());
System.out.println("Thank you!!");
System.out.println("=======================================");
}
}
