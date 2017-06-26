package com.katmane.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.katmane.service.TaxService;
import com.katmane.service.TaxServiceImpl;

/**
 * Servlet implementation class TaxCalculatorServlet
 */
@WebServlet("/calculateTax")
public class TaxCalculatorServlet extends HttpServlet {
	
	TaxService taxService = new TaxServiceImpl();
	
    protected void doPost(HttpServletRequest request,
            HttpServletResponse response) throws ServletException, IOException {
    	
        String taxYear = request.getParameter("taxYear");
        String age = request.getParameter("age");
        String totalTaxableEarnings = request.getParameter("totalTaxableEarnings");
        String typeOfEarnings = request.getParameter("type");
        String medicalAidMembers = request.getParameter("medicalAidMembers"); 
         
        System.out.println("Tax year: " + taxYear);
        System.out.println("Age: " + age);
        System.out.println("Total Taxable Earnings: "+ totalTaxableEarnings);
        System.out.println("Type Of Earnings: " + typeOfEarnings);
        System.out.println("Medical Aid Members: " + medicalAidMembers);
        
        //Send values to service and get back calculations object
        taxService.calculateTaxForYear(taxYear, age, totalTaxableEarnings, typeOfEarnings, medicalAidMembers);
    }
 
}
