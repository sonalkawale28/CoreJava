
public class Test {
public static void main(String[] args) 
	{
		Address eadr=new Address();
		eadr.setAreaname("warje");
		eadr.setCityname("pune");
		eadr.setPincode(411058);
		
		Address cadr=new Address();
		cadr.setAreaname("Hinjewadi");
		cadr.setCityname("pune");
		cadr.setPincode(410084);
		
		
		
		Company c=new Company();
		c.setCid(101);
		c.setCname("TCS");
		c.setCaddress(cadr);
		
		Employee e=new Employee();
		e.setEid(1);
		e.setEname("sonal");
		e.setAddress(eadr);
		e.setCname(c);
		
		System.out.println(e.getEid());
		System.out.println(e.getEname());
		System.out.println(e.getAddress().getAreaname());
		System.out.println(e.getAddress().getCityname());
		System.out.println(e.getAddress().getPincode());
		System.out.println(e.getCname().getCid());
		System.out.println(e.getCname().getCname());
		System.out.println(e.getCname().getCaddress().getAreaname());
		System.out.println(e.getCname().getCaddress().getCityname());
		System.out.println(e.getCname().getCaddress().getPincode());
		
	}
}
		
		
	
