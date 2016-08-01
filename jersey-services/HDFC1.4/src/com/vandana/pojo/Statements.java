package com.vandana.pojo;

import java.io.Serializable;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "statements")

public class Statements implements Serializable {
	
	 /**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int custId;
	private String date;
	   private String refNo;
	   private String stateType;
	
	 public Statements(){}

	   public Statements(int custId, String date, String refNo, String stateType)
	   {
	      this.custId = custId;
	      this.date = date;
	      this.refNo = refNo;
	      this.stateType = stateType;
	      
	      
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
	 * @return the date
	 */
	public String getDate() {
		return date;
	}
	/**
	 * @param date the date to set
	 */
	@XmlElement
	public void setDate(String date) {
		this.date = date;
	}
	/**
	 * @return the refNo
	 */
	public String getRefNo() {
		return refNo;
	}
	/**
	 * @param refNo the refNo to set
	 */
	@XmlElement
	public void setRefNo(String refNo) {
		this.refNo = refNo;
	}
	/**
	 * @return the stateType
	 */
	public String getStateType() {
		return stateType;
	}
	/**
	 * @param stateType the stateType to set
	 */
	@XmlElement
	public void setStateType(String stateType) {
		this.stateType = stateType;
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
	    	  Statements statement = (Statements)object;
	         if( custId== statement.getCustId() && date.equals(statement.getDate())&& refNo.equals(statement.getRefNo())&& stateType.equals(statement.getStateType()))	        
	         {
	            return true;
	         }			
	      }
	      return false;
	   }
	 

}
