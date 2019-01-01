package com.slokam.exceptions;

public class ExceptionController {

	
	public static void main(String[] args) {
		
		
		
		ExceptionService service=new ExceptionService();
		
		
		try {
			service.saveTest();
		} catch (DatavalidationsException e) {
			
			System.out.println(e.getMessage()+"::"+e.getCause());
<<<<<<< HEAD
			System.out.println(e.getMessage()+"::"+e.getCause());
=======
			
			//System.out.println(e.getMessage()+"::"+e.getCause());
>>>>>>> refs/remotes/origin/master

		}
	}
}
