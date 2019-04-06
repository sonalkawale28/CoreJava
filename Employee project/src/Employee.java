
public class Employee {
private int eid;
private String ename;
private Address address;
private Company cname;


public void setEid(int eid)
{
	this.eid = eid;
}
public int getEid() 
{
	return eid;
}

public void setEname(String ename) 
{
	this.ename = ename;
}
public String getEname()
{
	return ename;
}
public Address getAddress() 
{
	return address;
}
public void setAddress(Address address) 
{
	this.address = address;
}
public Company getCname()
{
	return cname;
}
public void setCname(Company cname) 
{
	this.cname = cname;
}
}
