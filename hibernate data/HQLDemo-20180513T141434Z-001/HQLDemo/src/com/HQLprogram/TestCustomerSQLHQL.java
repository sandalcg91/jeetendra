package com.HQLprogram;

public class TestCustomerSQLHQL {

	public static void main(String[] args)
	{
		
		CustDataSelectAll.sqlSelectQuery();
		System.out.println("---------------------------------------------------------------------------------");
		CustDataSelectAll.hqlSelectQuery();
		System.out.println("---------------------------------------------------------------------------------");
		
		CustDataSelectField.sqlFieldSelect();
		System.out.println("---------------------------------------------------------------------------------");
		CustDataSelectField.hqlFieldSelect();
		System.out.println("---------------------------------------------------------------------------------");
		
		CustDataSelectLike.sqlLikeQuery();
		System.out.println("---------------------------------------------------------------------------------");
		CustDataSelectLike.hqlLikeQuery();
		System.out.println("---------------------------------------------------------------------------------");
		
		CustDataOrderBy.sqlOrderByQuery();
		System.out.println("---------------------------------------------------------------------------------");
		CustDataOrderBy.hqlOrderByQuery();
		System.out.println("---------------------------------------------------------------------------------");
		
		CustDataWhere.sqlWhereClouse();
		System.out.println("---------------------------------------------------------------------------------");
		CustDataWhere.hqlWhereClouse();
		System.out.println("---------------------------------------------------------------------------------");
		
		CustDataDistinctRecords.sqlSelectDistinct();
		System.out.println("---------------------------------------------------------------------------------");
		CustDataDistinctRecords.hqlSelectDistinct();
		System.out.println("---------------------------------------------------------------------------------");	
	}
}