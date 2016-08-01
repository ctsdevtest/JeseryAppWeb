package com.vandana.pojo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "accounts")
public class Accounts implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int custId;
	   private String custName;
	   private String accNumber;
	   private String accType;
	   private String balance;
	   private String branchName;
	   private String branchLocation;
	
	   public Accounts(){}

	   public Accounts(int custId, String custName, String accNumber, String accType,String balance, String branchName, String branchLocation)
	   {
	      this.custId = custId;
	      this.custName = custName;
	      this.accNumber = accNumber;
	      this.accType = accType;
	      this.balance = balance;
	      this.branchName = branchName;
	      this.branchLocation = branchLocation;
	      
	      
	   }
	
	  
	  
	   /**
	 * @return the custId
	 */
	public int getCustId() {
		return custId;
	}
	/**
	 * @param custId the custId to set
	 */
	
	@XmlElement
	public void setCustId(int custId) {
		this.custId = custId;
	}
	/**
	 * @return the custName
	 */
	public String getCustName() {
		return custName;
	}
	/**
	 * @param custName the custName to set
	 */
	@XmlElement
	public void setCustName(String custName) {
		this.custName = custName;
	}
	/**
	 * @return the accNumber
	 */
	public String getAccNumber() {
		return accNumber;
	}
	/**
	 * @param accNumber the accNumber to set
	 */
	@XmlElement
	public void setAccNumber(String accNumber) {
		this.accNumber = accNumber;
	}
	/**
	 * @return the accType
	 */
	public String getAccType() {
		return accType;
	}
	/**
	 * @param accType the accType to set
	 */
	@XmlElement
	public void setAccType(String accType) {
		this.accType = accType;
	}
	/**
	 * @return the balance
	 */
	public String getBalance() {
		return balance;
	}
	/**
	 * @param balance the balance to set
	 */
	@XmlElement
	public void setBalance(String balance) {
		this.balance = balance;
	}
	/**
	 * @return the branchName
	 */
	public String getBranchName() {
		return branchName;
	}
	/**
	 * @param branchName the branchName to set
	 */
	@XmlElement
	public void setBranchName(String branchName) {
		this.branchName = branchName;
	}
	/**
	 * @return the branchLocation
	 */
	public String getBranchLocation() {
		return branchLocation;
	}
	/**
	 * @param branchLocation the branchLocation to set
	 */
	
	@XmlElement
	public void setBranchLocation(String branchLocation) {
		this.branchLocation = branchLocation;
	}
	
	
	@Override
	   public boolean equals(Object object){
	      if(object == null)
	      {
	         return false;
	      }
	      else if(!(object instanceof Accounts))
	      {
	         return false;
	      }
	      else
	      {
	    	 Accounts account = (Accounts)object;
	         if( custId== account.getCustId() && custName.equals(account.getCustName())&& accNumber.equals(account.getAccNumber())&& accType.equals(account.getAccType())&&balance.equals(account.getBalance())&&branchLocation.equals(account.getBranchLocation())&& branchName.equals(account.getBranchName()))	        
	         {
	            return true;
	         }			
	      }
	      return false;
	   }	
	   

}

