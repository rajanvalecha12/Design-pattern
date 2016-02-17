package crea.pattern.singleton;

public class Counter {
private static Counter count;
private Counter(){
	count=new Counter();
}
public synchronized static Counter getInstance(){
	if(count==null)
		
	{
		count=new Counter();
		
	}
	return count;
}
}
