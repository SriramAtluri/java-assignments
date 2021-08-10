package com.devlabs.lab10;

import java.io.IOException;

public class SubSuperClassExceptions {

	static class SuperClass {
		void method() throws IOException {
			System.out.println("Exception handling from SuperClass");
		}
	}

	static class SubClass extends SuperClass {
		void method() throws ArithmeticException {
			System.out.println("Exception handling from SubClass");
		}

		public static void main(String args[]) {
			SuperClass s = new SubClass();
			 try { 
			        s.method(); 
			        
			    } catch (IOException e) { 
			        e.printStackTrace(); 
			    } 
		}
	}
}
