package com.vandana.Service;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.QueryParam;
import javax.ws.rs.core.MediaType;

import com.vandana.DAO.AccountsDAO;
import com.vandana.pojo.Accounts;




@Path("/accountsService")
public class AccountsService {

	
		AccountsDAO accountDao = new AccountsDAO();
	  // private static final String SUCCESS_RESULT="<result>success</result>";
	 //  private static final String FAILURE_RESULT="<result>failure</result>";


	   @GET
	   @Path("/accounts")
	   @Produces(MediaType.APPLICATION_XML)
	   public List<Accounts> getAccountDetails() {
	      return AccountsDAO.getAllAccount();
	   }

	   @GET
	   @Path("/accounts/{custId}")
	   @Produces(MediaType.APPLICATION_XML)
	   public Accounts getAccounts(@PathParam("custId") int custId){
	      return AccountsDAO.getAccounts(custId);
	   }
	

	   @GET
	   @Path("/accounts/page")
	   @Produces(MediaType.APPLICATION_XML)
	   public List<Accounts> getAccountDetails(@QueryParam("start") int start,
			                                   @QueryParam("size") int size)
	   {
		   if(start >= 0 && size>=0 )
		   {
			   return AccountsDAO.getAccountsPaginated(start, size);
		   }
	      return AccountsDAO.getAllAccount();
	   }

	

}
