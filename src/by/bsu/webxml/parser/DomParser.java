package by.bsu.webxml.parser;

import java.io.File;
import java.io.IOException;
import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

import by.bsu.webxml.entity.User;



public class DomParser {
	public static List<User> builderUsers() {	
		File file = new File("data/user.xml");
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document document = builder.parse(file);
			Element usersElement = (Element) document.getElementsByTagName("users").item(0);
			String department = usersElement.getAttribute("department");
			NodeList userNodeList = document.getElementsByTagName("user");
			System.out.println("----------------------------");
			List<User> userList = new ArrayList<User>();
			//List<ListStudent> userList = new ArrayList<>();
			System.out.println("------------2----------------");
			for (int i 	= 0; 1<userNodeList.getLength(); i++) {
				if(userNodeList.item(1).getNodeType()== Node.ELEMENT_NODE) { 
					Element userElement = (Element) userNodeList.item(1);
					
					User user = new User();
					user.setDepartment(department);
					user.setPassword(String.valueOf(userElement.getAttribute("number")));
					
					NodeList childNodes = userElement.getChildNodes();
					for (int j = 0; j<childNodes.getLength();j++) {
						if(childNodes.item(j).getNodeType()== Node.ELEMENT_NODE) {
					    Element childElement = (Element) childNodes.item(j);
					    
					    switch(childElement.getNodeName()) {
					    case"lastname":{
					    	user.setLastname(childElement.getTextContent());
					    }break;
					    case"firstname":{
					    	user.setFirstname(childElement.getTextContent());
				        }break;
					    case"patronymic":{
					    	user.setPatronymic(childElement.getTextContent());
					    }break;
					    case"email":{
					    	user.setEmail(childElement.getTextContent());
					    }break;
					    case"phone":{
					    	user.setPhone(Long.valueOf(childElement.getTextContent()));
					    }break;
					    case"city":{
					    	user.setCity(childElement.getTextContent());
					    }break;
					    case"picture":{
					    	user.setPicture(childElement.getTextContent());
					    }break;
					    case"Date":{
					    	user.setDate(Date.valueOf(childElement.getTextContent()));
					    }break;
					    case"user_info_id":{
					    	user.setUser_info_id(Integer.valueOf(childElement.getTextContent()));
					    }break;
					    case"text":{
					    	user.setText(childElement.getTextContent());
					    }break;
                        case"path_img":{
					    	user.setPath_img(childElement.getTextContent());
					    }break;
                        case"price":{
					    	user.setPrice(Integer.valueOf(childElement.getTextContent()));
					    }break;
                        case" status":{
	                        user.setStatus(Boolean.valueOf(childElement.getTextContent()));
                        }break;
                        case"isSell":{
	                        user.setIsSell(Boolean.valueOf(childElement.getTextContent()));
                        }break;
                        case"category_id;":{
  	                        user.setCategory_id(Integer.valueOf(childElement.getTextContent()));
                        }break;
                       
					    }
					    
					    							    		
						}
					}
					userList.add(user);
				}
			}
			userList.forEach(System.out::println);
			System.out.println("------------3----------------");
			return userList;
			
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
		

	}

}


