package com.bit.crossbrowsing.test;

import org.junit.Test;

public class SmokeTest extends BaseTest{
	@Test
	public void test1()
	{
		System.out.println("This is Git class");
		System.out.println("test executed");
		System.out.println("test executed");
		System.out.println("test executed");
		System.out.println("test executed");
		System.out.println("test executed");
	}
}

//run this script from cmd promt
//mvn test -Dbrowser=Firefox -DrunMode=local  (it works but, error says missing dll and build failure)
//mvn test -Dbrowser=Chrome -DrunMode=local  (good)(both cmd and config.properties)
//mvn test -Dbrowser=IE -DrunMode=local  (after annotation does not work, browser has big window)