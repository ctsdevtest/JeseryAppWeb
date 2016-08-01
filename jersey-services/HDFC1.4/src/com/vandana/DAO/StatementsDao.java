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

import com.vandana.pojo.Statements;

public class StatementsDao {
	@SuppressWarnings("unchecked")
	public static List<Statements> getAllStatements(){
	      List<Statements> statementList = null;
	      try {
	         File file = new File("Statement.txt");
	         if (!file.exists()) {
	        	 Statements statements1 = new Statements(11111, "06-30-2016", "ref no 47856","debit");
	        	 Statements statements2 = new Statements(22222, "03-03-2015", "ref no 22222","debit");
	        	 Statements statements3 = new Statements(11111, "05-06-2016", "ref no 33333","credit");
	        	 Statements statements4 = new Statements(22222, "03-06-2016", "ref no 25895","credit");
	        	 Statements statements5 = new Statements(33333, "03-10-2015", "ref no 89564","credit");

	        	 statementList = new ArrayList<Statements>();
	        	 statementList.add(statements1);
	        	 statementList.add(statements2);
	        	 statementList.add(statements3);
	        	 statementList.add(statements4);
	        	 statementList.add(statements5);
	        	 saveStatementsList(statementList);
	        	 System.out.println(statementList);
	        	
	         }
	         else{
	            FileInputStream fis = new FileInputStream(file);
	            ObjectInputStream ois = new ObjectInputStream(fis);
	            statementList = (List<Statements>) ois.readObject();
	            ois.close();
	         }
	      } catch (IOException e) {
	         e.printStackTrace();
	      } catch (ClassNotFoundException e) {
	         e.printStackTrace();
	      }		
	      return statementList;
	      
	   }
	
	private static void saveStatementsList(List<Statements> statementList) 
	{
		// TODO Auto-generated method stub
		try {
	         File file = new File("Statement.txt");
	         FileOutputStream fos;
	         fos = new FileOutputStream(file);

	         ObjectOutputStream oos = new ObjectOutputStream(fos);		
	         oos.writeObject(statementList);
	         oos.close();
	      } catch (FileNotFoundException e) {
	         e.printStackTrace();
	      } catch (IOException e) {
	         e.printStackTrace();
	      }
		
	}
	
 	public static List<Statements> getStatements(int custId)
  	{
 		
  		ArrayList<Statements> list=new ArrayList<Statements>();
  		 List<Statements> statementList=getAllStatements();
  		 for(Statements statement: statementList){
	         if(statement.getCustId() == custId){
	        	 list.add(statement);
	         }
	      }
		return list;
  		
  		  		
  	}
 	
	public static List<Statements> getcreditStatements(int custId,String stateType)
  	{
 		
  		ArrayList<Statements> list1=new ArrayList<Statements>();
  		 List<Statements> statementList=getAllStatements();

  		
  		 for(Statements statement: statementList){
  			 
	        if((statement.getCustId() == custId) && (statement.getStateType().trim().contains(stateType))){
	        	list1.add(statement);
	         }
	      }
		return list1;
		
  		
  		  		
  	}
	
	
	    public static void main(String args[]){
	    	int custId=22222;
	    	String stateType="credit";
	    	getcreditStatements( custId,stateType);
	    	//System.out.println(getcreditStatements(custId, stateType));


	    }

}
