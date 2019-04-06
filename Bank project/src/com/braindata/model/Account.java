package com.braindata.model;

public class Account {
private String accountNo;
private String name;
private String address;
private long mobileNo;
private int age;
private String gender;
private double balance;

public void setAccountNo(String accountNo)
{
	this.accountNo=accountNo;
}
public String getAccountNo()
{
	return accountNo;
}

public void setName(String name)
{
	this.name=name;
}
public String getName()
{
	return name;
}

public void setAddress(String address)
{
	this.address=address;
}
public String getAddress()
{
	return address;
}

public void setMobileNo(long mobileNo)
{
	this.mobileNo=mobileNo;
}
public long getMobileNo()
{
	return mobileNo;
}

public void setAge(int age)
{
	this.age=age;
}
public int getAge()
{
	return age;
}

public void setGender(String gender)
{
	this.gender=gender;
}
public String getGender()
{
	return gender;
}

public void setBalance(double balance)
{
	this.balance=balance;
}
public double getBalance()
{
	return balance;
}
}
