package com.collection;

import java.util.Objects;

public class Student {

	 int id;
	String name;
	
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		
		if (obj == null)
			return false;
		
		if (getClass() != obj.getClass())
			return false;
		
		Student other = (Student) obj;
		return id == other.id;
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(id);
	}
	
}
