package by.bsu.webxml.control;

/*
 * https://www.tutorialspoint.com/java_xml/java_dom_parse_document.htm
 */

import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import by.bsu.webxml.entity.Student;
import by.bsu.webxml.entity.User;
import by.bsu.webxml.parser.DomParser;
import by.bsu.webxml.parser.DomParserClass;


public class ServletUserXml extends HttpServlet  {
	
	private static final String FILE_NAME = null;

	//private static final String lastname = null;
	//private static String FILE_NAME ="data/class.xml";
	//List<ListStudent> list = new ArrayList<>();
	
	 public void doGet(HttpServletRequest request, HttpServletResponse response)
			    throws IOException, ServletException {
		 
		 response.setContentType("text/html");
		// Set standard HTTP/1.1 no-cache headers.
		 response.setHeader("Cache-Control", "private, no-store, no-cache, must-revalidate");

		 // Set standard HTTP/1.0 no-cache header.
		 response.setHeader("Pragma", "no-cache");
	    	PrintWriter writer = response.getWriter();
	    	List<User> list = DomParser.builderUsers();
	    	List<Student> listStudent = DomParserClass.builderUsers();
	    	if(listStudent !=null);
	    	for (int i = 0; i < listStudent.size(); i++) {
				System.out.println("stud["+i+"]="+listStudent.get(i).toString());
			}
	    	try {
	    		writer.println("<h2>Welcome User1 Domparser</h2>");
                writer.println("");	
	           	writer.println("list size stud"); 
	           // 	writer.println(list);
	           //	writer.println(list.toString());
	           	
	           	//writer.println("list student size");
	           	System.out.println("good");
	           	for (int i = 0; i < listStudent.size(); i++) {
	           		String temp = "stud["+i+"]="+listStudent.get(i).toString();
					writer.println(temp);
				}
	        	writer.println(listStudent.toString());
	        } finally {
	            writer.close();  
	        }
	 }
}