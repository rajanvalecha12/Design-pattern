package strupattern.composite;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Store s1=new Store(5000, "A");
Store s2=new Store(15000, "B");
Store s3=new Store(30000, "C");
Store s4=new Store(10000, "D");
Store s5=new Store(20000, "E");
Store s6=new Store(35000, "F");

State haryana = new State("Haryana");

City delhi=new City("Delhi");
delhi.addLeaf(s1);
delhi.addLeaf(s2);
delhi.addLeaf(s3);
System.out.println("total collection of "+delhi.getCityName()+"="+delhi.getProfit());


City gurgaon=new City("gurgaon");
gurgaon.addLeaf(s4);
gurgaon.addLeaf(s5);
gurgaon.addLeaf(s6);
System.out.println("total collection of gurgaon="+gurgaon.getProfit());


haryana.addLeaf(delhi);
haryana.addLeaf(gurgaon);
System.out.println("total collection haryana="+haryana.getProfit());
	}

}
