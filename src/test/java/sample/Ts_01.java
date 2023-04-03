package sample;

import org.testng.annotations.Test;

public class Ts_01 
{
	@Test(groups = "Smoke")
	public void test1()
	{
		System.out.println("execute01");
	}
	@Test(groups ="regression")
	public void test2()
	{
		System.out.println("execute02");
	}
	

}
