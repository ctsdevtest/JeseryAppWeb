package com.vandana.DAO;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

import com.vandana.pojo.Accounts;

public class AccountsDAO {
	
	@SuppressWarnings("unchecked")
	public static List<Accounts> getAllAccount(){
	      List<Accounts> accountList = null;
	      try {
	         File file = new File("Account.txt");
	         if (!file.exists()) {
	            Accounts accounts1 = new Accounts(11111, "Vandana Singh ", "XXXXXXXX11111","Savings","10000","Pune","HDFC_PUNE");
	            Accounts accounts2 = new Accounts(22222, "Vandana Singh ", "XXXXXXXX22222","Current","20000","New Delhi","HDFC_PUNE");
	            Accounts accounts3 = new Accounts(33333, "Vandana Singh ", "XXXXXXXX33333","Savings","30000","Rajasthan","HDFC_PUNE");
	            Accounts accounts4 = new Accounts(44444, "Vandana Singh ", "XXXXXXXX4444","Current","40000","Andman","HDFC_PUNE");
	            Accounts accounts5 = new Accounts(55555, "Vandana Singh ", "XXXXXXXX55555","Savings","50000","Kolkata","HDFC_PUNE");
	            Accounts accounts6 = new Accounts(66666, "Vandana Singh ", "XXXXXXXX66666","Current","60000","Mumbai","HDFC_PUNE");
	            Accounts accounts7 = new Accounts(77777, "Vandana Singh ", "XXXXXXXX7777","Savings","70000","Pune","HDFC_PUNE");
	            Accounts accounts8 = new Accounts(88888, "Vandana Singh ", "XXXXXXXX88888","Current","80000","Pune","HDFC_PUNE");
	            Accounts accounts9 = new Accounts(99999, "Vandana Singh ", "XXXXXXXX99999","Savings","90000","Pune","HDFC_PUNE");
	            Accounts accounts10 = new Accounts(12312, "Vandana Singh ", "XXXXXXXX12312","Current","125600","Pune","HDFC_PUNE");
	            Accounts accounts11 = new Accounts(45698, "Vandana Singh ", "XXXXXXXX45698","Savings","56955","Pune","HDFC_PUNE");
	            Accounts accounts12 = new Accounts(45626, "Vandana Singh ", "XXXXXXXX45626","Savings","65895","Pune","HDFC_PUNE");
	            accountList = new ArrayList<Accounts>();
	            accountList.add(accounts1);
	            accountList.add(accounts2);
	            accountList.add(accounts3);
	            accountList.add(accounts4);
	            accountList.add(accounts5);
	            accountList.add(accounts6);
	            accountList.add(accounts7);
	            accountList.add(accounts8);
	            accountList.add(accounts9);
	            accountList.add(accounts10);
	            accountList.add(accounts11);
	            accountList.add(accounts12);
	            saveAccountsList(accountList);		
	         }
	         else{
	            FileInputStream fis = new FileInputStream(file);
	            ObjectInputStream ois = new ObjectInputStream(fis);
	            accountList = (List<Accounts>) ois.readObject();
	            ois.close();
	         }
	      } catch (IOException e) {
	         e.printStackTrace();
	      } catch (ClassNotFoundException e) {
	         e.printStackTrace();
	      }		
	      return accountList;
	   }

	private static void saveAccountsList(List<Accounts> accountList) 
	{
		// TODO Auto-generated method stub
		try {
	         File file = new File("Accounts.txt");
	         FileOutputStream fos;
	         fos = new FileOutputStream(file);

	         ObjectOutputStream oos = new ObjectOutputStream(fos);		
	         oos.writeObject(accountList);
	         oos.close();
	      } catch (FileNotFoundException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
		
	}
	
   /* public static void main(String args[]){
    	int start=0;
    	int size=5;
    	getAccountsPaginated(start,size);
    } 
	 */
  //private List<Accounts> accountList=getAllAccount();
  	public static List<Accounts> getAccountsPaginated(int start,int size)
  	{
  		//ArrayList<Accounts> list=new ArrayList<Accounts>(accountList.values);
  		 List<Accounts> accountList=getAllAccount();
  		 if(start+size>accountList.size())
  			 return new ArrayList<Accounts>();
  		return accountList.subList(start, start+size);
  		
  	}
		
	public static Accounts getAccounts(int custId){
	      List<Accounts> accounts = getAllAccount();

	      for(Accounts account: accounts){
	         if(account.getCustId() == custId){
	        	 
	            return account;
	         }
	      }
	      return null;
	   }
	

	
	


}

