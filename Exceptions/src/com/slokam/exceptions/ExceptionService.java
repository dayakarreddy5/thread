package com.slokam.exceptions;

public class ExceptionService {

	
	
	
	public void saveTest() throws DatavalidationsException {
		
		
		ExceptionDao dao=new ExceptionDao();
		
		dao.save();
	}
}
