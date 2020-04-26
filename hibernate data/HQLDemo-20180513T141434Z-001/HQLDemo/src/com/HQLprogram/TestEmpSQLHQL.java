package com.HQLprogram;

public class TestEmpSQLHQL {

	public static void main(String[] args) {
		
		EmpDataGroupBy.sqlGroupByQuery();
		System.out.println("-------------------------------------------------------------------------------------");
		EmpDataGroupBy.hqlGroupByQuery();
		System.out.println("-------------------------------------------------------------------------------------");
		
		EmpDataBetween.sqlBetween();
		System.out.println("-------------------------------------------------------------------------------------");
		EmpDataBetween.hqlBetween();
		System.out.println("-------------------------------------------------------------------------------------");
		
		EmpDataIN.sqlIn();
		System.out.println("-------------------------------------------------------------------------------------");
		EmpDataIN.hqlIn();
		System.out.println("-------------------------------------------------------------------------------------");
	}
}