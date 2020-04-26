package com.restriction.practice;

public class TestRestrictions {

	public static void main(String[] args) {
	
		AllRestrictions.getAllRecord();
		System.out.println("-------------------------------------------------------------------");
	   
		AllRestrictions.getLessThan();
		System.out.println("-------------------------------------------------------------------");
		
		AllRestrictions.getGreaterThan();
		System.out.println("-------------------------------------------------------------------");
		
		AllRestrictions.getBetween();
		System.out.println("-------------------------------------------------------------------");
		
		AllRestrictions.getIn();
		System.out.println("-------------------------------------------------------------------");
		
		AllRestrictions.getLike();
		System.out.println("-------------------------------------------------------------------");
		
		AllRestrictions.getILike();
		System.out.println("-------------------------------------------------------------------");
		
		AllRestrictions.getIsNull();
		System.out.println("-------------------------------------------------------------------");
		
		AllRestrictions.getIsNotNull();
		System.out.println("-------------------------------------------------------------------");
	
	//	AllRestrictions.getIsEmpty();
	//	System.out.println("-------------------------------------------------------------------");
		
		AllRestrictions.getAndCondition();
		System.out.println("-------------------------------------------------------------------");
		
		AllRestrictions.getORCondition();
		System.out.println("-------------------------------------------------------------------");
	}
}