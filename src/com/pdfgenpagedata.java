package com;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.lowagie.text.Document;
import com.lowagie.text.Paragraph;
import com.lowagie.text.pdf.PdfWriter;

/**
 * Servlet implementation class pdfgenpagedata
 */
@WebServlet("/pdfgenpagedata")
public class pdfgenpagedata extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public pdfgenpagedata() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String str="pdf";

		Connection conn=null;
		PreparedStatement ps=null;
		ResultSet rs=null;
		try
		{
		    Document document=new Document();
		    if(str.equals("pdf"))
		    {
		        response.setContentType("application/pdf");
		        PdfWriter.getInstance(document,response.getOutputStream());
		    }
		    conn= DBC.getConnection();
		    String query = "select * from bank";          //Fetching data from table
		       ps=conn.prepareStatement(query);                // executing query
		       rs=ps.executeQuery();
		      
		    document.open();

		    /* new paragraph instance initialized and add function write in pdf file*/
		    document.add(new Paragraph("-----------------------------------------------------------REPORT---------------------------------------------------------\n\n"));
		    document.add(new Paragraph("                                                         CREATED REPORT BY-KSI\n\n"));
		    document.add(new Paragraph("---------------------------------------------------------------------------------------------------------------------------------"));
		    document.addCreationDate();
		   
		   while(rs.next())
		    {
		          // fetch & writing records in pdf files
		        document.add(new Paragraph("Name :"+rs.getString(1)+"\nDOB :"+rs.getString(2)+"\nAccount no :"+rs.getString(3)+"\nIFSE code :"+rs.getString(4)+"\nMobile no :"+rs.getString(5)+"\nBalance :"+rs.getString(6)+"\nPassword :"+rs.getString(7)+"\n"));
		    }
		    document.add(new Paragraph("---------------------------------------------------------PAGE NO::"+document.getPageNumber()+"------------------------------------------------------"));
		   
		    document.close(); //document instance closed
		    conn.close();  //db connection close
		}
		catch(Exception de)
		{
		        de.printStackTrace();
		            System.err.println("document: " + de.getMessage());
		           
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
