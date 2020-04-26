package com.projection.practice;

public class ProjectionTest {

	public static void main(String[] args) {
	
		PerticularColumn.getColumn();
		System.out.println("------------------------------------------------------------");
		
		AggregateFunctions.getMax();
		System.out.println("------------------------------------------------------------");

		AggregateFunctions.getMin();
		System.out.println("------------------------------------------------------------");
		
		AggregateFunctions.getAvg();
		System.out.println("------------------------------------------------------------");
		
		AggregateFunctions.getSum();
		System.out.println("------------------------------------------------------------");
		
		AggregateFunctions.getCount();
		System.out.println("------------------------------------------------------------");
		
		AggregateFunctions.getRowCount();
		System.out.println("------------------------------------------------------------");
		
		AggregateFunctions.getCountDistinct();
		System.out.println("------------------------------------------------------------");
		
	//	GroupByClause.getGroupClause();
	//	System.out.println("------------------------------------------------------------");
		
		HavingWithGroupByClause.havingGroupQuery();
		System.out.println("------------------------------------------------------------");
	}
}
