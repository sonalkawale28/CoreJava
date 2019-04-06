package com.braindata.model;

public class Account 
{
private String accountNo;
private String name;
private String address;
private long mobileNo;
private int age;
private String gender;
private double balance;

public String getAccountNo() 
{
	return accountNo;
}
public void setAccountNo(String accountNo)
{
	this.accountNo = accountNo;
}
public String getName() 
{
	return name;
}
public void setName(String name) 
{
	this.name = name;
}
public String getAddress() 
{
	return address;
}
public void setAddress(String address) 
{
	this.address = address;
}

public long getMobileNo()
{
	return mobileNo;
}
public void setMobileNo(long mobileNo) 
{
	this.mobileNo = mobileNo;
}
public int getAge()
{
	return age;
}
public void setAge(int age)
{
	this.age = age;
}
public String getGender()
{
	return gender;
}
public void setGender(String gender)
{
	this.gender = gender;
}
public double getBalance()
{
	return balance;
}
public void setBalance(double balance) 
{
	this.balance = balance;
}


}
