package com.tns.encapsulation;

public class TestEncapsulation {

	public static void main(String[] args) {
		Account acc =  new Account();
		acc.setAcc_no(151515555);
		acc.setName("Vishal");
		acc.setEmail("vishalsureshpawar@gmail.com");
		acc.setAmount(545.55f);
		
		System.out.println("Account No: "+ acc.getAcc_no()+" \n"+"Name: "+acc.getName()+" \n"+"Email: "+acc.getEmail()+"\n"+"Amount: "+acc.getAmount());
	}

}
