package sample;

import org.testng.annotations.Test;

public class Tester
{
	@Test
	public void test()
	{
	    String urls = System.getProperty("url");	
	    String user = System.getProperty("username");
	    System.out.println(urls);
	    System.out.println(user);
	}

}
