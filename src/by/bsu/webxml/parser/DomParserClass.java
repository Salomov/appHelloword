/*
 * https://www.tutorialspoint.com/java_xml/java_dom_parse_document.htm
 */

package by.bsu.webxml.parser;

import java.io.File;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;


import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import by.bsu.webxml.entity.ListStudent;
import by.bsu.webxml.entity.Student;


public class DomParserClass {
	
	private static final String lastname = null;
	private static String FILE_NAME ="c:\\Users\\Admin\\eclipse-workspace\\xmlstudents\\data\\class.xml";
	
	
	public static List<Student> builderUsers() {
		
			List<ListStudent> list = new ArrayList<>();
			List<Student> listStudent = new ArrayList<>();
		try {
			
			
			File inputFile = new File(FILE_NAME);
			DocumentBuilderFactory dbFactory = DocumentBuilderFactory.newInstance();
			DocumentBuilder dBuilder = dbFactory.newDocumentBuilder();
			Document doc = dBuilder.parse(inputFile);
			doc.getDocumentElement().normalize();
			System.out.println("Root element :" + doc.getDocumentElement().getNodeName());
			NodeList nList = doc.getElementsByTagName("student");
			System.out.println("----------------------------");
			for (int temp = 0; temp < nList.getLength(); temp++) {
				Node nNode = nList.item(temp);
				System.out.println("\nCurrent Element :" + nNode.getNodeName());
				if (nNode.getNodeType() == Node.ELEMENT_NODE) {
					Element eElement = (Element) nNode;
					Student student = new Student(FILE_NAME, FILE_NAME, FILE_NAME, FILE_NAME, temp);
					student.setFirstname(eElement.getElementsByTagName("firstname").item(0).getTextContent());
				    student.setLastname(eElement.getElementsByTagName("lastname").item(0).getTextContent());
					student.setNickname(eElement.getElementsByTagName("nickname").item(0).getTextContent());
					student.setMarks(eElement.getElementsByTagName("marks").item(0).getTextContent());
					System.out.println(student.toString());
					System.out.println("Student roll no : " + eElement.getAttribute("rollno"));
					student.setRollno(Integer.valueOf(eElement.getAttribute("rollno")));
					listStudent.add(student);
					//System.out.println("Student roll no : " + eElement.getAttribute("rollno"));
				    //Student st = new Student();
					//System.out.println(
					//"First Name : " 
		    //student. eElement.getElementsByTagName("firstname").item(0).getTextContent());
			//System.out.println(
				//	"Last Name : " + eElement.getElementsByTagName("lastname").item(0).getTextContent());
				}
			}
//			for (int i = 0; i < listStudent.size(); i++) {
//				System.out.println("stud["+i+"]="+listStudent.get(i).toString());
//			}
			return listStudent;
		} catch (Exception e) {
			e.printStackTrace();
			return null;
		}
		
	}
}

