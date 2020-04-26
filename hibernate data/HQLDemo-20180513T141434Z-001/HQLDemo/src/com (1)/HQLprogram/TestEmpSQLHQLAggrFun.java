package com.HQLprogram;

public class TestEmpSQLHQLAggrFun {

	public static void main(String[] args) {
	
/*		AggregateFunction.sqlSelectMaxSal();
		System.out.println("-----------------------------------");
		AggregateFunction.hqlSelectMaxSal();
		System.out.println("-----------------------------------");
		AggregateFunctionCriteria.maxByCriteria();
		System.out.println("-----------------------------------");
*/
		
/*		AggregateFunction.sqlSelectMinSal();
		System.out.println("-----------------------------------");
		AggregateFunction.hqlSelectMinSal();
		System.out.println("-----------------------------------");
		AggregateFunctionCriteria.minByCriteria();
		System.out.println("-----------------------------------");
*/

		AggregateFunction.sqlSelectCount();
		System.out.println("-----------------------------------");
		AggregateFunction.hqlSelectCount();
		System.out.println("-----------------------------------");
		AggregateFunctionCriteria.countRowByCriteria();
		System.out.println("-----------------------------------");
		AggregateFunctionCriteria.countByCriteria();
		System.out.println("-----------------------------------");
		AggregateFunctionCriteria.countDistinctByCriteria();
		System.out.println("-----------------------------------");
		
		
/*		AggregateFunction.sqlSelectAvgSal();
		System.out.println("-----------------------------------");
		AggregateFunction.hqlSelectAvgSal();
		System.out.println("-----------------------------------");
		AggregateFunctionCriteria.avgByCriteria();
		System.out.println("-----------------------------------");
*/		
/*		AggregateFunction.sqlSelectSumSal();
		System.out.println("-----------------------------------");
		AggregateFunction.hqlSelectSumSal();
		System.out.println("-----------------------------------");
		AggregateFunctionCriteria.sumByCriteria();
		System.out.println("-----------------------------------");
*/	}
}