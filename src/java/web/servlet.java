/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package web;

import java.io.IOException;
import java.io.PrintWriter;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import model.BeerExpert;

/**
 *
 * @author William A Nadeeshani
 */
public class servlet extends HttpServlet{

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
           resp.setContentType("text/html");
           PrintWriter out=resp.getWriter();
           
           out.println("<h1> Beer Selection Advice</h1><br>");
           String c = req.getParameter("colour");
           out.print("<br>Got Beer Colour  <h4>"+ c+"</h4>");
           
           BeerExpert be = new BeerExpert();
           String price=be.getPrice(c);
           out.print("<br> Beer Price  <h4>"+ price+"</h4>");
           
    }
    
}
