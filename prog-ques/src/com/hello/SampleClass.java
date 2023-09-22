package com.hello;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import javax.management.RuntimeErrorException;
public class SampleClass {
	
	int i;
	
	String args[]= {"elemphant", "is"};
	public static void main(String[] args) {
		
		
		LocalDate ld = LocalDate.parse("2013-10-23");
		LocalDate ld1 = LocalDate.parse("2013-10-23");
			System.out.println(ld==ld1);
		
		
		
	}
	
	private static void hello(int jjj)throws Exception {
		throw new Error("Error");
		
	}

	static void hai(Integer jj) throws Exception {
		
		throw new RuntimeException("ff");
	}
}
		
	
	



	
	class AnotherSampleClass extends SampleClass {
		int j;
		AnotherSampleClass(){
		
			super.i=90;
			this.i=900;
			this.j=91;
		}
		
		
	}
	
