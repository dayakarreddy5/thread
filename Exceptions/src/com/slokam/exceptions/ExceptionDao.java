package com.slokam.exceptions;

import java.sql.SQLException;

public class ExceptionDao {


	@SuppressWarnings("unused")
	public static void save() throws DatavalidationsException {

	        if(true) {
	        	
	        	try {
					throw new SQLException();
				} catch (SQLException e) {
					
					throw new DatavalidationsException("database problem",e);
				}
	        }
	        
	         if(true) {
	        	try {
					throw new ClassNotFoundException();
					
				} catch (ClassNotFoundException c) {
					
					throw new DatavalidationsException("database problem",c);
				}
	        }
	        
	
	}
}
