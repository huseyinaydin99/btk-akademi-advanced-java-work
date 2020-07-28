package com.huseyinaydin;

public class OracleCustomerDal implements ICustomerDal {
	
	private String connectionString;
	
	@Override
	public void add() {
		System.out.println("Oracle veritaban�na eklendi");
	}
	
	public String getConnectionString() {
		return connectionString;
	}

	public void setConnectionString(String connectionString) {
		this.connectionString = connectionString;
	}
}
