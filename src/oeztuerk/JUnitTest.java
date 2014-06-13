package oeztuerk;

import org.junit.Test;

public class JUnitTest {
		Arithmetik a=new Arithmetik();
	
		@Test
		public void testObjekt(){
			a=new Arithmetik();
		}
		@Test 
		public void testminusplus() throws MyException{
			System.out.println("minus*plus: "+a.multLong(5, -5));
		}
		@Test 
		public void testplusplus(){
			try {
				System.out.println("plus*plus: "+a.multLong(5, 5));
			} catch (MyException e) {
				e.getMessage();
			}
		}
		@Test 
		public void testminusminus(){
			try {
				System.out.println("minus*minus: "+a.multLong(-5, -5));
			} catch (MyException e) {
				e.getMessage();
			}
		}
		@Test 
		public void testplusminusg(){
			try {
				System.out.println("plus*minus: "+a.multLong(-5, 5));
			} catch (MyException e) {
				e.getMessage();
			}
		}
}
