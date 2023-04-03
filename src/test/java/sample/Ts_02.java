package sample;

import org.testng.annotations.Test;

public class Ts_02 
{
	@Test(groups = "Smoke")
	public void test2()
	{
		System.out.println("execute02");
	}
	@Test(groups = "regression")
	public void test3()
	{
		System.out.println("execute03");
	}

}
