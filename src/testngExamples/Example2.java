package testngExamples;

import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class Example2 {
	
		@BeforeClass
		public void login() {
		System.out.println("Login completed");
		}
		@AfterClass
		public void logout() {
		System.out.println("Logout completed");
		}
		@Test
		public void addemp() {
		System.out.println("Add new emp");
		}
		@Test
		public void delemp() {
		System.out.println("Delete emp");
		}
	}

