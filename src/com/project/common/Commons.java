package com.project.common;

import java.util.List;

public interface Commons<T1,T2> {
	
	public T1 save(T2 t2) throws Exception;
	
	public T2 getUserById(int id) throws Exception;
	
	public List<T2> getAllUser() throws Exception;

}
