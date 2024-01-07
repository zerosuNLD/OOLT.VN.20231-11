package Model2;

import java.awt.desktop.ScreenSleepEvent;
import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class Model_Main {

	public Model_Main() {
		// TODO Auto-generated constructor stub
	}
	
	
	public class I1 {
		public I1() {}
		
		public void m1() { System.out.println("Hello"); }
	}
	
	public class I2 {
		
		public I2() {}
		public void m2() { I1 c =new I1();   c.m1(); }
	}
    
    
	public static void main(String args[]) { 
		
		//I2 x = new I2();
		
		// TEST SLEEP
//		System.out.println("main");
//		try {
//			Thread.sleep(5000);
//		} catch (InterruptedException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}
//		System.out.println("main");
//		
		
		// TEST CREATE INSTANCE
//		Object ob = null;  
//		Class classDefinition;
//					
//			try {
//				Class[] t = {int.class};
//				
//				Class classDef = Class.forName("Model2.Lipid");   
//				Constructor cons = classDef.getConstructor(t);
//				ob = cons.newInstance(1);
//			} catch (InstantiationException | IllegalAccessException e) {
//				// TODO Auto-generated catch block
//				e.printStackTrace();
//			}
//		 catch (ClassNotFoundException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (NoSuchMethodException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (SecurityException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (IllegalArgumentException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		} catch (InvocationTargetException e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}  
//	   // Lipid lipid = new Lipid();
//	    System.out.println(ob.getClass().toString());
		
	}
}
