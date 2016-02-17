package crea.pattern.prototype;

public class Client {

	public static void main(String[] args) {
		Employee org=new Employee(101,"aman");
		Employee proto=null;
	
		try {
			proto = (Employee) org.clone();
			proto.setEmpName("Mr:" +proto.getEmpName());
		} catch (Exception e) {
			e.printStackTrace();
		}
System.out.println("original:"+org);
System.out.println("prototype:"+proto);
	}

}
