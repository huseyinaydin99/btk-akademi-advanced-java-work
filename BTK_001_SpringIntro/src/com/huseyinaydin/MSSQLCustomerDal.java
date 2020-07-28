package com.huseyinaydin;

public class MSSQLCustomerDal implements ICustomerDal {
	
	private String connectionString;
	
	@Override
	public void add() {
		System.out.println("MSSQL Server veritaban�na kay�t yap�ld�.");

	}

	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}

}
